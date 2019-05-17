package com.edu.test;

import javax.servlet.ServletRequestEvent;
import javax.servlet.ServletRequestListener;

public class TestRequestListener implements ServletRequestListener {
	public TestRequestListener() {
		System.out.println("按眉 积己");
	}
	
	@Override
	public void requestInitialized(ServletRequestEvent arg0) {
		System.out.println("按眉 檬扁拳");
	}
	
	@Override
	public void requestDestroyed(ServletRequestEvent arg0) {
		System.out.println("按眉 秦力");
	}
	
}
