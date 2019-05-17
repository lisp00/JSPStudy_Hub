package com.edu.test;

import javax.servlet.http.HttpSessionEvent;
import javax.servlet.http.HttpSessionListener;

public class TestSessionListener implements HttpSessionListener{
	public TestSessionListener() {
		System.out.println("技记 按眉 积己");
	}
	
	@Override
	public void sessionCreated(HttpSessionEvent arg0) {
		System.out.println("技记 按眉 积己");
	}
	
	@Override
	public void sessionDestroyed(HttpSessionEvent arg0) {
		System.out.println("技记 按眉 秦力");
	}
}
