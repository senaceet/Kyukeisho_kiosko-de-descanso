package org.apache.jsp.Cliente;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.util.Iterator;
import java.util.List;
import modelo.Persona;
import modelo.consolas_DAO;
import modelo.consolas;

public final class Reservacion_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

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
      response.setContentType("text/html");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<!DOCTYPE html>\r\n");
      out.write("<html lang=\"en\">\r\n");
      out.write("\r\n");
      out.write("    ");

        Persona p = (Persona)session.getAttribute("persona");
        if(p==null){
        request.getRequestDispatcher("Inicio_Sesion_Cliente.jsp").forward(request, response);
    
    }
        response.addHeader("Cache-Control", "no-cache, no-store, must-revalidate");
        response.setDateHeader("Expires",0);    
    
    
      out.write("\r\n");
      out.write("<head>\r\n");
      out.write("    <meta charset=\"UTF-8\">\r\n");
      out.write("    <meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\">\r\n");
      out.write("    <meta http-equiv=\"X-UA-Compatible\" content=\"ie=edge\">\r\n");
      out.write("    <title>Reservaciones</title>\r\n");
      out.write("    <link rel=\"icon\" type=\"image/png\" href=\"https://fotos.subefotos.com/e296fe07575583952d4e106565eb2181o.png\">\r\n");
      out.write("  <link rel=\"stylesheet\" href=\"https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css\"\r\n");
      out.write("    integrity=\"sha384-ggOyR0iXCbMQv3Xipma34MD+dH/1fQ784/j6cY/iJTQUOhcWr7x9JvoRxT2MZw1T\" crossorigin=\"anonymous\">\r\n");
      out.write("  <link href=\"https://maxcdn.bootstrapcdn.com/font-awesome/4.7.0/css/font-awesome.min.css\" rel=\"stylesheet\"\r\n");
      out.write("    integrity=\"sha384-wvfXpqpZZVQGK6TAh5PVlGOfQNHSoD2xbE+QkPxCAFlNEevoEH3Sl0sibVcOQVnN\" crossorigin=\"anonymous\">\r\n");
      out.write("    \r\n");
      out.write("    \r\n");
      out.write("    <style> \r\n");
      out.write("            body {\r\n");
      out.write("                background-size: 100%;\r\n");
      out.write("                background-image: url( https://k33.kn3.net/taringa/7/2/7/0/4/4/Niphe/164.jpg);\r\n");
      out.write("            }\r\n");
      out.write("    </style>\r\n");
      out.write("\r\n");
      out.write("</head>\r\n");
      out.write("<body >\r\n");
      out.write("        <font style=\"color:rgb(255, 145, 0)\">\r\n");
      out.write("                <div class=\"header fixed-top\">\r\n");
      out.write("                     <nav class=\"navbar navbar-expand-lg navbar-light \" style=\"background-color: #343a40\">\r\n");
      out.write("        <a href=\"../index.html\">\r\n");
      out.write("          <img width=\"380\" height=\"70\" src=\"https://fotos.subefotos.com/105fb41d255ed1489a748b723f448441o.png\" class=\"img-fluid\" alt=\"Responsive image\">\r\n");
      out.write("          </a>      \r\n");
      out.write("      <div class=\"col-xl-1 text-center\" >\r\n");
      out.write("      <button class=\"navbar-toggler\" style=\"background-color: rgb(255, 251, 0)\" type=\"button\" data-toggle=\"collapse\"\r\n");
      out.write("        data-target=\"#navbarSupportedContent\" aria-controls=\"navbarSupportedContent\" aria-expanded=\"false\"\r\n");
      out.write("        aria-label=\"Toggle navigation\">\r\n");
      out.write("        <span class=\"navbar-toggler-icon\"></span>\r\n");
      out.write("      </button>\r\n");
      out.write("      </div>\r\n");
      out.write("      <div class=\"collapse navbar-collapse \" id=\"navbarSupportedContent\">\r\n");
      out.write("        <ul class=\"navbar-nav mr-auto\">\r\n");
      out.write("        </ul>\r\n");
      out.write("\r\n");
      out.write("        <ul class=\"navbar-nav \">\r\n");
      out.write("            <li class=\"nav-item dropdown mr-2\">\r\n");
      out.write("              <a class=\"nav-link dropdown-toggle navbar-DARK\" href=\"#\" id=\"navbarDropdown\" role=\"button\"\r\n");
      out.write("                data-toggle=\"dropdown\" aria-haspopup=\"true\" aria-expanded=\"false\" style=\"color:rgb(255, 217, 0)\">\r\n");
      out.write("                    ");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${correo}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\r\n");
      out.write("              </a>\r\n");
      out.write("                <div class=\"dropdown-menu mr-sm-2 \" aria-labelledby=\"navbarDropdown\" style=\"width:15rem; background-color: #343a40\">\r\n");
      out.write("                 <a class=\"dropdown-item\" href=\"#\" style=\"color:rgb(255, 217, 0)\">Mis reservaciones</a>\r\n");
      out.write("                 <a class=\"dropdown-item\" href=\"Perfil_Cliente.jsp\" style=\"color:rgb(255, 217, 0)\">Perfil</a>\r\n");
      out.write("                 <hr>\r\n");
      out.write("                 <form action=\"../Controlador\" method=\"post\">\r\n");
      out.write("                 <div class=\"form-group\">\r\n");
      out.write("                <div align=\"center\">\r\n");
      out.write("                    <input style=\"width: 14rem;\" class=\"btn btn-warning btn-block\" type=\"submit\" name=\"accion\" value=\"Cerrar Sesion\"> \r\n");
      out.write("                </div>               \r\n");
      out.write("                </div>\r\n");
      out.write("                 </form>\r\n");
      out.write("                </div>\r\n");
      out.write("            </li>\r\n");
      out.write("          </ul>\r\n");
      out.write("      </div>\r\n");
      out.write("    </nav>\r\n");
      out.write("                  \r\n");
      out.write("                  <nav class=\"navbar navbar-expand-lg navbar-light \" style=\"background-color: #fffb00\">\r\n");
      out.write("                    <div class=\"col-xl-1 text-center\" style=\"background-color: rgb(255, 251, 0)\">\r\n");
      out.write("                    <button class=\"navbar-toggler\" style=\"background-color: rgb(255, 251, 0)\" type=\"button\" data-toggle=\"collapse\"\r\n");
      out.write("                      data-target=\"#navbarSupportedContent2\" aria-controls=\"navbarSupportedContent\" aria-expanded=\"false\"\r\n");
      out.write("                      aria-label=\"Toggle navigation\">\r\n");
      out.write("                      MENU<span class=\"navbar-toggler-icon\"></span>\r\n");
      out.write("                    </button>\r\n");
      out.write("                        </div>\r\n");
      out.write("                    <div class=\"collapse navbar-collapse \" id=\"navbarSupportedContent2\">\r\n");
      out.write("              \r\n");
      out.write("                    <div class=\"col-xl-3 text-left\" style=\"background-color: rgb(255, 251, 0)\">\r\n");
      out.write("                        <button class=\"btn text-right btn-lg dropdown-toggle\" style=\"border-color: rgba(133, 133, 133, 0)\" type=\"button\"\r\n");
      out.write("                        data-toggle=\"dropdown\" aria-haspopup=\"true\" aria-expanded=\"false\">\r\n");
      out.write("                        <i class=\"fa fa-bars\" aria-hidden=\"true\"></i><strong> Categorias</strong>\r\n");
      out.write("                      </button>\r\n");
      out.write("                      <div class=\"dropdown-menu btn-lg \" aria-labelledby=\"dropdownMenuButton\"\r\n");
      out.write("                      style=\"width:14rem; background-color: rgb(255, 251, 0)\">\r\n");
      out.write("          <a href=\"../Juegos.jsp\" class=\"dropdown-item\" style=\"color: rgb(0, 0, 0)\">Juegos para consolas</a>\r\n");
      out.write("          <a class=\"dropdown-item\" style=\"color: rgb(0, 0, 0)\" href=\"../Productos.jsp\">Productos y accesorios</a>\r\n");
      out.write("                    </div>\r\n");
      out.write("                    </div>\r\n");
      out.write("                      \r\n");
      out.write("                      <div class=\"col-xl-3 text-left\" style=\"background-color: rgb(255, 251, 0)\">\r\n");
      out.write("                        <a href=\"../Conocenos.html\">\r\n");
      out.write("                          <button type=\"button\" style=\"border-color: rgba(133, 133, 133, 0)\" class=\"btn btn-outline-dark\">\r\n");
      out.write("                            <h5><strong><i class=\"fa fa-users\" aria-hidden=\"true\"></i> Conocenos</strong></h5>\r\n");
      out.write("                          </button>\r\n");
      out.write("                        </a>\r\n");
      out.write("                      </div>\r\n");
      out.write("                      <div class=\"col-xl-3 text-left\" style=\"background-color: rgb(255, 251, 0)\">\r\n");
      out.write("                        <a href=\"../contactenos.html\">\r\n");
      out.write("                          <button type=\"button\" style=\"border-color: rgba(133, 133, 133, 0)\"\r\n");
      out.write("                            class=\"btn btn-outline-dark\">\r\n");
      out.write("                            <h5><strong><i class=\"fa fa-phone\" aria-hidden=\"true\"></i> Contactanos</strong></h5>\r\n");
      out.write("                          </button>\r\n");
      out.write("                        </a>\r\n");
      out.write("                      </div>\r\n");
      out.write("                      <div class=\"col-xl-3 text-left\" style=\"background-color: rgb(255, 251, 0)\">\r\n");
      out.write("                        <a href=\"https://kyukeisho.blogspot.com/\">\r\n");
      out.write("                          <button type=\"button\" style=\"border-color: rgba(133, 133, 133, 0)\"\r\n");
      out.write("                            class=\"btn btn-outline-dark\">\r\n");
      out.write("                            <h5><strong><i class=\"fa fa-commenting\" aria-hidden=\"true\"></i> Blog</strong></h5>\r\n");
      out.write("                          </button>\r\n");
      out.write("                        </a>\r\n");
      out.write("                      </div>\r\n");
      out.write("                     </div>\r\n");
      out.write("                    </nav>\r\n");
      out.write("                   </div>\r\n");
      out.write("                 </div>\r\n");
      out.write("              </div>\r\n");
      out.write("    <br>\r\n");
      out.write("    <br>\r\n");
      out.write("    <br>\r\n");
      out.write("    <br>\r\n");
      out.write("    <br>\r\n");
      out.write("    <br>\r\n");
      out.write("    <br>\r\n");
      out.write("    <br>\r\n");
      out.write("<center>\r\n");
      out.write("        <div class=\"alert alert-danger\" role=\"alert\" style=\"width:30rem;\">\r\n");
      out.write("                <h4 class=\"alert-heading\">Recuerda!!</h4>\r\n");
      out.write("                <hr>\r\n");
      out.write("                <p>Abrimos desde las 06:00 AM <br>hasta las 10:00 PM de lunes a viernes.</p>\r\n");
      out.write("              </div>\r\n");
      out.write("    <div class=\"card\" style=\"width:30rem; background-color: rgba(116, 116, 116, 0.473)\">\r\n");
      out.write("            <article class=\"card-body mx-auto\" style=\"max-width: 400px;\">\r\n");
      out.write("                <h4 class=\"card-title mt-3 text-center\">RESERVA TU CONSOLA</h4>\r\n");
      out.write("                <br>\r\n");
      out.write("                <p class=\"text-center\">Diligencia el formulario para proceder</p>\r\n");
      out.write("                \r\n");
      out.write("                <form method=\"post\" action=\"../registro_reservacion\">\r\n");
      out.write("                <div class=\"form-group input-group\">\r\n");
      out.write("                    <div class=\"input-group-prepend\">\r\n");
      out.write("                        <span class=\"input-group-text\"> <i class=\"fa fa-gamepad\" aria-hidden=\"true\"></i> </span>\r\n");
      out.write("                    </div>\r\n");
      out.write("                                    <select class=\"form-control\" name=\"consola\">\r\n");
      out.write("                                     <option>-- Seleccione categoria juego --</option>\r\n");
      out.write("                                     ");

                                         consolas_DAO ca= new consolas_DAO();
                                         List<consolas> listciu = ca.listar();
                                         Iterator<consolas> iterciu = listciu.iterator();
                                         consolas cat = null;
                                         while (iterciu.hasNext()) {
                                             cat = iterciu.next();
                                     
      out.write("\r\n");
      out.write("                                     <option value=\"");
      out.print( cat.getid_consola() );
      out.write('"');
      out.write('>');
      out.print( cat.getnombre_consola());
      out.write("</option>\r\n");
      out.write("                                     ");
}
      out.write("\r\n");
      out.write("                                 </select>\r\n");
      out.write("                    \r\n");
      out.write("                </div> \r\n");
      out.write("\r\n");
      out.write("                    <div class=\"form-group\">\r\n");
      out.write("                            <label >Fecha de inicio</label>\r\n");
      out.write("                            <input name=\"fecha\" type=\"date\" max=\"3000-12-31\" min=\"1000-01-01\" class=\"form-control\">\r\n");
      out.write("                           </div>\r\n");
      out.write("                    \r\n");
      out.write("                    <div class=\"form-group\">\r\n");
      out.write("                                <label >Hora de inicio</label>\r\n");
      out.write("                                  <input name=\"hora\" class=\"form-control\" type=\"time\" value=\"22:00:00\">\r\n");
      out.write("                              </div>\r\n");
      out.write("                              <br>\r\n");
      out.write("                              \r\n");
      out.write("                <div class=\"form-group\">\r\n");
      out.write("                    <button type=\"submit\" class=\"btn btn-warning btn-block\"> Reservar  </button>\r\n");
      out.write("                </div>  \r\n");
      out.write("                              \r\n");
      out.write("            </form>\r\n");
      out.write("            </article>\r\n");
      out.write("            </div> \r\n");
      out.write("            \r\n");
      out.write("        </center>\r\n");
      out.write("        <br>\r\n");
      out.write("        <br>\r\n");
      out.write("        <br>\r\n");
      out.write("        <br>\r\n");
      out.write("        <footer class=\"page-footer font-small indigo\" style=\"background-color:rgb(0, 0, 0)\">\r\n");
      out.write("          <div class=\"container\">\r\n");
      out.write("            <div class=\"row\">\r\n");
      out.write("              <h5 style=\"color:rgb(255, 230, 0)\">¿Preguntas? Llama al ** *** *** ****</h5>\r\n");
      out.write("            </div>\r\n");
      out.write("            <div class=\"row\">\r\n");
      out.write("            </div>\r\n");
      out.write("          </div>\r\n");
      out.write("          <div class=\"container text-center text-md-left\">\r\n");
      out.write("            <div class=\"row\">\r\n");
      out.write("              <div class=\"col-md-3 mx-auto\">\r\n");
      out.write("                <br>\r\n");
      out.write("                <ul class=\"list-unstyled\">\r\n");
      out.write("                  <li>\r\n");
      out.write("                    <a href=\"#!\" style=\"color:rgb(255, 230, 0)\">Preguntas frecuentes</a>\r\n");
      out.write("                    <br>\r\n");
      out.write("                    <a href=\"#!\" style=\"color:rgb(255, 230, 0)\">Preferencias de cookies</a>\r\n");
      out.write("                  </li>\r\n");
      out.write("                </ul>\r\n");
      out.write("                <br>\r\n");
      out.write("                <div class=\"dropdown\">\r\n");
      out.write("                  <button class=\"btn btn-outline-warning dropdown-toggle\" type=\"button\" id=\"dropdownMenuButton\"\r\n");
      out.write("                    data-toggle=\"dropdown\" aria-haspopup=\"true\" aria-expanded=\"false\">\r\n");
      out.write("                    <i class=\"fa fa-globe\" aria-hidden=\"true\"></i> Idioma\r\n");
      out.write("                  </button>\r\n");
      out.write("                  <div class=\"dropdown-menu\" style=\"background-color:rgb(255, 208, 0)\" aria-labelledby=\"dropdownMenuButton\">\r\n");
      out.write("                    <a class=\"dropdown-item\" href=\"#\">Español</a>\r\n");
      out.write("                    <a class=\"dropdown-item\" href=\"#\">Ingles</a>\r\n");
      out.write("                  </div>\r\n");
      out.write("                </div>\r\n");
      out.write("                <br>\r\n");
      out.write("                </ul>\r\n");
      out.write("              </div>\r\n");
      out.write("              <hr class=\"clearfix w-100 d-md-none\">\r\n");
      out.write("              <div class=\"col-md-3 mx-auto\">\r\n");
      out.write("                <ul class=\"list-unstyled\">\r\n");
      out.write("                  <li>\r\n");
      out.write("                    <br>\r\n");
      out.write("                    <a href=\"#!\" style=\"color:rgb(255, 230, 0)\">Centro de ayuda</a>\r\n");
      out.write("                    <br>\r\n");
      out.write("                    <a href=\"#!\" style=\"color:rgb(255, 230, 0)\">Informacion corporativa</a>\r\n");
      out.write("                  </li>\r\n");
      out.write("                </ul>\r\n");
      out.write("              </div>\r\n");
      out.write("              <hr class=\"clearfix w-100 d-md-none\">\r\n");
      out.write("              <div class=\"col-md-3 mx-auto\">\r\n");
      out.write("                <ul class=\"list-unstyled\">\r\n");
      out.write("                  <li>\r\n");
      out.write("                    <br>\r\n");
      out.write("                    <a href=\"#!\"style=\"color:rgb(255, 230, 0)\">Terminos de uso</a>\r\n");
      out.write("                  </li>\r\n");
      out.write("                </ul>\r\n");
      out.write("              </div>\r\n");
      out.write("              <hr class=\"clearfix w-100 d-md-none\">\r\n");
      out.write("              <div class=\"col-md-3 mx-auto\">\r\n");
      out.write("                <ul class=\"list-unstyled\">\r\n");
      out.write("                  <li>\r\n");
      out.write("                    <br>\r\n");
      out.write("                    <a href=\"#!\" style=\"color:rgb(255, 230, 0)\">Privacidad</a>\r\n");
      out.write("                  </li>\r\n");
      out.write("                </ul>\r\n");
      out.write("              </div>\r\n");
      out.write("            </div>\r\n");
      out.write("          </div>\r\n");
      out.write("          <br>\r\n");
      out.write("        </footer>\r\n");
      out.write("      </font>\r\n");
      out.write("      <div class=\"copyright text-center  font-weight-bold p-2\" style=\"background-color: #343a40\">\r\n");
      out.write("        <p style=\"color:rgb(255, 217, 0)\">Desarrollado por Kyukeisho Copyright<i class=\"fa fa-copyright\"\r\n");
      out.write("            aria-hidden=\"true\"></i> 2019</p>\r\n");
      out.write("      </div>\r\n");
      out.write("    \r\n");
      out.write("      <script src=\"https://code.jquery.com/jquery-3.2.1.slim.min.js\"\r\n");
      out.write("        integrity=\"sha384-KJ3o2DKtIkvYIK3UENzmM7KCkRr/rE9/Qpg6aAZGJwFDMVNA/GpGFF93hXpG5KkN\"\r\n");
      out.write("        crossorigin=\"anonymous\"></script>\r\n");
      out.write("      <script src=\"https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.12.3/umd/popper.min.js\"\r\n");
      out.write("        integrity=\"sha384-vFJXuSJphROIrBnz7yo7oB41mKfc8JzQZiCq4NCceLEaO4IHwicKwpJf9c9IpFgh\"\r\n");
      out.write("        crossorigin=\"anonymous\"></script>\r\n");
      out.write("      <script src=\"https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0-beta.2/js/bootstrap.min.js\"\r\n");
      out.write("        integrity=\"sha384-alpBpkh1PFOepccYVYDB4do5UnbKysX5WZXm3XxPqe5iKTfUKjNkCk9SaVuEZflJ\"\r\n");
      out.write("        crossorigin=\"anonymous\"></script>\r\n");
      out.write("\r\n");
      out.write("</body>\r\n");
      out.write("</html>");
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
