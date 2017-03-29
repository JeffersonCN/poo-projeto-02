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
public class FormJurosCompostoServlet extends HttpServlet {

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
            out.print(" <!DOCTYPE html> ");
            out.print(" <html lang='pt-BR'> ");
            out.print(" <head> ");
            out.print("     <title>Juros Composto</title> ");
            out.print("     <meta charset='UTF-8'> ");
            out.print("     <meta name='viewport' content='width=device-width, initial-scale=1'> ");
            out.print("     <link rel='stylesheet' type='text/css' href='assets/vendor/semantic/dist/semantic.min.css'> ");
            out.print("     <link href='assets/style.css' rel='stylesheet'> ");
            out.print(" </head> ");
            out.print(" <body> ");
            out.print("     <div class='ui visible blue inverted sidebar vertical labeled icon menu'> ");
            out.print("         <a href='home' class='item'> ");
            out.print("             <i class='home left icon'></i> Home ");
            out.print("         </a> ");
            out.print("         <a href='juros-simples' class='item'> ");
            out.print("             <i class='percent left icon'></i> Juros Simples ");
            out.print("         </a> ");
            out.print("         <a href='juros-composto' class='active item'> ");
            out.print("             <i class='signal left icon'></i> Juros Composto ");
            out.print("         </a> ");
            out.print("     </div> ");
            out.print("     <div class='pusher'> ");
            out.print("         <h1 class='ui  header'>Juros Composto</h1> ");
            out.print("         <div class='ui divider'></div> ");
            out.print("         <div class='ui grid'> ");
            out.print("             <div class='sixteen wide mobile sixteen wide tablet eight wide computer column'> ");
            out.print("                 <div class='ui clearing segment swing-down'> ");
            out.print("                     <form action='juros-composto/resultado' class='ui large form'> ");
            out.print("                         <h4 class='ui dividing header'>Informações para o cálculo</h4> ");
            out.print("                         <div class='field'> ");
            out.print("                             <label for=''>Capital</label> ");
            out.print("                             <div class='ui left icon input'> ");
            out.print("                                 <input type='text' name='capital' id='capital' value=''> ");
            out.print("                                 <i class='dollar icon'></i> ");
            out.print("                             </div> ");
            out.print("                         </div> ");
            out.print("                         <div class='field'> ");
            out.print("                             <label for='taxa'>Taxa</label> ");
            out.print("                             <div class='ui left icon input'> ");
            out.print("                                 <input type='number' name='taxa' id='taxa' value=''> ");
            out.print("                                 <i class='percent icon'></i> ");
            out.print("                             </div> ");
            out.print("                         </div> ");
            out.print("                         <div class='field'> ");
            out.print("                             <label for=''>Períodos</label> ");
            out.print("                             <div class='ui left icon input'> ");
            out.print("                                 <input type='number' name='periodos' value=''> ");
            out.print("                                 <i class='calendar icon'></i> ");
            out.print("                             </div> ");
            out.print("                         </div> ");
            out.print("                         <div class='ui right labeled icon positive large right floated submit button'> ");
            out.print("                             <i class='right calculator icon'></i> Calcular ");
            out.print("                         </div> ");
            out.print("                     </form> ");
            out.print("                 </div> ");
            out.print("             </div> ");
            out.print("             <div class='sixteen wide mobile sixteen wide tablet eight wide computer column'> ");
            out.print("                 <div class='ui clearing segment swing-down'> ");
            out.print("                     <h4 class='ui dividing header'>Descrição</h4> ");
            out.print("                     <p>O regime de juros compostos é o mais comum no sistema financeiro e portanto, o mais útil para cálculos ");
            out.print("                         de problemas do dia-a-dia. ");
            out.print("                     </p> ");
            out.print("                     <p> Os juros gerados a cada período são incorporados ao principal para o cálculo dos juros do período seguinte. ");
            out.print("                         </p> ");
            out.print("                 </div> ");
            out.print("             </div> ");
            out.print("         </div> ");
            out.print("     </div> ");
            out.print("     <script src='https://code.jquery.com/jquery-3.1.1.min.js' integrity='sha256-hVVnYaiADRTO2PzUGmuLJr8BLUSjGIZsDYGmIJLv2b8=' ");
            out.print("         crossorigin='anonymous'></script> ");
            out.print("     <script src='assets/vendor/semantic/dist/semantic.min.js'></script> ");
            out.print("     <script src='assets/script.js'></script> ");
            out.print(" </body> ");
            out.print(" </html> ");
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
