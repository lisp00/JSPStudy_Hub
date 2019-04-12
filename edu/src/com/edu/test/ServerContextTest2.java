package com.edu.test;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/context2")
public class ServerContextTest2 extends HttpServlet {
	@Override
	public void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		resp.setContentType("text/html;charset=UTF-8");
		PrintWriter out = resp.getWriter();

		ServletContext sc = this.getServletContext();

		out.print("���� ���� : " + sc.getMajorVersion() + "." + sc.getMinorVersion());
		out.print("<br>���� ���� : " + sc.getServerInfo());
		out.print("<br>�� ���ø����̼� ��� : " + sc.getContextPath());
		out.print("<br>�� ���ø����̼� �̸� : " + sc.getServletContextName());
		out.print("<br>���� ���� ��� : " + sc.getRealPath("/name.html"));
		sc.log("�α� ���");
		out.close();
	}
}
