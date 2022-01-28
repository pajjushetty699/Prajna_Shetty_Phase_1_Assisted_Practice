package com;

import java.io.IOException;
import java.io.PrintWriter;
import java.io.*;
import javax.servlet.*;
import javax.servlet.annotation.WebServlet;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Interface
 */
@WebServlet("/Interface")
public class Interface extends HttpServlet {
	private static final long serialVersionUID = 1L;
	ServletConfig config=null;
    public void init(ServletConfig config){
        this.config=config;
        System.out.println("Initialization complete");
     }

	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");
        PrintWriter pwriter=response.getWriter();
        pwriter.print("In the service() method<br>");
       
    }
    public void destroy(){
        System.out.println("In destroy() method");
    }
    public ServletConfig getServletConfig(){
        return config;
    }
    public String getServletInfo(){
        return "This is a sample servlet info";
    }

	}


