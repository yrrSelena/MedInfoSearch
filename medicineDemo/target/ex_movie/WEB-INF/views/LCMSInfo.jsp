<%@ page contentType="text/html;charset=UTF-8" language="java"%>
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

<link href="static/inspinia/css/bootstrap.min.css"
	rel="stylesheet">
<link
	href="static/inspinia/font-awesome/css/font-awesome.css"
	rel="stylesheet">
<link href="static/inspinia/css/animate.css"
	rel="stylesheet">
<link href="static/inspinia/css/style.css"
	rel="stylesheet">
<%--sweet alert--%>
<link
	href="static/inspinia/css/plugins/sweetalert/sweetalert.css"
	rel="stylesheet">

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
						<div class="col-lg-12">
							<div class="ibox float-e-margins">
								<div class="ibox-content">
									<!--
                                <small>请求时间 (0.23 秒)</small>
                                -->
									<div class="hr-line-dashed"></div>

									<table class="table">
										<thead>
											<tr>
												<th>中文名称</th>
												<th>检测方法</th>
												<th>检测器</th>
												<th>色谱柱</th>
												<th>柱温(℃)</th>
												<th>流动相</th>
												<th>进样量(μL)</th>
												<th>离子源</th>
												<th>检测模式</th>
												<th>内标物</th>
												<th>定量离子对1</th>
												<th>定量离子对2</th>
												<th>定量离子对3</th>
												<th>定性离子对1</th>
												<th>定性离子对2</th>
												<th>定性离子对3</th>
												<th>前处理方法</th>
												<th>检出限</th>
												<th>特征图谱</th>
												<th>参考文献</th>
												<th>样品</th>
												<th>其他测定分子</th>
											</tr>
										</thead>
										<tbody>
											<tr>

												<td>${CNName}</td>
												<td>液相色谱质谱法</td>
												<td>${LCMSInfo.detector}</td>
												<td>${LCMSInfo.chromatographicCol}</td>
												<td>${LCMSInfo.colTemperature}</td>
												<td>${LCMSInfo.mobilePhase}</td>
												<td>${LCMSInfo.injectionVolume}</td>
												<td>${LCMSInfo.icoSource}</td>
												<td>${LCMSInfo.detectionMode}</td>
												<td>${LCMSInfo.interStandardSub}</td>
												<td>${LCMSInfo.quantitativeIonPair1}</td>
												<td>${LCMSInfo.quantitativeIonPair2}</td>
												<td>${LCMSInfo.quantitativeIonPair3}</td>
												<td>${LCMSInfo.qualitativeIonPair1}</td>
												<td>${LCMSInfo.qualitativeIonPair2}</td>
												<td>${LCMSInfo.qualitativeIonPair3}</td>
												<td>${LCMSInfo.pretreatmentMethod}</td>
												<td>${LCMSInfo.detectionLimit}</td>
												<td><a target="_blank"
													href="static/特征谱数据库/液相色谱质谱法/特征谱/${LCMSInfo.featureMap}.jpg">${LCMSInfo.featureMap}</a></td>
												<td><a target="_blank"
													href="static/特征谱数据库/液相色谱质谱法/参考文献/${LCMSInfo.featureMap}.pdf">${LCMSInfo.reference}</a></td>
												<td>${LCMSInfo.samples}</td>
												<td>${LCMSInfo.otherDeterminants}</td>
											</tr>
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
	<script
		src="static/inspinia/js/jquery/jquery-3.1.1.min.js"></script>
	<script src="static/inspinia/js/bootstrap/bootstrap.min.js"></script>
	<script
		src="static/inspinia/js/plugins/metisMenu/jquery.metisMenu.js"></script>
	<script
		src="static/inspinia/js/plugins/slimscroll/jquery.slimscroll.min.js"></script>


	<!-- Custom and plugin javascript -->
	<script src="static/inspinia/js/inspinia.js"></script>
	<script
		src="static/inspinia/js/plugins/pace/pace.min.js"></script>

	<!--typeahead检索自动补全-->
	<script src="static/js/bootstrap3-typeahead.js"></script>

	<!-- Flot -->
	<script
		src="static/inspinia/js/plugins/flot/jquery.flot.js"></script>
	<script
		src="static/inspinia/js/plugins/flot/jquery.flot.tooltip.min.js"></script>
	<script
		src="static/inspinia/js/plugins/flot/jquery.flot.resize.js"></script>

	<!--Chosen-->
	<script
		src="static/inspinia/js/plugins/chosen/chosen.jquery.js"></script>
	<!-- ChartJS-->
	<script
		src="static/inspinia/js/plugins/chartJs/Chart.min.js"></script>

	<!-- Peity -->
	<script
		src="static/inspinia/js/plugins/peity/jquery.peity.min.js"></script>
	<!-- Peity demo -->
	<script
		src="static/inspinia/js/demo/peity-demo.js"></script>

	<!--Sweet alert-->
	<script
		src="static/inspinia/js/plugins/sweetalert/sweetalert.min.js"></script>

	<script>
		
	</script>
</body>

</html>

