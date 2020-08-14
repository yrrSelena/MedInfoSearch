<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%--<%--%>
<%--pageContext.setAttribute("path",request.getContextPath());--%>
<%--%>--%>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">

<html>

<head>

    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">

    <title>食品中致癌物识别特征谱信息检索</title>
    <meta name="keywords" content="食品致癌物查询" />
    <meta name="description" content="查询食品致癌物物化性质、cas编号等" />

    <link href="static/inspinia/css/bootstrap.min.css" rel="stylesheet">
    <link href="static/inspinia/font-awesome/css/font-awesome.css" rel="stylesheet">
    <link href="static/inspinia/css/animate.css" rel="stylesheet">
    <link href="static/inspinia/css/style.css" rel="stylesheet">
    <%--sweet alert--%>
    <link href="static/inspinia/css/plugins/sweetalert/sweetalert.css" rel="stylesheet">

</head>

<body class="top-navigation">
<div id="wrapper">
    <div id="page-wrapper" class="gray-bg">
        <div class="row border-bottom white-bg">
            <nav class="navbar navbar-static-top" role="navigation">
				<div class="navbar-header">
					<button aria-controls="navbar" aria-expanded="false"
						data-target="#navbar" data-toggle="collapse"
						class="navbar-toggle collapsed" type="button">
						<i class="fa fa-reorder"></i>
					</button>
					<a href="#" class="navbar-brand">食品中致癌物识别特征谱信息检索系统</a>
				</div>

				<div class="navbar-collapse collapse" id="navbar">
					<ul class="nav navbar-nav">
						<li class="active"><a aria-expanded="false" role="button"
							href="index.jsp"> 信息检索 </a></li>

					</ul>
					<ul class="nav navbar-top-links navbar-right" id="ulRight">
                        <c:choose>
                        <c:when test="${username == null or username==''}">
                        <li>
                        <a href="login.jsp">
                        <i class="fa fa-sign-in"></i>登录
                        </a>
                        </li>
                        </c:when>
                        <c:otherwise>
                        <li>
                        你好，<strong>${username} </strong>！
                        </li>
                        <li>
                        <a href="loginout">
                        <i class="fa fa-sign-out"></i>登出
                        </a>
                        </li>

                        </c:otherwise>
                        </c:choose>


                    </ul>
				</div>
				<!----> </nav>
        </div>
        <div class="wrapper wrapper-content">
            <div class="container">

                <div class="row">
                    <div class="col-lg-6 col-lg-offset-3">
                        <div class="text-center">
                            <div class="ibox float-e-margins">
                                <!--简易检索表单创建-->
                                <form action="easySearch" method="post" id="easySearchForm">

                                    <div class="input-group">
                                        <input type="text" id="keyword_input" name="keyword" autocomplete="off" data-provide="typeahead" class="form-control"  placeholder="食品致癌物的中文名称/英文名称/CAS号/EC号等"  required>
                                        <span class="input-group-btn"><button onclick="submitEasySearchForm()" class="btn btn-primary">检索</button></span>

                                    </div>

                                </form>
                                <%--<form action="/easySearch">--%>
                                    <%--<div class="input-group">--%>
                                        <%--<input type="text" id="keyword_input" name="keyword" autocomplete="off" data-provide="typeahead" class="form-control"  placeholder="药物中文名称/英文名称/CAS号/EC号等"  required>--%>
                                        <%--<span class="input-group-btn"><button type="submit" class="btn btn-primary">检索</button></span>--%>
                                    <%--</div>--%>
                                <%--</form>--%>
                            </div>
                        </div>
                    </div>

                    <div class="col-lg-12">
                        <div class="ibox float-e-margins">
                            <div class="ibox-content">
                                <h3>
                                    已为您找到${medBriefList.size()}个相关结果
                                </h3>
                                <!--
                                <small>请求时间 (0.23 秒)</small>
                                -->
                                <div class="hr-line-dashed"></div>

                                <table class="table">
                                    <thead>
                                        <tr>
                                            <th>中文名称</th>
                                            <th>中文别名</th>
                                            <th>英文名称</th>
                                            <th>英文别名</th>
                                            <th>分子式</th>
                                            <th>分子量</th>
                                            <th>cas号</th>
                                            <th>ec号</th>
                                            <th>检测方法</th>
                                        </tr>
                                    </thead>
                                    <tbody>
                                        <c:forEach items="${medBriefList}" var="briefInfo">
                                            <tr>
                                                <td><a href="getDetail?medId=${briefInfo.medId}">${briefInfo.cnName}</a></td>
                                                <td>
                                                    <c:if test="${briefInfo.cnAlias.size()>0}">
                                                        <c:forEach items="${briefInfo.cnAlias}" var="cnAlias">
                                                            <span class="attr_value">${cnAlias}</span><br/>
                                                        </c:forEach>
                                                    </c:if>
                                                </td>
                                                <td>
                                                    <c:if test="${briefInfo.enName.size()>0}">
                                                        <c:forEach items="${briefInfo.enName}" var="enName">
                                                            <span class="attr_value">${enName}</span><br/>
                                                        </c:forEach>
                                                    </c:if>
                                                </td>
                                                <td>
                                                    <c:if test="${briefInfo.enAlias.size()>0}">
                                                        <c:forEach items="${briefInfo.enAlias}" var="enAlias">
                                                            <span class="attr_value">${enAlias}</span><br/>
                                                        </c:forEach>
                                                    </c:if>
                                                </td>
                                                <td>
                                                    <c:if test="${briefInfo.formula.size()>0}">
                                                        <c:forEach items="${briefInfo.formula}" var="formula">
                                                            <span class="attr_value">${formula}</span><br/>
                                                        </c:forEach>
                                                    </c:if>
                                                </td>
                                                <td>${briefInfo.molWt}</td>
                                                <td>${briefInfo.casNum}</td>
                                                <td>${briefInfo.ecNum}</td>
                                                <td><c:forEach items="${briefInfo.testMethods}" var="testMethod">
                                                        <a href="getMethodDetail?medId=${briefInfo.medId}&method=${testMethod}">${testMethod}</a><br/>
                                                 </c:forEach>
                                                </td>
                                            </tr>
                                        </c:forEach>
                                    </tbody>
                                </table>
                                <!--
                                <div class="text-center">
                                    <div class="btn-group">
                                        <button class="btn btn-white" type="button"><i class="fa fa-chevron-left"></i></button>
                                        <button class="btn btn-white">1</button>
                                        <button class="btn btn-white  active">2</button>
                                        <button class="btn btn-white">3</button>
                                        <button class="btn btn-white">4</button>
                                        <button class="btn btn-white">5</button>
                                        <button class="btn btn-white">6</button>
                                        <button class="btn btn-white">7</button>
                                        <button class="btn btn-white" type="button"><i class="fa fa-chevron-right"></i> </button>
                                    </div>
                                </div>
                                -->
                            </div>
                        </div>
                    </div>


                </div>
            </div>
        </div>
        <div class="footer">
            <div>
                <!--<strong>Copyright</strong> YRR &copy; 2018-9-->
            </div>
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

<!--typeahead检索自动补全-->
<script src="static/js/bootstrap3-typeahead.js"></script>

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

    $(function () {
        //简易检索中显示历史检索记录
        $('#keyword_input').typeahead('destroy');
        $('#keyword_input').typeahead({
            //利用ajax获得后台数据 生成自动补全标签
            source: function (request, response) {
                $.ajax({
                	type : "POST",
					url : "getHistory",
					success : function(data) {
						//var res = data.split(",");
						//response(res);
						console.log(data);
						var res = [];
						var jsonArr = JSON.parse(data);
						for (var i = 0; i < jsonArr.length; i++) {
							res.push(jsonArr[i].value); //取json中的值
						}
						response(res);
                    }
                })
            },//数据源
            fitToElement: true,//和输入框的大小保持一致
            autoSelect: false,
            items: 8,//最多显示个数
            minLength: 0,
            showHintOnFocus: true//当输入框获得焦点时立刻显示提示
        });
    })

    //提交简易检索的表单
    function submitEasySearchForm() {
        var keyword = $("#keyword_input1").innerText;
        var err = 0;
        if(keyword=="" || keyword==null)
        {
            err = 1;
        }
        else{
            document.getElementById("easySearchForm").submit();
        }
    }

</script>
</body>

</html>

