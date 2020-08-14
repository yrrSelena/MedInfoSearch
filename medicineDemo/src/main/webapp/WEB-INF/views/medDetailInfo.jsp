<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%
    pageContext.setAttribute("path",request.getContextPath());
%>

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
                                <!--简易搜索表单创建-->
                                <form action="easySearch" method="post" id="easySearchForm">

                                    <div class="input-group">
                                        <input type="text" id="keyword_input" name="keyword" autocomplete="off" data-provide="typeahead" class="form-control"  placeholder="食品致癌物的中文名称/英文名称/CAS号/EC号等"  required>
                                        <span class="input-group-btn"><button onclick="submitEasySearchForm()" class="btn btn-primary">检索</button></span>

                                    </div>

                                </form>
                                <%--<div class="input-group">--%>
                                    <%--<input type="text" name="keyword" class="form-control" placeholder="药物中文名称/英文名称/CAS号/EC号等" required>--%>
                                    <%--<span class="input-group-btn"><button type="submit" class="btn btn-primary">搜索</button></span>--%>
                                <%--</div>--%>
                            </div>
                        </div>
                    </div>

                    <div class="col-lg-12">
                        <div class="ibox">
                            <div class="ibox-content">
                                <div class="text-center title">
                                    <h1><strong>${detailInfo.briefInfo.cnName} </strong></h1>
                                </div>
                                <div class="hr-line-dashed"></div>


                                <%--<div class="col-sm-9">--%>
                                <div class="row">
                                    <div class="col-lg-9 col-lg-offset-2">
                                        <h3><span class="label label-primary">1</span> &nbsp;&nbsp;基础信息</h3>

                                        <div class="col-lg-5">
                                            <table class="table" >
                                                <tbody>
                                                <tr>
                                                    <th>【中文名称】</th>
                                                    <td>
                                                        ${detailInfo.briefInfo.cnName}
                                                    </td>
                                                </tr>
                                                <tr>
                                                    <th>【中文别名】</th>
                                                    <td>
                                                        <c:if test="${detailInfo.briefInfo.cnAlias.size()>0}">
                                                            <c:forEach items="${detailInfo.briefInfo.cnAlias}" var="cnAlias">
                                                                <span class="attr_value">${cnAlias}</span>
                                                            </c:forEach>
                                                        </c:if>
                                                    </td>
                                                </tr>
                                                <tr>
                                                    <th>【英文名称】</th>
                                                    <td>
                                                    <c:if test="${detailInfo.briefInfo.enName.size()>0}">
                                                        <c:forEach items="${detailInfo.briefInfo.enName}" var="enName">
                                                        <span class="attr_value">${enName}</span>
                                                        </c:forEach>
                                                    </c:if>
                                                    </td>
                                                </tr>

                                                <tr>
                                                    <th>【英文别名】</th>
                                                    <td>
                                                        <c:if test="${detailInfo.briefInfo.enAlias.size()>0}">
                                                        <c:forEach items="${detailInfo.briefInfo.enAlias}" var="enAlias">
                                                        <span class="attr_value">${enAlias}</span>
                                                        </c:forEach>
                                                        </c:if>
                                                    </td>
                                                </tr>
                                                </tbody>
                                            </table>
                                        </div>
                                        <div class="col-lg-5">
                                            <table class="table" >
                                                <tbody>
                                                <tr>
                                                    <th>【分子式】</th>
                                                    <td>
                                                        <c:if test="${detailInfo.briefInfo.formula.size()>0}">
                                                        <c:forEach items="${detailInfo.briefInfo.formula}" var="formula">
                                                        <span class="attr_value">${formula}</span>
                                                        </c:forEach>
                                                        </c:if>
                                                    </td>
                                                </tr>
                                                <tr>
                                                    <th>【分子量】</th>
                                                    <td>
                                                        ${detailInfo.briefInfo.molWt}
                                                    </td>
                                                </tr>
                                                <tr>
                                                    <th>【cas号】</th>
                                                    <td>
                                                        ${detailInfo.briefInfo.casNum}
                                                    </td>
                                                </tr>

                                                <tr>
                                                    <th>【ec号】</th>
                                                    <td>
                                                        ${detailInfo.briefInfo.ecNum}
                                                    </td>
                                                </tr>
                                                </tbody>
                                            </table>
                                        </div>

                                    </div>
                                </div>
                                <div class="row">
                                    <div class="col-lg-9 col-lg-offset-2"><!--well-->
                                        <div class="hr-line-dashed"></div>
                                        <h3><span class="label label-primary">2</span>&nbsp;&nbsp;物理化学性质</h3>
                                        <div class="table" >
                                            <table class="table-condensed" width="100%">
                                                <tbody>
                                                <tr>
                                                    <th width="15%">【熔点】</th>
                                                    <td>
                                                        <c:if test="${detailInfo.mpmin!=null && !detailInfo.mpmin.equals(\"\")}">
                                                            <c:set var="mpmin" value="${Float.parseFloat(detailInfo.mpmin)}"/>
                                                            <c:set var="mpmax" value="${Float.parseFloat(detailInfo.mpmax)}"/>
                                                            <c:choose>
                                                                <c:when test="${ mpmin==mpmax }">
                                                                    ${mpmin}
                                                                </c:when>
                                                                <c:otherwise>
                                                                    ${mpmin}-${mpmax}
                                                                </c:otherwise>
                                                            </c:choose>
                                                        </c:if>
                                                    </td>
                                                </tr>
                                                <tr>
                                                    <th>【沸点】</th>
                                                    <td>
                                                        <c:if test="${detailInfo.bpmin!=null&& !detailInfo.bpmin.equals(\"\")}">
                                                            <c:set var="bpmin" value="${Float.parseFloat(detailInfo.bpmin)}"/>
                                                            <c:set var="bpmax" value="${Float.parseFloat(detailInfo.bpmax)}"/>
                                                            <c:choose>
                                                                <c:when test="${bpmin == bpmax}">
                                                                    ${bpmin}
                                                                </c:when>
                                                                <c:otherwise>
                                                                    ${bpmin}-${bpmax}
                                                                </c:otherwise>
                                                            </c:choose>
                                                        </c:if>
                                                    </td>
                                                </tr>

                                                <tr>
                                                    <th>【外观】</th>
                                                    <td>
                                                        ${detailInfo.appearance}
                                                    </td>
                                                </tr>
                                                <tr>
                                                    <th>【溶解性】</th>
                                                    <td>
                                                        ${detailInfo.solubility}
                                                    </td>
                                                </tr>
                                                <tr>
                                                    <th>【iarc等级】</th>
                                                    <td>
                                                        ${detailInfo.iarc}
                                                    </td>
                                                </tr>
                                                <tr>
                                                    <th>
                                                        【毒性】
                                                    </th>
                                                    <td>
                                                        ${detailInfo.toxicity}
                                                    </td>
                                                </tr>
                                                <tr>
                                                    <th>【简介】</th>
                                                    <td>
                                                        ${detailInfo.introduction}
                                                    </td>
                                                </tr>
                                                </tbody>
                                            </table>
                                        </div>
                                    </div>
                                </div>
                                <div class="row">
                                    <div class="col-lg-9 col-lg-offset-2">
                                        <div class="hr-line-dashed"></div>
                                        <h3><span class="label label-primary">3</span>&nbsp;&nbsp;其它</h3>
                                        <div class="table">
                                            <table class="table-condensed" width="100%" >
                                                <tbody>
                                                <tr>
                                                    <th width="15%">
                                                        【临床特性】
                                                    </th>
                                                    <td>
                                                        ${detailInfo.clinicalCharacter}
                                                    </td>
                                                </tr>
                                                <tr>
                                                    <th>
                                                        【代谢途径】
                                                    </th>
                                                    <td>
                                                        ${detailInfo.metabolicPathway}
                                                    </td>
                                                </tr>
                                                <tr>
                                                    <th>
                                                        【相关食品】
                                                    </th>
                                                    <td>
                                                        ${detailInfo.food}
                                                    </td>
                                                </tr>
                                                
                                                 <c:forEach items="${detailInfo.briefInfo.testMethods}" var="testMethod">
                                                 <tr>
                                                    <th>
                                                        【检测方法】
                                                    </th>
                                                    <td>
                                                        <a href="getMethodDetail?medId=${detailInfo.briefInfo.medId}&method=${testMethod}">${testMethod}</a>
                                                    </td>
                                                </tr>
                                                <tr>
                                                 </c:forEach>
                                                    <th>
                                                        【限量要求】
                                                    </th>
                                                    <td>
                                                        ${detailInfo.limitRequirement}
                                                    </td>
                                                </tr>
                                                </tbody>
                                            </table>
                                        </div>
                                    </div>
                                </div>
                                <div class="clearfix"></div>

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

<!--typeahead搜索自动补全-->
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
        //简易搜索中显示历史搜索记录
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
    // $(document).ready(function(){
    //     $("#search_btn").click(function(){
    //         alert("error");
    //     });
    // });
</script>
</body>

</html>

