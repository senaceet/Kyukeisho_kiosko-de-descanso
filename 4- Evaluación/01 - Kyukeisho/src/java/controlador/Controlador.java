package controlador;

import java.io.IOException;
import java.sql.SQLException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import modelo.Encriptacion_MD5;
import modelo.Persona;
import modelo.PersonaDAO;


public class Controlador extends HttpServlet {
    PersonaDAO dao=new PersonaDAO();
    Persona p = new Persona();
    int r;
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
        throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        
        String accion = request.getParameter("accion");
        String message_error = "Correo/Contrasena Incorrecto";
        
        if(accion.equals("Ingresar")){
            String correo= request.getParameter("txtcorreo");
            String contraseña= request.getParameter("txtcontraseña");
            String contraseña_encriptado = Encriptacion_MD5.Encriptar(contraseña);
            
            p.setCorreo_usuario(correo);
            p.setContraseña_usuario(contraseña_encriptado);
            r = dao.Validar(p);
            HttpSession session=request.getSession();
            session.setAttribute("correo_e", correo);
           
            
            if(r==1){
                
                request.getSession().setAttribute("correo", correo);
                session.setAttribute("persona", p);                
                response.sendRedirect("Cliente/Cliente.jsp");                
            }else{
                request.getSession().setAttribute("message_e", message_error);
                response.sendRedirect("Cliente/Inicio_Sesion_Cliente.jsp");                
            }
        }
        
       if(accion.equals("Cerrar Sesion")){           
            HttpSession session = request.getSession();
            session.removeAttribute("persona");
            request.getSession().invalidate();
            response.sendRedirect("Cliente/Inicio_Sesion_Cliente.jsp"); 
            
        }
       
    }


    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }


    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }


    @Override
    public String getServletInfo() {
        return "Short description";
    }

}
