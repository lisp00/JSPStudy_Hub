package com.edu.test;

import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;
import javax.servlet.annotation.WebListener;

@WebListener
public class TestServletContextListener implements ServletContextListener {
	public TestServletContextListener() {
		System.out.println("TestServletContextListener ��ü ����");
	}
	@Override
	public void contextInitialized(ServletContextEvent arg0) {
		System.out.println("TestServletContextListener ��ü �ʱ�ȭ");

	}
	@Override
	public void contextDestroyed(ServletContextEvent arg0) {
		System.out.println("TestServletContextListener ��ü ����");
	}
}
  