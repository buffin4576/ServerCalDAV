/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package request;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author Buffin
 */
public class HTTPRequest extends HttpServlet {

    final String METHOD_GET = "GET";//
    final String METHOD_POST = "POST";//
    final String METHOD_PUT = "PUT";//
    final String METHOD_DELETE = "DELETE";//
    final String METHOD_PROPFIND = "PROPFIND";//
    final String METHOD_OPTIONS = "OPTIONS";//
    final String METHOD_HEAD = "HEAD";//
    final String METHOD_TRACE = "TRACE";//
    final String METHOD_COPY = "COPY";//
    final String METHOD_MOVE = "MOVE";//
    final String METHOD_PROPPATCH = "PROPPATCH";//
    final String METHOD_REPORT = "REPORT";//optionial
    final String METHOD_ACL = "ACL";//
    final String METHOD_LOCK = "LOCK";//
    final String METHOD_UNLOCK = "UNLOCK";//
    final String METHOD_MKCALENDAR = "MKCALENDAR";//optional
    
    @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp)
    throws ServletException, IOException
    {
        String method = req.getMethod();
        //resp.getWriter().write("Method: "+method);
        
        if (method.equals(METHOD_GET)) 
        {
            doGet(req, resp);
        } else if (method.equals(METHOD_POST)) 
        {
            doPost(req, resp);
        } else if (method.equals(METHOD_PUT)) 
        {
            doPut(req, resp);
        } else if (method.equals(METHOD_DELETE))
        {
            doDelete(req, resp);
        } else if(method.equals(METHOD_PROPFIND)){
            doPropfind(req,resp);
        } else if(method.equals(METHOD_OPTIONS)){
            doOptions(req,resp);
        } else if(method.equals(METHOD_HEAD)){
            doHead(req,resp);
        } else if(method.equals(METHOD_TRACE)){
            doTrace(req,resp);
        } else if(method.equals(METHOD_COPY)){
            doCopy(req,resp);
        } else if(method.equals(METHOD_MOVE)){
            doMove(req,resp);
        } else if(method.equals(METHOD_PROPPATCH)){
            doProppatch(req,resp);
        } else if(method.equals(METHOD_REPORT)){
            doReport(req,resp);
        } else if(method.equals(METHOD_ACL)){
            doAcl(req,resp);
        } else if(method.equals(METHOD_LOCK)){
            doLock(req,resp);
        } else if(method.equals(METHOD_UNLOCK)){
            doUnlock(req,resp);
        } else if(method.equals(METHOD_MKCALENDAR)){
            doMkcalendar(req,resp);
        }
        else
        {
            // Servlet doesn't currently support 
            // other types of request.
            String errMsg = "Method Not Supported";
            resp.sendError(HttpServletResponse.SC_NOT_IMPLEMENTED, errMsg);
        }
    }
    
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
        PrintWriter out = response.getWriter();
        try {
            /* TODO output your page here. You may use following sample code. */
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Servlet HTTPRequest</title>");            
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Servlet HTTPRequest at " + request.getContextPath() + "</h1>");
            out.println("</body>");
            out.println("</html>");
        } finally {
            out.close();
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
    
    @Override
    protected void doPut(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }
    
    @Override
    protected void doDelete(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }
    
    @Override
    protected void doOptions(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        //processRequest(request, response);
        response.setHeader("Allow", "OPTIONS, GET, HEAD, POST, PUT, DELETE, TRACE, COPY, MOVE, PROPFIND, PROPPATCH, LOCK, UNLOCK, REPORT, ACL");
        response.setHeader("DAV","1, 2, access-control, calendar-access");
        //response.setHeader("","");
    }
    
    @Override
    protected void doHead(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }
    
    protected void doLock(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }
    
    protected void doUnlock(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }
    
    protected void doPropfind(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }
    
    protected void doProppatch(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }
    
    protected void doReport(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }
    
    protected void doAcl(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }
    
    protected void doCopy(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }
    
    protected void doMove(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }
    
    protected void doMkcalendar(HttpServletRequest request, HttpServletResponse response)
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
