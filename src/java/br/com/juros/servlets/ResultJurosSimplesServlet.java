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
public class ResultJurosSimplesServlet extends HttpServlet {

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

            double c = 0;
            try {
                c = Double.parseDouble(request.getParameter("capital"));
            } catch (Exception ex) {
            }
            double j = 0;
            try {
                j = Double.parseDouble(request.getParameter("taxa"));
            } catch (Exception ex) {
            }
            int t = 0;
            try {
                t = Integer.parseInt(request.getParameter("periodos"));
            } catch (Exception ex) {
            }

            out.print(" <!DOCTYPE html> ");
            out.print(" <html lang='pt-BR'> ");
            out.print("  ");
            out.print(" <head> ");
            out.print("     <title>Resultado - Juros Simples</title> ");
            out.print("     <meta charset='UTF-8'> ");
            out.print("     <meta name='viewport' content='width=device-width, initial-scale=1'> ");
            out.print("     <link rel='stylesheet' type='text/css' href='../assets/vendor/semantic/dist/semantic.min.css'> ");
            out.print("     <link href='../assets/style.css' rel='stylesheet'> ");
            out.print(" </head> ");
            out.print("  ");
            out.print(" <body> ");
            out.print("     <div class='ui visible blue inverted sidebar vertical labeled icon menu'> ");
            out.print("         <a href='/poo-projeto-02/home' class='item'> ");
            out.print("             <i class='home left icon'></i> Home ");
            out.print("         </a> ");
            out.print("         <a href='/poo-projeto-02/juros-simples' class='active item'> ");
            out.print("             <i class='percent left icon'></i> Juros Simples ");
            out.print("         </a> ");
            out.print("         <a href='/poo-projeto-02/juros-composto' class='item'> ");
            out.print("             <i class='signal left icon'></i> Juros Composto ");
            out.print("         </a> ");
            out.print("     </div> ");
            out.print("  ");
            out.print("     <div class='pusher'> ");
            out.print("         <h1 class='ui  header'>Juros Simples</h1> ");
            out.print("  ");
            out.print("         <div class='ui divider'></div> ");
            out.print("  ");
            out.print("         <div class='ui grid'> ");
            out.print("             <div class='sixteen wide mobile sixteen wide tablet twelve wide computer column'> ");
            out.print("                 <div class='ui clearing segment' id='resultados'> ");
            out.print("                     <div class='ui small statistics' id='valores'> ");
            out.print("                         <div class='statistic'> ");
            out.print("                             <div class='value'> ");
            out.print("                                 $ 1000,00 ");
            out.print("                             </div> ");
            out.print("                             <div class='label'> ");
            out.print("                                 Capital ");
            out.print("                             </div> ");
            out.print("                         </div> ");
            out.print("                         <div class='statistic'> ");
            out.print("                             <div class='value'> ");
            out.print("                                 4% ");
            out.print("                             </div> ");
            out.print("                             <div class='label'> ");
            out.print("                                 Taxa de Juros ");
            out.print("                             </div> ");
            out.print("                         </div> ");
            out.print("                         <div class='statistic'> ");
            out.print("                             <div class='value'> ");
            out.print("                                 12 ");
            out.print("                             </div> ");
            out.print("                             <div class='label'> ");
            out.print("                                 Períodos ");
            out.print("                             </div> ");
            out.print("                         </div> ");
            out.print("                     </div> ");
            out.print("  ");
            out.print("                     <h3 class='ui dividing left aligned header'>Resultados</h3> ");
            out.print("                     <table class='ui selectable celled blue large table'> ");
            out.print("                         <thead> ");
            out.print("                             <tr> ");
            out.print("                                 <th>Período</th> ");
            out.print("                                 <th>Capital</th> ");
            out.print("                                 <th>Juros</th> ");
            out.print("                                 <th>Montante</th> ");
            out.print("                             </tr> ");
            out.print("                         </thead> ");
            out.print("                         <tbody> ");
            
            double montante = 0;
            double juros = c * ((double)j / 100);
            
            for (int i = 1; i <= t; i++) {
                out.print("                             <tr> ");
                out.print("                                 <td>" + i + "</td> ");
                out.print("                                 <td> ");
                out.print("                                     <div>$ " + String.format("%.2f", c) + "</div> ");
                out.print("                                 </td> ");
                out.print("                                 <td>$ " + String.format("%.2f", juros) + "</td> ");
                
                montante = c + juros;
                
                out.print("                                 <td>$ " + String.format("%.2f", montante) + "</td> ");
                out.print("                             </tr> ");
                c = montante;
            }
            
            out.print("                         </tbody> ");
            out.print("                     </table> ");
            out.print("                     <div class='ui statistic'> ");
            out.print("                         <div class='value'> ");
            out.print("                             $ " + String.format("%.2f", montante));
            out.print("                         </div> ");
            out.print("                         <div class='label'> ");
            out.print("                             Valor Futuro ");
            out.print("                         </div> ");
            out.print("                     </div> ");
            out.print("                 </div> ");
            out.print("             </div> ");
            out.print("         </div> ");
            out.print("  ");
            out.print("     </div> ");
            out.print("  ");
            out.print("     <script src='https://code.jquery.com/jquery-3.1.1.min.js' integrity='sha256-hVVnYaiADRTO2PzUGmuLJr8BLUSjGIZsDYGmIJLv2b8=' ");
            out.print("         crossorigin='anonymous'></script> ");
            out.print("     <script src='../assets/vendor/semantic/dist/semantic.min.js'></script> ");
            out.print("     <script src='../assets/script.js'></script> ");
            out.print(" </body> ");
            out.print("  ");
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
