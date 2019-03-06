package kr.co.ch03;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

/*
 * ��¥ : 2019/03/05
 * �̸� : ��ö��
 * ���� : Ioc �ǽ��ϱ�
 */
public class TVMain {

	public static void main(String[] args) {
		
		ApplicationContext ctx = new GenericXmlApplicationContext("spring-context.xml");
		TV stv = (SamsungTV) ctx.getBean("stv");
		TV ltv = (LgTV) ctx.getBean("ltv");
		
		stv.power();
		stv.chUp();
		stv.soundUp();
		stv.connect();
		
		ltv.power();
		ltv.chDown();
		ltv.soundDown();
		ltv.disconnect();
	}

}











