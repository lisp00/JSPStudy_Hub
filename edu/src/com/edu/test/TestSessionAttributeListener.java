package com.edu.test;

import javax.servlet.http.HttpSessionAttributeListener;
import javax.servlet.http.HttpSessionBindingEvent;

public class TestSessionAttributeListener implements HttpSessionAttributeListener{
	public TestSessionAttributeListener() {
		System.out.println("TestSessionAttributeListener ��ü ����");
	}

	@Override
	public void attributeAdded(HttpSessionBindingEvent arg0) {
		System.out.println("���� ��ü�� �Ӽ� �߰�");
	}

	@Override
	public void attributeRemoved(HttpSessionBindingEvent arg0) {
		System.out.println("���� ��ü�� �߰��� �Ӽ� ����");
	}

	@Override
	public void attributeReplaced(HttpSessionBindingEvent arg0) {
		System.out.println("���� ��ü�� �߰��� �Ӽ� ��ü");
	}
}
