package com.edu.test;

import javax.servlet.ServletRequestEvent;
import javax.servlet.ServletRequestListener;

public class TestRequestListener implements ServletRequestListener {
	public TestRequestListener() {
		System.out.println("��ü ����");
	}
	
	@Override
	public void requestInitialized(ServletRequestEvent arg0) {
		System.out.println("��ü �ʱ�ȭ");
	}
	
	@Override
	public void requestDestroyed(ServletRequestEvent arg0) {
		System.out.println("��ü ����");
	}
	
}
