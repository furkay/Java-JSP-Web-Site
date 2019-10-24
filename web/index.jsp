<%@page import="java.sql.ResultSet"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>

<%
    //Güvenli Çıkış Butonuna Basılınca
    //Tüm Sessionları Temizlemiş oluruz....
    if(request.getParameter("q")!=null)
    {
        //Tüm sessionlar temizlenir.....
        session.invalidate();
        //URL temizler....
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
	<title>GDG Bolu</title>
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
	<!-- ================== END BASE CSS STYLE ================== -->
</head>
<body>
	<!-- begin #page-loader -->
	<div id="page-loader" class="fade in"><span class="spinner"></span></div>
	<!-- end #page-loader -->
	
	<!-- begin #page-container -->
	<div id="page-container" class="fade">
	    <!-- begin login -->
        <div class="login bg-black animated fadeInDown">
            <!-- begin brand -->
            <div class="login-header">
                <div class="brand">
                    <span class=""><img src="Images/logo.png" /></span> 
                    <small style="color:#fff;">Yönetim Paneli</small>
                </div>
                <div class="icon">
                    <i class="fa fa-sign-in"></i>
                </div>
            </div>
            <!-- end brand -->
            <div class="login-content">
                <form  method="POST" class="margin-bottom-0">
                    <div class="form-group m-b-20">
                        <input type="text" class="form-control input-lg" placeholder="Kullanıcı Adınız"  maxlength="10" name="txtKullaniciAd" required/>
                    </div>
                    <div class="form-group m-b-20">
                        <input type="password" class="form-control input-lg" placeholder="Şifreniz" maxlength="10" name="txtSifre" required />
                    </div>
                    
                    <div class="login-buttons">
                        <button type="submit" class="btn btn-success btn-block btn-lg" name="btnGirisYap">GİRİŞ YAP</button>
                    </div>
                    <%
                      if(request.getParameter("btnGirisYap")!=null)
                      {
                          //btnGirisYap butonuna tıklandıysa....
                          //Formdan gelen veriler aşağıda okunur
                          String KullaniciAd=request.getParameter("txtKullaniciAd");
                          String Sifre=request.getParameter("txtSifre");
                          //tblKullanicilar tablosunda kullanici adı ve şifreye karşılık sorgulama yapar..
                          String SQL="select * from tblKullanicilar "
                                  + "where"
                                  + " KullaniciAdi='"+KullaniciAd+"' "
                                  + " and Sifre='"+Sifre+"'";
                          
                        ResultSet rs=Islemler.tblkullanicilar_crd.VeriKumesi(SQL);
                       // int id=rs.getInt("pkKullaniciID");
                          //ResultSet'e gelen verinin sayısı kontrol ediliyor...
                          int KayitSayi=Islemler.tblkullanicilar_crd.RsKayitSayisi(rs);
                        if(KayitSayi==0)
                         {
                              //Girilen kullanıcı adı ve şifreye karşılık kayıt yoksa HATA GİRİŞ
                            out.print("Hatalı Giriş Yaptınız");
                            //UYARI POPUP ( JavaScript)
                           /* String UYARI="<script> alert('Hatalı Giriş Yaptınız ');</script>";
                            out.print(UYARI);*/
                           }
                         else
                        {
                              //Yonetim.jsp sayfasina yönlendirir....
                         
                           
                           
                               session.setAttribute("Oturum", "1");
                               session.setAttribute("kullaniciadi",KullaniciAd);
                               //session.setAttribute("kullaniciid",id);
                               response.sendRedirect("Yonetim.jsp");
                               
                            
                         }
                      
                      }
                    
                    %>
                </form>
            </div>
        </div>
        <!-- end login -->
        
        <!-- begin theme-panel -->
       
        <!-- end theme-panel -->
	</div>
	<!-- end page container -->
	
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
		$(document).ready(function() {
			App.init();
		});
	</script>
</body>
</html>
