package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.sql.PreparedStatement;
import java.sql.Connection;
import Tablolar.tblicerik;

public final class TimeLine_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.ArrayList<String>(2);
    _jspx_dependants.add("/header.jsp");
    _jspx_dependants.add("/menu.jsp");
  }

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
  }

  public void _jspService(HttpServletRequest request, HttpServletResponse response)
        throws java.io.IOException, ServletException {

    PageContext pageContext = null;
    HttpSession session = null;
    ServletContext application = null;
    ServletConfig config = null;
    JspWriter out = null;
    Object page = this;
    JspWriter _jspx_out = null;
    PageContext _jspx_page_context = null;

    try {
      response.setContentType("text/html;charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");

    //index.jsp ye uğramadan doğrudan bu sayfa açılırsa...tekrar index.jsp
    //geri gönderir.... illa oturum açılacak.....
    if (session.getAttribute("Oturum") == null) {

        response.sendRedirect("index.jsp");

    }


      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html lang=\"tr\">\n");
      out.write("    <head>\n");
      out.write("    <link rel=\"shortcut icon\" href=\"Images/gdg.png\" />\n");
      out.write("    <meta charset=\"utf-8\" />\n");
      out.write("    <title>GDG Bolu Yönetim</title>\n");
      out.write("    <meta content=\"width=device-width, initial-scale=1.0, maximum-scale=1.0, user-scalable=no\" name=\"viewport\" />\n");
      out.write("    <meta content=\"\" name=\"description\" />\n");
      out.write("    <meta content=\"\" name=\"author\" />\n");
      out.write("\n");
      out.write("    <!-- ================== BEGIN BASE CSS STYLE ================== -->\n");
      out.write("    <link href=\"http://fonts.googleapis.com/css?family=Open+Sans:300,400,600,700&subset=latin,latin-ext\" rel=\"stylesheet\">\n");
      out.write("        <link href=\"assets/plugins/jquery-ui-1.10.4/themes/base/minified/jquery-ui.min.css\" rel=\"stylesheet\" />\n");
      out.write("        <link href=\"assets/plugins/bootstrap-3.2.0/css/bootstrap.min.css\" rel=\"stylesheet\" />\n");
      out.write("        <link href=\"assets/plugins/font-awesome-4.2.0/css/font-awesome.min.css\" rel=\"stylesheet\" />\n");
      out.write("        <link href=\"assets/css/animate.min.css\" rel=\"stylesheet\" />\n");
      out.write("        <link href=\"assets/css/style.min.css\" rel=\"stylesheet\" />\n");
      out.write("        <link href=\"assets/css/style-responsive.min.css\" rel=\"stylesheet\" />\n");
      out.write("        <link href=\"assets/css/theme/default.css\" rel=\"stylesheet\" id=\"theme\" />\n");
      out.write("        <!-- ================== END BASE CSS STYLE ================== -->\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("\n");
      out.write("    <div id=\"page-container\" class=\"fade page-sidebar-fixed page-header-fixed\">\n");
      out.write("        <div id=\"page-loader\" class=\"fade in\"><span class=\"spinner\"></span></div>\n");
      out.write("            ");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<div id=\"header\" class=\"header navbar navbar-default navbar-fixed-top\">\n");
      out.write("    <!-- begin container-fluid -->\n");
      out.write("    <div class=\"container-fluid\">\n");
      out.write("        <!-- begin mobile sidebar expand / collapse button -->\n");
      out.write("        <div class=\"navbar-header\">\n");
      out.write("            <a href=\"Yonetim.jsp\" class=\"navbar-brand\"><span class=\"\"><img src=\"Images/logov1.png\"/></span> </a>\n");
      out.write("            <button type=\"button\" class=\"navbar-toggle\" data-click=\"sidebar-toggled\">\n");
      out.write("                <span class=\"icon-bar\"></span>\n");
      out.write("                <span class=\"icon-bar\"></span>\n");
      out.write("                <span class=\"icon-bar\"></span>\n");
      out.write("            </button>\n");
      out.write("        </div>\n");
      out.write("        <!-- end mobile sidebar expand / collapse button -->\n");
      out.write("\n");
      out.write("        <!-- begin header navigation right -->\n");
      out.write("        <ul class=\"nav navbar-nav navbar-right\">\n");
      out.write("            <li class=\"dropdown navbar-user\">\n");
      out.write("                <a href=\"javascript:;\" class=\"dropdown-toggle\" data-toggle=\"dropdown\">\n");
      out.write("\n");
      out.write("                    <span class=\"hidden-xs\"> ");
      out.print( session.getAttribute("kullaniciadi"));
      out.write("</span> <b class=\"caret\"></b>\n");
      out.write("                </a>\n");
      out.write("                <ul class=\"dropdown-menu animated fadeInLeft\">\n");
      out.write("                    <li class=\"arrow\"></li>\n");
      out.write("                    <li><a href=\"sifreyenile.jsp\">Şifre Değiştir</a></li>\n");
      out.write("\n");
      out.write("                    <li><a href=\"adminekle.jsp\">Admin Ekle</a></li>\n");
      out.write("                    <li class=\"divider\"></li>\n");
      out.write("                    <li><a href=\"index.jsp?q=1\">Güvenli Çıkış</a></li>\n");
      out.write("                </ul>\n");
      out.write("            </li>\n");
      out.write("        </ul>\n");
      out.write("        <!-- end header navigation right -->\n");
      out.write("    </div>\n");
      out.write("    <!-- end container-fluid -->\n");
      out.write("</div>");
      out.write("\n");
      out.write("        <div id=\"sidebar\" class=\"sidebar\">\n");
      out.write("\n");
      out.write("            <div data-scrollbar=\"true\" data-height=\"100%\">\n");
      out.write("                \n");
      out.write("                <ul class=\"nav\">\n");
      out.write("                    <li class=\"nav-profile\">\n");
      out.write("\n");
      out.write("                        <div class=\"info\">\n");
      out.write("                            ");
      out.print( session.getAttribute("kullaniciadi"));
      out.write("\n");
      out.write("\n");
      out.write("                        </div>\n");
      out.write("                    </li>\n");
      out.write("                </ul>\n");
      out.write("\n");
      out.write("                <!--MENÜ BURADA OLACAK....-->\n");
      out.write("\n");
      out.write("                ");
      out.write("\n");
      out.write("<ul class=\"nav\">\n");
      out.write("    <li class=\"nav-header\">Menü</li>\n");
      out.write("    <li><a href=\"Yonetim.jsp\"><i class=\"fa fa-home\"></i> <span>Ana Sayfa</span></a></li>\n");
      out.write("    <li><a href=\"KatilimciEkle.jsp\"><i class=\"fa fa-plus-square\" ></i> <span>Katılımcı Ekle</span></a></li>\n");
      out.write("    <li><a href=\"KatilimciListele.jsp\"><i class=\"fa fa-users\"></i> <span>Katılımcı Listele</span></a></li>\n");
      out.write("    <li class=\"has-sub\">\n");
      out.write("        <a href=\"javascript:;\">\n");
      out.write("            <b class=\"caret pull-right\" ></b>\n");
      out.write("            <i class=\"fa fa-laptop\"></i>\n");
      out.write("            <span>TimeLine İşlemleri</span>\n");
      out.write("        </a>\n");
      out.write("        <ul class=\"sub-menu\">\n");
      out.write("            <li><a href=\"TimeLine.jsp\">TimeLine Ekle</a></li>\n");
      out.write("            <li><a href=\"TimeLineSil.jsp\">TimeLine Sil</a></li>\n");
      out.write("         </ul>\n");
      out.write("    </li>\n");
      out.write("    <li class=\"has-sub\">\n");
      out.write("        <a href=\"javascript:;\">\n");
      out.write("            <b class=\"caret pull-right\"></b>\n");
      out.write("            <i class=\"fa fa-laptop\"></i>\n");
      out.write("            <span>Sözleşme İşlemleri</span>\n");
      out.write("        </a>\n");
      out.write("        <ul class=\"sub-menu\">\n");
      out.write("            <li><a href=\"YeniSozlesme.jsp\">Yeni Sözleşme</a></li>\n");
      out.write("            <li><a href=\"SozlesmeListe.jsp\">Sözleşmeleri Listele</a></li>\n");
      out.write("           \n");
      out.write("        </ul>\n");
      out.write("    </li>\n");
      out.write("     <li class=\"has-sub\">\n");
      out.write("        <a href=\"javascript:;\">\n");
      out.write("            <b class=\"caret pull-right\"></b>\n");
      out.write("            <i class=\"fa fa-laptop\"></i>\n");
      out.write("            <span>Etkinlik Ayarı</span>\n");
      out.write("        </a>\n");
      out.write("        <ul class=\"sub-menu\">\n");
      out.write("            <li><a href=\"BiletEkle.jsp\">Bilet Oluştur</a></li>\n");
      out.write("            <li><a href=\"kazananlariSil.jsp\">Kazananları Sil</a></li>\n");
      out.write("           \n");
      out.write("        </ul>\n");
      out.write("    </li>\n");
      out.write(" \n");
      out.write("   <li><a href=\"index.jsp?q=1\"><i class=\"fa fa-times-circle\"></i> <span>Güvenli Çıkış</span></a></li>\n");
      out.write("\n");
      out.write("    <!-- begin sidebar minify button -->\n");
      out.write("    <li><a href=\"javascript:;\" class=\"sidebar-minify-btn\" data-click=\"sidebar-minify\"><i class=\"fa fa-angle-double-left\"></i></a></li>\n");
      out.write("    <!-- end sidebar minify button -->\n");
      out.write("</ul>\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("            </div>\n");
      out.write("\n");
      out.write("        </div>\n");
      out.write("        <div class=\"sidebar-bg\"></div>\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("        <div class=\"content\" id=\"content\">\n");
      out.write("\n");
      out.write("\n");
      out.write("            <form   action=\"UploadImage\" method=\"post\" enctype=\"multipart/form-data\" >\n");
      out.write("\n");
      out.write("                <input type=\"file\" accept=\"image/*\" name=\"ResimYukle\"  />\n");
      out.write("                <br/>\n");
      out.write("                <input type=\"text\" name=\"txtBaslik\" placeholder=\"Başlık Giriniz\"  maxlength=\"255\"/>\n");
      out.write("                <br/>\n");
      out.write("                <textarea  name=\"txtAciklama\" rows=\"4\" cols=\"50\" placeholder=\"Açıklama Giriniz\" maxlength=\"2500\"></textarea>  \n");
      out.write("                <br/>\n");
      out.write("                  <br/>\n");
      out.write("              <select name=\"txtKonu\">\n");
      out.write("                            <option value=\"gdg\">GDG</option>\n");
      out.write("                            <option value=\"wtm\">WTM</option>\n");
      out.write("                            <option value=\"workshop\">WorkShop</option>\n");
      out.write("                            <option value=\"other\">Diğer</option>\n");
      out.write("              </select>\n");
      out.write("                <br/>\n");
      out.write("                <input type=\"submit\" value=\"Kaydet\" name=\"btnUpload\"/>\n");
      out.write("\n");
      out.write("            </form>\n");
      out.write("\n");
      out.write("        </div>\n");
      out.write("        <a href=\"javascript:;\" class=\"btn btn-icon btn-circle btn-success btn-scroll-to-top fade\" data-click=\"scroll-top\"><i class=\"fa fa-angle-up\"></i></a>\n");
      out.write("    </div>\n");
      out.write("\n");
      out.write("    <!-- ================== BEGIN BASE JS ================== -->\n");
      out.write("    <script src=\"assets/plugins/jquery-1.8.2/jquery-1.8.2.min.js\"></script>\n");
      out.write("    <script src=\"assets/plugins/jquery-ui-1.10.4/ui/minified/jquery-ui.min.js\"></script>\n");
      out.write("    <script src=\"assets/plugins/bootstrap-3.2.0/js/bootstrap.min.js\"></script>\n");
      out.write("    <!--[if lt IE 9]>\n");
      out.write("            <script src=\"assets/crossbrowserjs/html5shiv.js\"></script>\n");
      out.write("            <script src=\"assets/crossbrowserjs/respond.min.js\"></script>\n");
      out.write("            <script src=\"assets/crossbrowserjs/excanvas.min.js\"></script>\n");
      out.write("    <![endif]-->\n");
      out.write("    <script src=\"assets/plugins/slimscroll/jquery.slimscroll.min.js\"></script>\n");
      out.write("    <script src=\"assets/plugins/jquery-cookie/jquery.cookie.js\"></script>\n");
      out.write("    <!-- ================== END BASE JS ================== -->\n");
      out.write("\n");
      out.write("    <!-- ================== BEGIN PAGE LEVEL JS ================== -->\n");
      out.write("    <script src=\"assets/js/apps.min.js\"></script>\n");
      out.write("    <!-- ================== END PAGE LEVEL JS ================== -->\n");
      out.write("    <script>\n");
      out.write("        $(document).ready(function () {\n");
      out.write("            App.init();\n");
      out.write("        });\n");
      out.write("    </script>\n");
      out.write("</body>\n");
      out.write("</html>\n");
    } catch (Throwable t) {
      if (!(t instanceof SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          out.clearBuffer();
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
