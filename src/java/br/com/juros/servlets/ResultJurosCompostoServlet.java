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
            /* TODO output your page here. You may use following sample code. */
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Servlet ResultJurosCompostoServlet</title>");            
            out.println("</head>");
             out.println("<body>");
            double capital = 0;
            try{ capital = Double.parseDouble(request.getParameter("capital"));
            }catch(Exception ex){}
            double juros = 0;
            try{ juros = Double.parseDouble(request.getParameter("taxa"));
            }catch(Exception ex){}
            int tempo = 0;
            try{ tempo = Integer.parseInt(request.getParameter("periodos"));
            }catch(Exception ex){}
            int controle = 1;
            double juroscalculado = 1 + (juros/100);
            double taxajuros = Math.pow(juroscalculado, tempo);
            double montante = capital * juroscalculado;
                    out.println("<h1>Resultado: </h1>");
                    out.println("<h2>O valor do Capital inserido foi R$: "+ String.format("%.2f", capital) + "</h2>");
                    out.println("<h2>A taxa de juros: " + juros + "%</h2>");
                    out.println("<h2>O tempo em meses: " + tempo + "</h2>");
                        do {
                            out.println("<h2>Valor do montante no mês " + controle + " será: " + String.format("%.2f", montante) + "</h2>");
                            capital = montante;
                            montante = (montante* juroscalculado);
                            controle++;
                        } while (controle != tempo + 1);
                        
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