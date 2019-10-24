
<%@page import="Tablolar.tblkatilimcilar"%>
<%@page import="java.sql.ResultSet"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%
    //index.jsp ye uğramadan doğrudan bu sayfa açılırsa...tekrar index.jsp
    //geri gönderir.... illa oturum açılacak.....
    if (session.getAttribute("Oturum") == null) {

        response.sendRedirect("index.jsp");

    }

%>
<!DOCTYPE html>
<!--[if IE 8]> <html lang="en" class="ie8"> <![endif]-->
<!--[if !IE]><!-->
<html lang="tr">
    <!--<![endif]-->
    <head>
           <link rel="shortcut icon" href="Images/gdg.png" />
        <meta charset="utf-8" />
    <title>GDG Bolu Yönetim</title>
    <meta content="width=device-width, initial-scale=1.0, maximum-scale=1.0, user-scalable=no" name="viewport" />
    <meta content="" name="description" />
    <meta content="" name="author" />

    <!-- ================== BEGIN BASE CSS STYLE ================== -->
    <link href="http://fonts.googleapis.com/css?family=Open+Sans:300,400,600,700&subset=latin,latin-ext" rel="stylesheet">
        <link href="assets/plugins/jquery-ui-1.10.4/themes/base/minified/jquery-ui.min.css" rel="stylesheet" />
        <link href="assets/plugins/bootstrap-3.2.0/css/bootstrap.min.css" rel="stylesheet" />
        <link href="assets/plugins/font-awesome-4.2.0/css/font-awesome.min.css" rel="stylesheet" />
        <link href="assets/css/animate.min.css" rel="stylesheet" />
        <link href="assets/css/style.min.css" rel="stylesheet" />
        <link href="assets/css/style-responsive.min.css" rel="stylesheet" />
        <link href="assets/css/theme/default.css" rel="stylesheet" id="theme" />
        <link href="css/style.css" rel="stylesheet"/>
        <!-- ================== END BASE CSS STYLE ================== -->
    </head>
    <body>


    <script>
        function myFunction() {
            // Get the snackbar DIV
            var x = document.getElementById("snackbar");

            // Add the "show" class to DIV
            x.className = "show";

            // After 3 seconds, remove the show class from DIV
            setTimeout(function () {
                x.className = x.className.replace("show", "");
            }, 3000);
        }
    </script>


    <div id="page-loader" class="fade in"><span class="spinner"></span></div>

    <div id="page-container" class="fade page-sidebar-fixed page-header-fixed">

        <%@include file="header.jsp"%>
        <div id="sidebar" class="sidebar">

            <div data-scrollbar="true" data-height="100%">

                <ul class="nav">
                    <li class="nav-profile">

                        <div class="info">
                            <%= session.getAttribute("kullaniciadi")%>

                        </div>
                    </li>
                </ul>

                <!--MENÜ BURADA OLACAK....-->

                <%@include file="menu.jsp"%>

            </div>

        </div>
        <div class="sidebar-bg"></div>


        <div id="content" class="content">

            <div class="panel panel-primary">

                <div class="panel-heading"> Yeni Katılımcı</div>
                <div class="panel-body">
                    <form method="post" class="form-horizontal">

                        <div class="form-group">

                            <div class="col-sm-12">

                                <label class="col-md-3 control-label"style="margin-top:15px;"> Katılımcı Ad Soyad</label>
                                <div class="col-md-6">
                                    <input type="text" name="txtKullaniciAd" class="form-control" required  style="margin-top:15px;" autofocus/>
                                </div>
                                <div class="col-md-3">
                                <button type="submit" name="btnKaydet" class="btn btn-success" onclick="myFunction()" style="width:150px; margin-top:15px; ">KAYDET</button>

                                </div>
                            </div>

                        </div>     
                        <div class="form-group">

                            <div class="col-md-6" style="text-align:center;">


                            </div>
                            <div class="col-md-6" style="text-align:center;">

                               
                            </div>
                        </div>  
                   </div> 
            </div>     



            <%  request.setCharacterEncoding("utf-8");
                if (request.getParameter("btnKaydet") != null) {
        
                    String KullaniciAd = request.getParameter("txtKullaniciAd");

       
       
 
                    Tablolar.tblkatilimcilar nesne = new tblkatilimcilar();

                    nesne.setKatilimciAdi(KullaniciAd);

                    Islemler.tblkatilimcilar_crd.Kaydet(nesne);

                    response.sendRedirect("KatilimciEkle.jsp");

                
     }
  if (request.getParameter("btnSil") != null) {
                    response.sendRedirect("KatilimciListele.jsp");

                }
               


            %>



            </form>
             
            <form>
                <div style="text-align:right;">
                  <button type="submit" name="btnSil" class="btn btn-danger" >Katılımcı Kaldır</button>
                </div>
            </form>
        </div>

    </div>

</div>

<a href="javascript:;" class="btn btn-icon btn-circle btn-success btn-scroll-to-top fade" data-click="scroll-top"><i class="fa fa-angle-up"></i></a>
<div id="snackbar">Başarıyla Kaydedildi...</div>

</div>



<!-- ================== BEGIN BASE JS ================== -->
<script src="assets/plugins/jquery-1.8.2/jquery-1.8.2.min.js"></script>
<script src="assets/plugins/jquery-ui-1.10.4/ui/minified/jquery-ui.min.js"></script>
<script src="assets/plugins/bootstrap-3.2.0/js/bootstrap.min.js"></script>
<!--[if lt IE 9]>
        <script src="assets/crossbrowserjs/html5shiv.js"></script>
        <script src="assets/crossbrowserjs/respond.min.js"></script>
        <script src="assets/crossbrowserjs/excanvas.min.js"></script>
<![endif]-->
<script src="assets/plugins/slimscroll/jquery.slimscroll.min.js"></script>
<script src="assets/plugins/jquery-cookie/jquery.cookie.js"></script>
<!-- ================== END BASE JS ================== -->

<!-- ================== BEGIN PAGE LEVEL JS ================== -->
<script src="assets/js/apps.min.js"></script>
<!-- ================== END PAGE LEVEL JS ================== -->
<script>
                                    $(document).ready(function () {
                                        App.init();
                                    });




</script>
</body>
</html>
