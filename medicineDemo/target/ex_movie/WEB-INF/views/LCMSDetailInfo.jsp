<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

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
                <br/>
                <h1 class="text-center "><strong>液相色谱质谱法——${CNName}</strong></h1>
                <br/><br/>
                <div class="row">
                    

                    <div class="col-lg-12">
                        <div class="ibox">
                            <div class="ibox-content">

                                <%--<div class="col-sm-9">--%>
                                <div class="row">
                                    <div class="col-lg-10 col-lg-offset-1">
                                        <h3><span class="label label-primary">1</span> &nbsp;&nbsp;基础信息</h3>

                                        <div class="col-lg-6">
                                            <table class="table" >
                                                <tr>
                                                    <th width="30%">【检测器】</th>
                                                    <td>
                                                        ${LCMSInfo.detector}
                                                    </td>
                                                </tr>
                                                
                                                <tr>
                                                    <th width="30%">【色谱柱】</th>
                                                    <td>
                                                        ${LCMSInfo.chromatographicCol}
                                                    </td>
                                                </tr>
                                                <tr>
                                                    <th width="30%">【柱温】</th>
                                                    <td>
                                                        ${LCMSInfo.colTemperature}
                                                    </td>
                                                </tr>
                                                <tr>
                                                    <th width="30%">【流动相】</th>
                                                    <td>
                                                        ${LCMSInfo.mobilePhase}
                                                    </td>
                                                </tr>
                                                <tr>
                                                <tr>
                                                    <th width="30%">【进样量】</th>
                                                    <td>
                                                        ${LCMSInfo.injectionVolume}
                                                    </td>
                                                </tr>
                                                <tr>
                                                    <th width="30%">【离子源】</th>
                                                    <td>
                                                        ${LCMSInfo.icoSource}
                                                    </td>
                                                </tr>
                                                <tr>
                                                    <th width="30%">【检测模式】</th>
                                                    <td>
                                                        ${LCMSInfo.detectionMode}
                                                    </td>
                                                </tr>
                                                <tr>
                                                    <th width="30%">【内标物】</th>
                                                    <td>
                                                        ${LCMSInfo.interStandardSub}
                                                    </td>
                                                </tr>
                                                <tr>
                                                    <th width="30%">【定量离子对1】</th>
                                                    <td>
                                                        ${LCMSInfo.quantitativeIonPair1}
                                                    </td>
                                                </tr>
                                                <tr>
                                                    <th width="30%">【定量离子对2】</th>
                                                    <td>
                                                        ${LCMSInfo.quantitativeIonPair2}
                                                    </td>
                                                </tr><tr>
                                                    <th width="30%">【定量离子对3】</th>
                                                    <td>
                                                        ${LCMSInfo.quantitativeIonPair3}
                                                    </td>
                                                </tr>
                                                <tr>
                                                    <th width="30%">【定性离子对1】</th>
                                                    <td>
                                                        ${LCMSInfo.qualitativeIonPair1}
                                                    </td>
                                                </tr>
                                                <tr>
                                                    <th width="30%">【定性离子对2】</th>
                                                    <td>
                                                        ${LCMSInfo.qualitativeIonPair2}
                                                    </td>
                                                </tr>
                                                <tr>
                                                    <th width="30%">【定性离子对3】</th>
                                                    <td>
                                                        ${LCMSInfo.qualitativeIonPair3}
                                                    </td>
                                                </tr>
                                                <tr>
                                                    <th width="30%">【前处理方法】</th>
                                                    <td>
                                                        ${LCMSInfo.pretreatmentMethod}
                                                    </td>
                                                </tr>
                                                <tr>
                                                    <th width="30%">【检出限】</th>
                                                    <td>
                                                        ${LCMSInfo.detectionLimit}
                                                    </td>
                                                </tr>
                                                <tr>
                                                    <th width="30%">【样品】</th>
                                                    <td>
                                                        ${LCMSInfo.samples}
                                                    </td>
                                                </tr>
                                                <tr>
                                                    <th width="30%">【其他测定分子】</th>
                                                    <td>
                                                        ${LCMSInfo.otherDeterminants}
                                                    </td>
                                                </tr>
                                                
                                                <tr>
                                                    <th width="30%">【特征图谱】</th>
                                                    <td>
                                                        详见右图
                                                    </td>
                                                </tr>
                                                </tbody>
                                            </table>
                                        </div>
                                        <div class="col-lg-5">
                                            <%--<ul id="imglist">--%>
                                                <%--<li> </li>--%>
                                                    <img id="spectrogram" src="static/特征谱数据库/液相色谱质谱法/特征谱/${LCMSInfo.featureMap}.jpg" width="500" height=auto >

                                            <%--</ul>--%>

                                            <!-- 放大后的图片 -->

                                                <%--<div id="outerdiv" style="position:absolute;margin:auto;top:0;left:0;right: 0;bottom:0;background:rgba(0,0,0,0.7);z-index:2000;width:100%;height:100%;display:none;">--%>

                                            <div id="outerdiv" style="text-align: center; vertical-align:middle;position:fixed;top:0;left:0;right: 0;bottom:0;background:rgba(0,0,0,0.7);z-index:2000;width:100%;height:100%;display:none;">
                                                <div id="innerdiv" style=" position:absolute;margin:auto;top:5%;left:0;right: 0;bottom:0;vertical-align:middle;">
                                                    <img id="bigimg" style="border:5px solid #fff;" src="" />
                                                </div>
                                            </div>

                                            <%--<img id="spectrogram" src="/showImg.do?imgName=${detailInfo.spectrogram}" width="500" height=auto >--%>
                                            <%--width="400" height="200">--%>
                                            <%--<%=path%>\WEB-INF${detailInfo.spectrogram}--%>
                                            <%--<embed width="800" height="600" src="<%=request.getContextPath() %>${detailInfo.spectrogram}">--%>


                                            <%--<embed width="800" height="600" src="<%=request.getContextPath() %>/data/ref/1.pdf"></embed>--%>
                                            <%--<img src="scorerecord!getImage.action?idNo=${detailInfo.spectrogram}"></img>--%>
                                            <%--<img src="<%=request.getContextPath() %>/data/参考图谱/1.tif" alt="" height="80" width="650"/>--%>
                                        </div>

                                    </div>
                                </div>
                                

                                <div class="row">
                                    <div class="col-lg-10 col-lg-offset-1"><!--well-->
                                        <div class="hr-line-dashed"></div>
                                        <h3><span class="label label-primary">2</span>&nbsp;&nbsp;参考文献</h3>

                                        <embed width="900" height="800" src="static/特征谱数据库/液相色谱质谱法/参考文献/${LCMSInfo.featureMap}.pdf">
                                    </div>
                                </div>
                                <div>
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
$(function () {
        $("#spectrogram").click(function(){
            var _this = $(this);//将当前的pimg元素作为_this传入函数
            imgShow("#outerdiv", "#innerdiv", "#bigimg", _this);
        });
    })


    function imgShow(outerdiv, innerdiv, bigimg, _this) {
        var src = _this.attr("src");//获取当前点击的pimg元素中的src属性
        $('#outerdiv').attr('display', 'block');
        $(bigimg).attr("src", src);//设置#bigimg元素的src属性
        $(outerdiv).fadeIn("fast");

        $(outerdiv).click(function () {//再次点击淡出消失弹出层
            $(this).fadeOut("fast");
        });
    }

    // $(document).ready(function(){
    //     $("#search_btn").click(function(){
    //         alert("error");
    //     });
    // });
</script>
</body>

</html>

