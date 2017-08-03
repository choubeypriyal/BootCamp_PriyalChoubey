package com.servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Calendar;
import java.util.Date;

public class Servlet extends javax.servlet.http.HttpServlet {

    protected void doGet(javax.servlet.http.HttpServletRequest request, javax.servlet.http.HttpServletResponse response) throws javax.servlet.ServletException, IOException {
        response.setContentType("text/HTML");
        PrintWriter pw = response.getWriter();
        pw.write("<html>");
        pw.write("<head><title>Random Number Generator and Date</title></head>");
        pw.write("<body>");
        pw.write((int) Math.random()*1000);
        Calendar cal = Calendar.getInstance();
        Date currentTime = cal.getTime();
        pw.write(String.valueOf(currentTime));
        pw.write("</body></html>");
    }
}
