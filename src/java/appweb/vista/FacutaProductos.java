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
@WebServlet(name = "FacutaProductos", urlPatterns = {"/FacutaProductos"})
public class FacutaProductos extends HttpServlet {

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
            out.println("<title>Factura Productos</title>"); 
            out.println("<link rel=\"stylesheet\" type=\"text/css\" href=\"css/facturaProductoS.css\">");
            out.println("</head>");
            out.println("<body>");
            out.println("<form method=\"POST\">");
            out.println("<div id=\"contenidoFactura\">");
            out.println("<div>\n" +"<label for=\"insetar\"> FACTURA PRODUCTO </label>\n" +"</div>\n" +"");
            out.println("<div>\n" +"<label for=\"codigo\"> Codigo factura : </label>\n" +"<input type=\"text\" id=\"codigo\" name=\"codigo\">\n" +"</div>");
            out.println("<div>\n" +"<label for=\"idProducto\"> ID Producto : </label>\n" +"<input type=\"text\" id=\"idProducto\" name=\"idProducto\">\n" +"</div>");
            out.println("<div>\n" +"<label for=\"idProveedor\"> ID Proveedor : </label>\n" +"<input type=\"text\" id=\"idProveedor\" name=\"idProveedor\">\n" +"</div>");
            out.println("<div>\n" +"<label for=\"nombreProducto\"> Nombre producto : </label>\n" +"<input type=\"text\" id=\"idProducto\" name=\"idProducto\">\n" +"</div>");
            out.println("<div>\n" +"<label for=\"valorUnitario\"> Valor : </label>\n" +"<input type=\"text\" id=\"valorUnitario\" name=\"valorUnitario\">\n" +"</div>");
            out.println("<div>\n" +"<label for=\"iva\"> IVA : </label>\n" +"<input type=\"text\" id=\"iva\" name=\"iva\">\n" +"</div>");
            out.println("<div>\n" +"<input class=\"botones\" type =\"Reset\" id=\"btnCancelar\" value=\"Cancelar\">\n" +"<input class=\"botones\" type=\"submit\" id=\"btnGuardar\" value=\"Guardar\">\n" +"</div>");
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
