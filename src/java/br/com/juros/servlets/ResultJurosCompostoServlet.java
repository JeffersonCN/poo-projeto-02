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
 * @author gabrielfernandes1996
 */
public class ResultJurosCompostoServlet extends HttpServlet {

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
            double capital = 0;
            try {
                capital = Double.parseDouble(request.getParameter("capital"));
            } catch (Exception ex) {
            }
            double juros = 0;
            try {
                juros = Double.parseDouble(request.getParameter("taxa"));
            } catch (Exception ex) {
            }
            int tempo = 0;
            try {
                tempo = Integer.parseInt(request.getParameter("periodos"));
            } catch (Exception ex) {
            }            
            
            out.print(" <!DOCTYPE html> ");
            out.print(" <html lang='pt-BR'> ");
            out.print(" <head> ");
            out.print("     <title>Resultado - Juros Composto</title> ");
            out.print("     <meta charset='UTF-8'> ");
            out.print("     <meta name='viewport' content='width=device-width, initial-scale=1'> ");
            out.print("     <link rel='stylesheet' type='text/css' href='../assets/vendor/semantic/dist/semantic.min.css'> ");
            out.print("     <link href='../assets/style.css' rel='stylesheet'> ");
            out.print(" </head> ");
            out.print(" <body> ");
            out.print("     <div class='ui visible blue inverted sidebar vertical labeled icon menu'> ");
            out.print("         <a href='/poo-projeto-02/home' class='item'> ");
            out.print("             <i class='home left icon'></i> Home ");
            out.print("         </a> ");
            out.print("         <a href='/poo-projeto-02/juros-simples' class='item'> ");
            out.print("             <i class='percent left icon'></i> Juros Simples ");
            out.print("         </a> ");
            out.print("         <a href='/poo-projeto-02/juros-composto' class='active item'> ");
            out.print("             <i class='signal left icon'></i> Juros Composto ");
            out.print("         </a> ");
            out.print("     </div> ");
            out.print("     <div class='pusher'> ");
            out.print("         <h1 class='ui  header'>Juros Composto</h1> ");
            out.print("         <div class='ui divider'></div> ");
            out.print("         <div class='ui grid'> ");
            out.print("             <div class='sixteen wide mobile sixteen wide tablet twelve wide computer column'> ");
            out.print("                 <div class='ui clearing segment' id='resultados'> ");
            out.print("                     <div class='ui small statistics' id='valores'> ");
            out.print("                         <div class='statistic'> ");
            out.print("                             <div class='value'> ");
            out.print("                                 $ " + String.format("%.2f", capital));
            out.print("                             </div> ");
            out.print("                             <div class='label'> ");
            out.print("                                 Capital ");
            out.print("                             </div> ");
            out.print("                         </div> ");
            out.print("                         <div class='statistic'> ");
            out.print("                             <div class='value'> ");
            out.print("                                 " + String.format("%.2f", juros) + "% ");
            out.print("                             </div> ");
            out.print("                             <div class='label'> ");
            out.print("                                 Taxa de Juros ");
            out.print("                             </div> ");
            out.print("                         </div> ");
            out.print("                         <div class='statistic'> ");
            out.print("                             <div class='value'> ");
            out.print("                                 " + tempo);
            out.print("                             </div> ");
            out.print("                             <div class='label'> ");
            out.print("                                 Períodos ");
            out.print("                             </div> ");
            out.print("                         </div> ");
            out.print("                     </div> ");
            out.print("                      ");
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
            
            int controle = 1;
            double jurosSobreCapital;
            double montante = 0;
            do {
                out.print("                             <tr> ");
                out.print("                                 <td>" + controle + "</td> ");
                out.print("                                 <td> ");
                out.print("                                     <div>$ " + String.format("%.2f", capital) + "</div> ");
                out.print("                                 </td> ");
                
                jurosSobreCapital = capital * (juros / 100);
                
                out.print("                                 <td>$ " + String.format("%.2f", jurosSobreCapital) + "</td> ");
                
                montante = capital + jurosSobreCapital;
                
                out.print("                                 <td>$ " + String.format("%.2f", montante) + "</td> ");
                out.print("                             </tr> ");
                
                capital = montante;
                controle++;
            } while (controle != tempo + 1);
            
            
            
            
            out.print("                         </tbody> ");
            out.print("                     </table> ");
            out.print("                     <div class='ui statistic' > ");
            out.print("                         <div class='value'> ");
            out.print("                             $ 2960,00 ");
            out.print("                         </div> ");
            out.print("                         <div class='label'> ");
            out.print("                             Valor Futuro ");
            out.print("                         </div> ");
            out.print("                     </div> ");
            out.print("                 </div> ");
            out.print("             </div> ");
            out.print("         </div> ");
            out.print("     </div> ");
            out.print("     <script src='../assets/vendor/jquery/jquery-3.2.1.min.js'></script> ");
            out.print("     <script src='../assets/vendor/semantic/dist/semantic.min.js'></script> ");
            out.print("     <script src='../assets/script.js'></script> ");
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
