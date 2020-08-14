<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%

    String path = request.getContextPath();
    String basePath = request.getScheme() + "://"
            + request.getServerName() + ":" + request.getServerPort()
            + path + "/";
%>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>

    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">

    <title>食品中致癌物识别特征谱信息检索系统 数据库系统</title>

    <link href="static/inspinia/css/bootstrap.min.css" rel="stylesheet">
    <link href="static/inspinia/font-awesome/css/font-awesome.css" rel="stylesheet">
    <link href="static/inspinia/css/plugins/dataTables/datatables.min.css" rel="stylesheet">
    <link href="static/inspinia/css/animate.css" rel="stylesheet">
    <link href="static/inspinia/css/style.css" rel="stylesheet">
    <link href="static/inspinia/css/plugins/sweetalert/sweetalert.css" rel="stylesheet">


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
                    <a href="#" class="navbar-brand">食品中致癌物识别特征谱信息检索系统</a>
                </div>


                <div class="navbar-collapse collapse" id="navbar">
                    <ul class="nav navbar-nav">
                        <li>
                            <a aria-expanded="false" role="button" href="index.jsp"><font size="3"> 信息检索</font></a>
                        </li>

                    </ul>

                </div>

                <!---->
            </nav>
        </div>
        <div class="wrapper wrapper-content">
            <div class="container">
                <br/><br/><br/>
                <div class="text-center">
                    <font size="7"><strong >食品中致癌物识别特征谱信息检索</strong></font>
                    <br/><br/><br/>
                    <font size="6">用户注册</font>
                </div>


                <div class="col-lg-4 col-lg-offset-4">
                    <br/>
                    <c:choose>
                        <c:when test="${msg=='userError'}">
                            <p class="text-center" style="color: red">用户名已注册，请重试！</p>
                        </c:when>
                        <c:when test="${msg=='confirmError'}">
                            <p class="text-center" style="color: red">密码与确认密码不一致，请重试！</p>
                        </c:when>
                        <c:when test="${msg=='success'}">
                            <p class="text-center">注册成功！</p>
                        </c:when>
                    </c:choose>
                    <form class="m-t" role="form" action="register" id="registerForm">
                        <div class="form-group">
                            <input name="username" type="text" class="form-control" placeholder="用户名" required="">
                        </div>
                        <div class="form-group">
                            <input name="email" type="email" class="form-control" placeholder="电子邮件" required="">
                        </div>
                        <div class="form-group">
                            <input name="userpwd" type="password" class="form-control" placeholder="密码" required="">
                        </div>
                        <div class="form-group">
                            <input name="confirmpwd" type="password" class="form-control" placeholder="确认密码" required="">
                        </div>
                        <button type="submit" class="btn btn-primary block full-width m-b" onclick="check()">注册</button>

                        <p class="text-muted text-center"><small>已经有一个帐户?</small></p>
                        <a class="btn btn-sm btn-white btn-block" href="login.jsp">登录</a>
                    </form>

                </div>



            </div>
            <div class="footer">
                <div>
                </div>
            </div>

        </div>
    </div>
</div>


<!-- Mainly scripts -->
<script src="static/inspinia/js/jquery/jquery-3.1.1.min.js"></script>
<script src="static/inspinia/js/plugins/metisMenu/jquery.metisMenu.js"></script>
<script src="static/inspinia/js/plugins/slimscroll/jquery.slimscroll.min.js"></script>
<script src="static/inspinia/js/bootstrap/bootstrap.min.js"></script>

<script src="static/inspinia/js/plugins/dataTables/datatables.min.js"></script>

<!-- Custom and plugin javascript -->
<script src="static/inspinia/js/inspinia.js"></script>
<script src="static/inspinia/js/plugins/pace/pace.min.js"></script>

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

<!--typeahead检索自动补全-->
<script src="static/js/bootstrap3-typeahead.js"></script>


<script>
    function check(){
        document.getElementById("registerForm").submit();

    }
</script>


</body>

</html>