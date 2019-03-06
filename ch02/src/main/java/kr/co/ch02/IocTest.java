package kr.co.ch02;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.GenericApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

/*
 * ��¥ : 2019/03/04
 * �̸� : ��ö��
 * ���� : Ioc �ǽ��ϱ�
 */
public class IocTest {
	
	public static void main(String[] args) {		
		// Ioc ��������� ��(���յ��� ����)
		LgTV ltv = new LgTV();		
		ltv.power();
		ltv.chDown();
		ltv.chUp();
		
		// �������� ������ ���յ� ���߱�
		TV stv = new SamsungTV();
		stv.power();
		stv.chDown();
		stv.chUp();
		
		// Ioc ������ ��ü����
		ApplicationContext ctx = new GenericXmlApplicationContext("spring-context.xml");
		SamsungTV getStv = (SamsungTV) ctx.getBean("stv");
		LgTV 	  getLtv = (LgTV) ctx.getBean("ltv");
		
		getStv.power();
		getStv.chDown();
		getStv.chUp();				
		
		getLtv.power();
		getLtv.chDown();
		getLtv.chUp();
	}	
}
