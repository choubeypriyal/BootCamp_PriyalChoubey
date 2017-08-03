package com.cdk.cricket;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Iterator;

public class CricketServlet extends HttpServlet {
    ArrayList<CricketMatch> details = new ArrayList<>(5);

    public void init(){
        details.add(new CricketMatch("England","India","T20","India","Wankhede","MS Dhoni"));
        details.add(new CricketMatch("England","India","One Day","England","chinnaswami","Alystair Cooke"));
        details.add(new CricketMatch("England","India","Test","India","Manchester","Rahul DRavid"));
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        PrintWriter pw = response.getWriter();
        String countery1 = request.getParameter("country1");
        String countery2 = request.getParameter("country2");
        String matchType = request.getParameter("match");

        Iterator<CricketMatch> itr  = details.iterator();
        while(itr.hasNext()) {
          CricketMatch match = itr.next();
          if(match.getCountry1().equals(countery1) && match.getCountry2().equals(countery2) && match.getMatchType().equals(matchType)){
              pw.write(match.toString());
              break;
          }

        }
    }
}
