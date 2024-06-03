/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/JSP_Servlet/Servlet.java to edit this template
 */
package comprobar.usuario;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author USER
 */
@WebServlet(name = "LoginServlet", urlPatterns = {"/LoginServlet"})
public class LoginServlet extends HttpServlet {

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        try {
            // Obtener los parámetros del formulario
            String user = request.getParameter("username");
            String password = request.getParameter("password");
            
            // Llamar al servicio web para comprobar las credenciales

            ComprobarUsuario service = new ComprobarUsuario();
            //boolean resultado = port.comprobar(user, password);
            boolean resultado = service.Comprobar(user, password);
            
            // Redirigir según el resultado
            if (resultado) {
                // Si las credenciales son válidas, redirigir a la página de éxito
                response.sendRedirect("success.jsp");
            } else {
                // Si las credenciales son inválidas, redirigir a la página de error
                response.sendRedirect("error.jsp");
            }
        } catch (Exception e) {
            // Si ocurre algún error, redirigir a la página de error
            response.sendRedirect("error.jsp");
        }
    }

    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
