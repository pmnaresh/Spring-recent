package com.practice;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.Servlet;
import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebServlet;

@WebServlet(urlPatterns = "/add")
public class MyServlet implements Servlet {

	@Override
	public void destroy() {
		System.out.println("i am in destory method");

	}

	@Override
	public ServletConfig getServletConfig() {
		System.out.println("i amin getServletConfig method");
		return null;
	}

	@Override
	public String getServletInfo() {
		System.out.println("i amin getServletInfo method");
		return null;
	}

	@Override
	public void init(ServletConfig arg0) throws ServletException {
		System.out.println("i amin init method");

	}

	@Override
	public void service(ServletRequest req, ServletResponse res) throws ServletException, IOException {
		System.out.println("i am in service method");

		int numberOne = Integer.parseInt(req.getParameter("numberone"));
		int numberTwo = Integer.parseInt(req.getParameter("numbertwo"));

		int result = numberOne + numberTwo;
		System.out.println("result is -->" + result);

		PrintWriter pr = res.getWriter();

		pr.println("<html>");
		pr.println("<head>");

		pr.println("<title> Naresh page </title>");

		pr.println("<body>");
		pr.println("<h1> adding of two numbers </h1>");

		pr.println("<p1>" + result + "</p1");

		pr.println("</body>");

		pr.println("</head>");

		pr.println("</html>");

		pr.close();

	}

}
