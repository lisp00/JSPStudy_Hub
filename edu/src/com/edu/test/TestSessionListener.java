package com.edu.test;

import javax.servlet.http.HttpSessionEvent;
import javax.servlet.http.HttpSessionListener;

public class TestSessionListener implements HttpSessionListener{
	public TestSessionListener() {
		System.out.println("���� ��ü ����");
	}
	
	@Override
	public void sessionCreated(HttpSessionEvent arg0) {
		System.out.println("���� ��ü ����");
	}
	
	@Override
	public void sessionDestroyed(HttpSessionEvent arg0) {
		System.out.println("���� ��ü ����");
	}
}
