<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>



<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">


<html>

<head>

    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">

    <title>药物信息管理系统</title>
    <meta name="keywords" content="药物查询" />
    <meta name="description" content="查询药物物化性质、cas编号等" />

    <link href="static/inspinia/css/bootstrap.min.css" rel="stylesheet">
    <link href="static/inspinia/font-awesome/css/font-awesome.css" rel="stylesheet">
    <link href="static/inspinia/css/animate.css" rel="stylesheet">
    <link href="static/inspinia/css/style.css" rel="stylesheet">

    <script type="text/javascript" src="js/jquery.min.js"></script>
    <script type="text/javascript" src="js/jquery.autocomplete.min.js"></script>


    <link rel="Stylesheet" href="js/css/jquery.autocomplete.css" />


</head>

<body class="top-navigation">
<div id="wrapper">
    <div id="page-wrapper" class="gray-bg">
        <div class="row border-bottom white-bg">
            <nav class="navbar navbar-static-top" role="navigation">
                <div class="navbar-header">
                    <button aria-controls="navbar" aria-expanded="false" data-target="#navbar" data-toggle="collapse" class="navbar-toggle collapsed" type="button">
                        <i class="fa fa-reorder"></i>
                    </button>
                    <a href="#" class="navbar-brand">Medicine Search</a>
                </div>

                <div class="navbar-collapse collapse" id="navbar">
                    <ul class="nav navbar-nav">
                        <li class="active">
                            <a aria-expanded="false" role="button" href="#"> 首页 </a>
                        </li>

                    </ul>
                    <%--<ul class="nav navbar-top-links navbar-right">--%>
                    <%--<li>--%>
                    <%--<a href="login.html">--%>
                    <%--<i class="fa fa-sign-out"></i> 注销--%>
                    <%--</a>--%>
                    <%--</li>--%>
                    <%--</ul>--%>
                </div>
                <!---->
            </nav>
        </div>
        <div class="wrapper wrapper-content">
            <div class="container">
                <h1 class="text-center logo-name">Search</h1>
                <div class="row">
                    <!--简单搜索-->
                    <div class="col-lg-6 col-lg-offset-3">
                        <div class="ibox float-e-margins">
                            <!--简单搜索表单创建-->
                            <form action="/easySearch" id="easySearchForm">

                                <div class="input-group">
                                    <input type="text" id="keyword_input" name="keyword" autocomplete="off" data-provide="typeahead" class="form-control"  placeholder="药物中文名称/英文名称/CAS号/EC号等"  required>
                                    <%--<div  id="easySearchDiv">--%>
                                    <%--<ul id="easySearchUl">--%>

                                    <%--</ul>--%>
                                    <%--</div>--%>
                                    <input type="hidden" id="create_time" name="create_time">
                                    <span class="input-group-btn"><button onclick="submitEasySearchForm()" class="btn btn-primary int_2">搜索</button></span>

                                </div>

                            </form>
                        </div>
                    </div>
                    <!--高级搜索-->
                    <div class="col-lg-8 col-lg-offset-2">
                        <div class="ibox float-e-margins">
                            <div class="ibox-title">
                                <h4>高级搜索</h4>
                            </div>
                            <div class="ibox-content">
                                <div class="pull-right">
                                    <button id="btn_addRow" title="添加行" class="btn btn-white btn-xl" type="submit"  onclick="addRow()" ><strong>+</strong></button>
                                    <button id="btn_deleteRow" title="删除行" class="btn btn-white btn-xl" type="submit" onclick="deleteRow()"><strong>-</strong></button>
                                </div>

                                <!--高级搜索表单创建-->
                                <form action="/complexSearch" method="post" class="form-horizontal" id="complexSearchForm">
                                    <!--隐藏标签，用于保存新生成的input 初始值为1-->
                                    <input type="hidden" id="cnt_CSForm" value="1">

                                    Cookie和session区别,cookie怎么保存个人信息                     <input type="hidden" id="cnName" name="cnName" value="">
                                    <input type="hidden" id="cnAlias" name="cnName" value="">
                                    <input type="hidden" id="enName" name="enName" value="">
                                    <input type="hidden" id="enAlias" name="enName" value="">
                                    <input type="hidden" id="casNum" name="casNum" value="">
                                    <input type="hidden" id="ecNum" name="ecNum" value="">

                                    <input type="hidden" id="submit_txt" name="submit_txt" value="">
                                    <input type="hidden" id="submit_oper" name="submit_oper" value="">

                                    <div id="divForm" class="col-lg-12 col-lg-offset-2">
                                        <div class="form-group col-lg-12" id="formGroup1">
                                            <div class="col-lg-5" >
                                                <input type="text" class="form-control input-search" id="formInput1" autocomplete="off" data-provide="typeahead" required >
                                                <div id="context1"></div>
                                            </div>
                                            <div class="input-group-btn " >
                                                <div data-toggle="dropdown" class="btn btn-white dropdown-toggle" type="button" aria-expanded="false" >
                                                    <span class="buttonText1">中文名称</span>
                                                    <span class="caret"></span>
                                                </div>
                                                <ul class="dropdown-menu" role="menu" >
                                                    <%
                                                        String[] opt_text = new String[] { "中文名称","中文别名", "英文名称", "英文别名", "CAS号","EC号" };
                                                        pageContext.setAttribute("opt_text", opt_text);
                                                    %>
                                                    <c:forEach items="${pageScope.opt_text}" var="opt1">
                                                        <li><a href="#" onclick="show('buttonText',1,$(this).text())">${opt1}</a></li>
                                                        <%--<li><a href="#" id="li1" onclick="show($('.buttonText1'),$(this).text())">${opt1}</a></li>--%>
                                                    </c:forEach>
                                                </ul>
                                            </div>
                                        </div>
                                    </div>
                                    <div class="form-group">
                                        <div class="col-lg-4 col-lg-offset-5">
                                            <button id ="search_btn" class="btn btn-primary" onclick="submitForm()">搜索</button>
                                            <%--<button id="search_btn" class="btn btn-primary" type="submit">搜索</button>--%>
                                        </div>
                                    </div>
                                </form>



                            </div>
                        </div>
                    </div>
                </div>
            </div>

        </div>
        <div class="footer">
            <div>
                <strong>Copyright</strong> YRR &copy; 2018-9
            </div>
        </div>

    </div>
</div>



<!-- Mainly scripts -->
<script src="static/inspinia/js/jquery/jquery-3.1.1.min.js"></script>
<script src="static/inspinia/js/bootstrap/bootstrap.min.js"></script>
<script src="static/inspinia/js/plugins/metisMenu/jquery.metisMenu.js"></script>
<script src="static/inspinia/js/plugins/slimscroll/jquery.slimscroll.min.js"></script>


<!-- Custom and plugin javascript -->
<script src="static/inspinia/js/inspinia.js"></script>
<script src="static/inspinia/js/plugins/pace/pace.min.js"></script>

<!--typeahead搜索自动补全-->
<script src="static/bootstrap-3.3.7-dist/js/bootstrap3-typeahead.js"></script>

<!-- Flot -->
<script src="static/inspinia/js/plugins/flot/jquery.flot.js"></script>
<script src="static/inspinia/js/plugins/flot/jquery.flot.tooltip.min.js"></script>
<script src="static/inspinia/js/plugins/flot/jquery.flot.resize.js"></script>

<!--Chosen-->
<script src="static/inspinia/js/plugins/chosen/chosen.jquery.js"></script>
<!-- ChartJS-->
<script src="static/inspinia/js/plugins/chartJs/Chart.min.js"></script>

<!-- Peity -->
<script src="static/inspinia/js/plugins/peity/jquery.peity.min.js"></script>
<!-- Peity demo -->
<script src="static/inspinia/js/demo/peity-demo.js"></script>

<!--Sweet alert-->
<script src="static/inspinia/js/plugins/sweetalert/sweetalert.min.js"></script>

<script>
    $(function(){
        $('#keyword_input').typeahead('destroy');
        $('#keyword_input').typeahead({
            //利用ajax获得后台数据 生成自动补全标签
            source: function (request, response) {
                $.ajax({
                    type: "POST",
                    url: "getHistory",
                    success: function (data) {
                        var res = data.split(",");
                        response(res);
                    }
                })
            },//数据源
            autoSelect:false,
            items:8,//最多显示个数
            minLength:0,
            showHintOnFocus:true
        });
    })


    // $(function () {
    //     var keyword_input=document.getElementById("keyword_input");
    //     //聚焦
    //     keyword_input.onfocus=function () {
    //         var ul = document.getElementById("easySearchUl");
    //         while (ul.hasChildNodes()) //当div下还存在子节点时 循环继续
    //         {
    //             ul.removeChild(ul.firstChild);
    //         }
    //         ul.style.display = "block";
    //         $.ajax({
    //             type:"POST",
    //             url:"getHistory",
    //             success:function (data) {
    //                 var res=data.split(",");
    //                 for( var i in res)
    //                 {
    //                     var li = document.createElement("li");
    //                     li.style.display="block";
    //                     var litext = document.createTextNode(res[i]);
    //                     li.appendChild(litext);
    //                     ul.appendChild(li);
    //                 }
    //
    //             }
    //         })
    //         $("easySearchUl").on("click","li",function(){
    //             alert($(this).text());
    //         });
    //
    //     }
    //
    //     //失焦
    //     keyword_input.onblur=function(){
    //         var sj= document.getElementById("easySearchUl");
    //         sj.style.display="none";
    //     }
    // })

    //var create_time= new Date().getTime();

    //自动补全
    // $(function () {
    //     var tags=[
    //         "福尔马林",
    //         "English",
    //         "Spanish"
    //     ];
    //     $('#language').autocomplete="on";
    //     $('#language').typeahead({
    //         source:tags
    //     });
    // })

    /*
    $(".input-search").keyup(function(){
        var content=$(this).val();
        if(content==""){
            $("#context1").css("display","none")
            return;
        }
        var time=new Date().getTime();
        $.ajax({
            type:"get",
            url:"/findRelated",
            data:{cnAlias:content,time:time},
            success:function (data) {
                var res=data.split(",");
                var html="";
                for(var i=0;i<res.length;i++){
                    //每一个div还有鼠标移出、移入点击事件
                    html+="<div onclick='setSearch_onclick(this)' onmouseout='changeBackColor_out(this)' onmouseover='changeBackColor_over(this)'>"+res[i]+"</div>";
                }
                $("#context1").html(html);
                //显示为块级元素
                $("#context1").css("display","block");
            }

        })
    })
    function changeBackColor_over(div){
        $(div).css("background-color","#CCCCCC");
    }
    //鼠标离开内容
    function changeBackColor_out(div){
        $(div).css("background-color","");
    }
    //将点击的内容放到搜索框
    function setSearch_onclick(div){
        $(".input-search").val(div.innerText);
        $("#context1").css("display","none");
    }
*/

    function submitEasySearchForm() {
        document.getElementById("easySearchForm").submit();
    }
    //提交表单
    function submitForm(){
        var cnt_now = parseInt($("#cnt_CSForm").val());
        var submit_txt = new String("");
        var submit_oper = new String("");
        var err = 0;
        for(var i=1; i<=cnt_now;i++){

            if(document.getElementById(formInput).value=="")
            {
                err = 1;break;
            }

            var buttonText = new String("buttonText"+i);
            var txt = $("."+buttonText).text();
            var err = 0;
            var formInput= new String("formInput"+i);

            //逻辑运算符
            if(i>1)
            {
                var buttonOperator = new String("buttonOperator"+i);
                var txt_operator = $("."+buttonOperator).text();
                switch(txt_operator)
                {
                    case "AND":
                        submit_oper = submit_oper + "&";
                        break;
                    case "OR":
                        submit_oper = submit_oper + "|";
                        break;
                    case "NOT":
                        submit_oper = submit_oper + "!";
                        break;
                    default:
                        err = 1; break;
                }

            }
            //
            switch(txt){
                case "中文名称":
                    submit_txt = submit_txt + "cnName=" + document.getElementById(formInput).value + ";";
                    break;
                case "中文别名":
                    submit_txt = submit_txt + "cnAlias=" + document.getElementById(formInput).value + ";";
                    break;
                case "英文名称":
                    submit_txt = submit_txt + "enName=" + document.getElementById(formInput).value + ";";
                    break;
                case "英文别名":
                    submit_txt = submit_txt + "enAlias=" + document.getElementById(formInput).value + ";";
                    break;
                case "CAS号":
                    submit_txt = submit_txt + "casNum=" + document.getElementById(formInput).value + ";";
                    break;
                case "EC号":
                    submit_txt = submit_txt + "ecNum=" + document.getElementById(formInput).value + ";";
                    break;
                default:
                    err=1;break;
            }

        }
        if(err==0)
        {
            $("#submit_txt").val(submit_txt);
            $("#submit_oper").val(submit_oper);
            document.getElementById("complexSearchForm").submit();
        }
        // else{
        //     alert("请填写查询信息");
        // }

    }
    /*
    function submitForm(){
        var cnt_now = parseInt($("#cnt_CSForm").val());
        for(var i=1; i<=cnt_now;i++){
            var buttonText = new String("buttonText"+i);
            var txt = $("."+buttonText).text();
            var err = 0;
            var formInput= new String("formInput"+i);
            switch(txt){
                case "中文名称":
                    $("#cnName").val(document.getElementById(formInput).value);
                    break;
                case "中文别名":
                    $("#cnAlias").val(document.getElementById(formInput).value);
                    break;
                case "英文名称":
                    $("#enName").val(document.getElementById(formInput).value);
                    break;
                case "英文别名":
                    $("#enAlias").val(document.getElementById(formInput).value);
                    break;
                case "CAS号":
                    $("#casNum").val(document.getElementById(formInput).value);
                    break;
                case "EC号":
                $("#ecNum").val(document.getElementById(formInput).value);
                    break;
                default:
                    err=1;break;
            }

        }
        if(err==0)
        {
            document.getElementById("complexSearchForm").submit();
        }
        else{
            alert("请选择查询字段");
        }

    }
    */


    //获得自动补全标签
    // function getTags(txt) {
    //     var tags=[];
    //     switch(txt){
    //         case "中文名称":
    //             tags=[
    //                 "福尔马林",
    //                 "林丹"
    //             ];
    //             break;
    //         case "英文名称":
    //             tags=[
    //                 "form",
    //                 "ha"
    //             ];
    //             //alert(tags);
    //             break;
    //         default:
    //             break;
    //     }
    //     return tags;
    // }

    //回显下拉框中显示的信息
    function show(btn_class,btn_num, txt){
        $('.'+btn_class+btn_num).text(txt);
        if(btn_class=='buttonText') {
            //var tags = getTags(txt);
            var formInput = "formInput" + btn_num;
            $('#' + formInput).typeahead('destroy');
            $('#' + formInput).typeahead({
                //利用ajax获得后台数据 生成自动补全标签
                source: function (request, response) {
                    $.ajax({
                        type:"POST",
                        url:"findRelated",
                        data:{"autoDataType":txt},
                        success:function(data){
                            var res=data.split(",");
                            response(res);
                        }
                    })

                },//数据源
                items:8,//最多显示个数
                minLength:0,
                showHintOnFocus:true
            });
            // $('#' + formInput).typeahead({
            //     source: tags,//数据源
            //     items:8//最多显示个数
            // });
        }
        else{

        }
    }

    //删除搜索词条
    function deleteRow() {
        var cnt_now = parseInt($("#cnt_CSForm").val());
        if(cnt_now>1) {
            var cnt_after = cnt_now - 1;
            $("#cnt_CSForm").val(cnt_after);
            var m = document.getElementById("formGroup"+cnt_now);
            m.parentNode.removeChild(m);
        }
        else{
            alert("无法删除");
        }
    }

    //增加搜索词条
    function addRow(){
        var cnt_now = parseInt($("#cnt_CSForm").val());
        if(cnt_now<5) {
            var cnt_after = cnt_now + 1;
            $("#cnt_CSForm").val(cnt_after);
            //运算符下拉选项
            var buttonOperator = new String("buttonOperator"+cnt_after);
            var opt_operator =["AND", "OR", "NOT"];
            var dropdown_menu_operator ="";
            for(var i in opt_operator){
                dropdown_menu_operator = dropdown_menu_operator + "<li><a href=\"#\" onclick=\"$('.'+'"+buttonOperator+"').text($(this).text())\">"+opt_operator[i]+"</a></li>\n";
            }

            //字段下拉选项
            var buttonText = new String("buttonText"+cnt_after);
            var opt_text =[ "中文名称","中文别名", "英文名称", "英文别名", "CAS号","EC号"];
            var dropdown_menu_text ="";
            for(var k in opt_text){
                dropdown_menu_text = dropdown_menu_text + "<li><a href=\"#\" onclick=\"show('buttonText',"+cnt_after+",$(this).text())\">"+opt_text[k]+"</a></li>\n";
            }

            var item="<div class=\"form-group col-lg-11\" id=\"formGroup"+cnt_after+"\">\n" +
                "<div class=\"input-group-btn col-lg-2 \">" +
                "<div data-toggle=\"dropdown\" class=\"btn btn-white dropdown-toggle\" type=\"button\" aria-expanded=\"false\" >"+
                "<span class="+buttonOperator+">AND</span><span class=\"caret\"></span></div>"+
                "<ul class=\"dropdown-menu\" role=\"menu\">\n" + dropdown_menu_operator +
                "</ul></div>"+
                "<div class=\"col-lg-4 col-lg-offset-1\"><input type=\"text\" class=\"form-control\" id=\"formInput"+cnt_after+"\" autocomplete='off' required></div>\n" +
                "<div class=\"input-group-btn\">\n" +
                "<div data-toggle=\"dropdown\" class=\"btn btn-white dropdown-toggle\" type=\"button\" aria-expanded=\"false\">\n" +
                "<span class="+buttonText+">中文名称</span><span class=\"caret\"></span></div>\n" +
                "<ul class=\"dropdown-menu\" role=\"menu\">\n" + dropdown_menu_text +
                "</ul></div></div>";
            $("#divForm").append(item);
        }
        else{
            alert("查询关键词过多");
        }
        // "<input type=\"hidden\" name=\"CSForm.Index\" value="+cnt_after+">"+
        //     <div data-toggle="dropdown" class="btn btn-white dropdown-toggle" type="button" aria-expanded="false">
        //     <span class="buttonText1">全部字段</span>
        //     <span class="caret"></span>
        //     </div>
        //     <ul class="dropdown-menu" role="menu" >
        //     <li><a href="#" onclick="$('.buttonText1').text($(this).text())">全部字段</a></li>
        // <li><a href="#" onclick="$('.buttonText1').text($(this).text())">中文名称</a></li>
        // <li><a href="#" onclick="$('.buttonText1').text($(this).text())">英文名称</a></li>
        // <li><a href="#" onclick="$('.buttonText1').text($(this).text())">cas号</a></li>
        // <li><a href="#" onclick="$('.buttonText1').text($(this).text())">ec号</a></li>
        // </ul>
        // </div>
    }
</script>



</body>

</html>