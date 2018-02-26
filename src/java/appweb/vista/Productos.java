/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package appweb.vista;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author Usuario
 */
@WebServlet(name = "Productos", urlPatterns = {"/Productos"})
public class Productos extends HttpServlet {

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
            /* TODO output your page here. You may use following sample code. */
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Registra productos</title>");
            out.println("<link rel=\"stylesheet\" type=\"text/css\" href=\"css/coloresProducto.css\">");
            out.println("</head>");
            out.println("<body>");
            out.println("<form method=\"POST\">");
            out.println("<div id=\"contenidoProductos\">");
            out.println("<div>\n" +"<label for=\"productos\"> PRODUCTOS  </label>\n" +"</div>");
            out.println("<div>\n" +"<label for=\"nombre\"> Nombre : </label>\n" +"<input type=\"text\" id=\"nombre\" name=\"nombre\">\n" +"</div>");
            out.println("<div>\n" +"<label for=\"cantidad\"> Cantidad : </label>\n" +"<input type=\"text\" id=\"cantidad\" name=\"cantidad\">\n" +"</div>");
            out.println("<div>\n" +"<label for=\"tipo\"> Tipo : </label>\n" +"<input type=\"text\" id=\"tipo\" name=\"tipo\">\n" +"</div>");
            out.println("<div>\n" +"<label for=\"precio\"> Precio : </label>\n" +"<input type=\"text\" id=\"precio\" name=\"precio\">\n" +"</div>");
            out.println("<div>\n" +"<label for=\"fecharegistro\"> Fecha de registro : </label>\n" +"<input type=\"text\" id=\"fecharegistro\" name=\"fecharegistro\">\n" +"</div>");
            out.println("<div>\n" +"<label for=\"descripcion\"> Descripción : </label>\n" +"<input type=\"text\" id=\"descripcion\" name=\"descripcion\">\n" +"</div>");
            out.println("<div>\n" +"<input class=\"botones\" type =\"Reset\" id=\"btnCancelar\" value=\"Cancelar\">\n" +"<input class=\"botones\" type=\"submit\" id=\"btnRegistrar\" value=\"Registrar\">\n" +"</div>");
            out.println("</div>");
            out.println("</form>");
            out.println("</body>");
            out.println("</html>");
        }
    }

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
