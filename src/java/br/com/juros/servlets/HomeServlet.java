/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.juros.servlets;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author jeffersoncn
 */
public class HomeServlet extends HttpServlet {

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
            out.print("<!DOCTYPE html>");
out.print("<html lang='pt-BR'>");
out.print("<head>");
out.print("    <title>Home - Projeto 02 - Programação Orientada a Objetos</title>");
out.print("    <meta charset='UTF-8'>");
out.print("    <meta name='viewport' content='width=device-width, initial-scale=1'>");
out.print("    <link rel='stylesheet' type='text/css' href='assets/vendor/semantic/dist/semantic.min.css'>");
out.print("    <link href='assets/style.css' rel='stylesheet'>");
out.print("</head>");
out.print("<body>");
out.print("    <div class='ui visible inverted blue sidebar vertical labeled icon menu'>");
out.print("        <a href='home' class='active item'>");
out.print("            <i class='home left icon'></i> Home");
out.print("        </a>");
out.print("        <a href='juros-simples' class='item'>");
out.print("            <i class='percent left icon'></i> Juros Simples");
out.print("        </a>");
out.print("        <a href='juros-composto' class='item'>");
out.print("            <i class='signal left icon'></i> Juros Composto");
out.print("        </a>");
out.print("    </div>");
out.print("    <div class='pusher'>");
out.print("        <h1 class='ui header'>Home</h1>");
out.print("        <div class='ui divider'></div>");
out.print("        <div class='ui link cards'>");
out.print("            <div class='blue card'>");
out.print("                <a class='image' href='juros-simples'>");
out.print("                    <img src='assets/images/juros-simples.jpg'>");
out.print("                </a>");
out.print("                <div class='content'>");
out.print("                    <a class='header' href='juros-simples'>Juros Simples</a>");
out.print("                    <div class='description'>");
out.print("                        Quando o percentual de juros incide apenas sobre o valor principal.");
out.print("                    </div>");
out.print("                </div>");
out.print("            </div>");
out.print("            <div class='blue card'>");
out.print("                <a class='image' href='juros-composto'>");
out.print("                    <img src='assets/images//juros-composto.jpg'>");
out.print("                </a>");
out.print("                <div class='content'>");
out.print("                    <a class='header' href='juros-composto'>Juros Composto</a>");
out.print("                    <div class='description'>");
out.print("                        Os juros gerados a cada período são incorporados ao principal para o cálculo dos juros do período seguinte.");
out.print("                    </div>");
out.print("                </div>");
out.print("            </div>");
out.print("        </div>");
out.print("    </div>");
out.print("    <script src='https://code.jquery.com/jquery-3.1.1.min.js' integrity='sha256-hVVnYaiADRTO2PzUGmuLJr8BLUSjGIZsDYGmIJLv2b8='");
out.print("        crossorigin='anonymous'></script>");
out.print("    <script src='assets/vendor/semantic/dist/semantic.min.js'></script>");
out.print("    <script src='assets/script.js'></script>");
out.print("</body>");
out.print("</html>");
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
