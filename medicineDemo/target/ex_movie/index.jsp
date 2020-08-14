<%@ page contentType="text/html;charset=UTF-8" language="java"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%

    String path = request.getContextPath();
    String basePath = request.getScheme() + "://"
            + request.getServerName() + ":" + request.getServerPort()
            + path + "/";
    String username=String.valueOf(request.getSession().getAttribute("username"));
%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>

<meta charset="utf-8">
<meta name="viewport" content="width=device-width, initial-scale=1.0">

<title>食品致癌物基本信息和特征谱检索系统</title>
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
					<!--logo-name-->
					<br />
					<h1 class="text-center ">食品中致癌物识别特征谱信息检索</h1>
					<br />
					<br />
					<div class="row">
						<!--简易检索-->
						<div class="col-sm-6 col-sm-offset-3">
							<div class="ibox float-e-margins">
								<!--简易检索表单创建-->
								<form action="easySearch" method="post" id="easySearchForm">

									<div class="input-group">
										<input type="text" id="keyword_input" name="keyword"
											autocomplete="off" data-provide="typeahead"
											class="form-control" placeholder="食品致癌物的中文名称/英文名称/CAS号/EC号等"
											required> <span class="input-group-btn"><button
												onclick="submitEasySearchForm()" class="btn btn-primary">检索</button></span>

									</div>

								</form>
							</div>
						</div>
						<!--高级检索-->
						<div
							class="col-xs-8 col-xs-offset-2 col-sm-8 col-sm-offset-2 col-lg-8 col-lg-offset-2">
							<div class="ibox float-e-margins">
								<div class="ibox-title">
									<h4>高级检索</h4>
								</div>
								<div class="ibox-content">
									<div class="pull-right">
										<button id="btn_addRow" title="添加行"
											class="btn btn-white btn-xl" type="submit" onclick="addRow()">
											<strong>+</strong>
										</button>
										<button id="btn_deleteRow" title="删除行"
											class="btn btn-white btn-xl" type="submit"
											onclick="deleteRow()">
											<strong>-</strong>
										</button>
									</div>

									<!--高级检索表单创建-->
									<form action="advancedSearch" method="post"
										class="form-horizontal" id="advancedSearchForm">
										<!--隐藏标签，用于保存新生成的input 初始值为1-->
										<input type="hidden" id="cnt_CSForm" value="1"> <input
											type="hidden" id="submit_txt" name="submit_txt" value="">
										<input type="hidden" id="submit_oper" name="submit_oper"
											value="">

										<div id="divForm"
											class="col-xs-12 col-xs-offset-2 col-sm-12 col-sm-offset-2">
											<div class="form-group col-xs-12 col-sm-12" id="formGroup1">
												<div class="col-xs-5 col-sm-5">
													<input type="text" class="form-control input-search"
														id="formInput1" autocomplete="off"
														data-provide="typeahead" required>
													<div id="context1"></div>
												</div>
												<div class="input-group-btn ">
													<div data-toggle="dropdown"
														class="btn btn-white dropdown-toggle" type="button"
														aria-expanded="false">
														<span id="buttonText1">中文名称</span> <span class="caret"></span>
													</div>
													<ul class="dropdown-menu" role="menu">
														<%
															String[] opt_text = new String[]{"中文名称", "中文别名", "英文名称", "英文别名", "CAS号", "EC号","检测方法"};
															pageContext.setAttribute("opt_text", opt_text);
														%>
														<c:forEach items="${pageScope.opt_text}" var="opt1">
															<li><a href="#"
																onclick="show('buttonText',1,$(this).text())">${opt1}</a></li>
															<%--    onclick="show('buttonText',1,$(this).text())" <li><a href="#" id="li1" onclick="show($('.buttonText1'),$(this).text())">${opt1}</a></li>--%>
														</c:forEach>
													</ul>
												</div>
											</div>
										</div>
										<div class="form-group">
											<div
												class="col-xs-4 col-xs-offset-5 col-sm-4 col-sm-offset-5">
												<button id="search_btn" class="btn btn-primary"
													onclick="submitAdvancedSearchForm()">检索</button>
												<%--<button id="search_btn" class="btn btn-primary" type="submit">检索</button>--%>
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
				<div></div>
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
		$(function() {
			//简易检索中显示历史检索记录
			$('#keyword_input').typeahead('destroy');
			$('#keyword_input').typeahead({
				//利用ajax获得后台数据 生成自动补全标签
				source : function(request, response) {
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
				fitToElement : true,//和输入框的大小保持一致
				autoSelect : false,
				items : 8,//最多显示个数
				minLength : 0,
				showHintOnFocus : true
			//当输入框获得焦点时立刻显示提示
			});

			//检索提示
			var txt = document.getElementById('buttonText1').innerText;
			$("#formInput1").typeahead('destroy');
			$("#formInput1").typeahead({
				//利用ajax获得后台数据 生成自动补全标签
				source : function(require, response) {
					$.ajax({
						type : "POST",
						url : "findRelated",
						data : {
							"autoDataType" : txt
						},
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
				fitToElement : true,//和输入框的大小保持一致
				autoSelect : false,
				items : 8,//最多显示个数
				minLength : 0,
				showHintOnFocus : true
			});

		});

		//提交简易检索的表单
		function submitEasySearchForm() {
			var keyword = $("#keyword_input").innerText;
			var err = 0;
			if (keyword == "" || keyword == null) {
				err = 1;
			} else {
				document.getElementById("easySearchForm").submit();
			}
		}
		//提交高级检索的表单
		function submitAdvancedSearchForm() {
			var cnt_now = parseInt($("#cnt_CSForm").val());
			var submit_txt = new String("");
			var submit_oper = new String("");
			var err = 0;
			for (var i = 1; i <= cnt_now; i++) {
				var formInput = new String("formInput" + i);
				//alert(document.getElementById(formInput).value);
				if (document.getElementById(formInput).value == "") {
					err = 1;
					break;
				}
				var buttonText = new String("buttonText" + i);
				var txt = document.getElementById(buttonText).innerText;
				//var txt = $("."+buttonText).text();//
				//逻辑运算符
				if (i > 1) {
					var buttonOperator = new String("buttonOperator" + i);
					var txt_operator = $("." + buttonOperator).text();
					switch (txt_operator) {
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
						err = 1;
						break;
					}

				}
				//
				switch (txt) {
				case "中文名称":
					submit_txt = submit_txt + "cnName="
							+ document.getElementById(formInput).value + ";";
					break;
				case "中文别名":
					submit_txt = submit_txt + "cnAlias="
							+ document.getElementById(formInput).value + ";";
					break;
				case "英文名称":
					submit_txt = submit_txt + "enName="
							+ document.getElementById(formInput).value + ";";
					break;
				case "英文别名":
					submit_txt = submit_txt + "enAlias="
							+ document.getElementById(formInput).value + ";";
					break;
				case "CAS号":
					submit_txt = submit_txt + "casNum="
							+ document.getElementById(formInput).value + ";";
					break;
				case "EC号":
					submit_txt = submit_txt + "ecNum="
							+ document.getElementById(formInput).value + ";";
					break;
				case "检测方法":
					submit_txt = submit_txt + "method="
							+ document.getElementById(formInput).value + ";";
					break;
				default:
					err = 1;
					break;
				}

			}
			if (err == 0) {
				$("#submit_txt").val(submit_txt);
				$("#submit_oper").val(submit_oper);
				document.getElementById("advancedSearchForm").submit();
			}

		}

		//回显下拉框中显示的信息
		function show(btn_class, btn_num, txt) {
			$('#' + btn_class + btn_num).text(txt);
			if (btn_class == 'buttonText') {
				//var tags = getTags(txt);
				var formInput = "formInput" + btn_num;
				$('#' + formInput).typeahead('destroy');
				$('#' + formInput).typeahead({
					//利用ajax获得后台数据 生成自动补全标签
					source : function(request, response) {
						$.ajax({
							type : "POST",
							url : "findRelated",
							data : {
								"autoDataType" : txt
							},
							success : function(data) {
								//var res=data.split(",");
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
					fitToElement : true,//和输入框的大小保持一致
					autoSelect : false,
					items : 8,//最多显示个数
					minLength : 0,
					showHintOnFocus : true
				});

			}

		}

		//删除检索词条
		function deleteRow() {
			var cnt_now = parseInt($("#cnt_CSForm").val());
			if (cnt_now > 1) {
				var cnt_after = cnt_now - 1;
				$("#cnt_CSForm").val(cnt_after);
				var m = document.getElementById("formGroup" + cnt_now);
				m.parentNode.removeChild(m);
			} else {
				swal({
					title : "无法删除",
					text : "检索条件过少",
					type : "error"
				});
				//alert("无法删除");
			}
		}

		//增加检索词条
		function addRow() {
			var cnt_now = parseInt($("#cnt_CSForm").val());
			if (cnt_now < 5) {
				var cnt_after = cnt_now + 1;
				$("#cnt_CSForm").val(cnt_after);
				//运算符下拉选项
				var buttonOperator = new String("buttonOperator" + cnt_after);
				var opt_operator = [ "AND", "OR", "NOT" ];
				var dropdown_menu_operator = "";
				for ( var i in opt_operator) {
					dropdown_menu_operator = dropdown_menu_operator
							+ "<li><a href=\"#\" onclick=\"$('.'+'"
							+ buttonOperator + "').text($(this).text())\">"
							+ opt_operator[i] + "</a></li>\n";
				}

				//字段下拉选项
				var buttonText = new String("buttonText" + cnt_after);
				var opt_text = [ "中文名称", "中文别名", "英文名称", "英文别名", "CAS号", "EC号" ,"检测方法"];
				var dropdown_menu_text = "";
				for ( var k in opt_text) {
					dropdown_menu_text = dropdown_menu_text
							+ "<li><a href=\"#\" onclick=\"show('buttonText',"
							+ cnt_after + ",$(this).text())\">" + opt_text[k]
							+ "</a></li>\n";
				}

				var item = "<div class=\"form-group col-xs-11 col-lg-11\" id=\"formGroup"+cnt_after+"\">\n"
						+ "<div class=\"input-group-btn col-xs-2 col-lg-2 \">"
						+ "<div data-toggle=\"dropdown\" class=\"btn btn-white dropdown-toggle\" type=\"button\" aria-expanded=\"false\" >"
						+ "<span class="+buttonOperator+">AND</span><span class=\"caret\"></span></div>"
						+ "<ul class=\"dropdown-menu\" role=\"menu\">\n"
						+ dropdown_menu_operator
						+ "</ul></div>"
						+ "<div class=\"col-xs-4 col-xs-offset-1 col-lg-4 col-lg-offset-1\"><input type=\"text\" class=\"form-control\" id=\"formInput"+cnt_after+"\" autocomplete='off' required></div>\n"
						+ "<div class=\"input-group-btn\">\n"
						+ "<div data-toggle=\"dropdown\" class=\"btn btn-white dropdown-toggle\" type=\"button\" aria-expanded=\"false\">\n"
						+ "<span id="+buttonText+">中文名称</span><span class=\"caret\"></span></div>\n"
						+ "<ul class=\"dropdown-menu\" role=\"menu\">\n"
						+ dropdown_menu_text + "</ul></div></div>";
				$("#divForm").append(item);
				var txt = "中文名称";
				var formInput = "formInput" + cnt_after;
				$('#' + formInput).typeahead('destroy');
				$('#' + formInput).typeahead({
					//利用ajax获得后台数据 生成自动补全标签
					source : function(request, response) {
						$.ajax({
							type : "POST",
							url : "findRelated",
							data : {
								"autoDataType" : txt
							},
							success : function(data) {
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
					fitToElement : true,//和输入框的大小保持一致
					autoSelect : false,
					items : 8,//最多显示个数
					minLength : 0,
					showHintOnFocus : true
				});

			} else {
				swal({
					title : "无法添加",
					text : "检索条件过多",
					type : "error"
				});

				//alert("检索条件过多");
			}

		}
	</script>



</body>

</html>