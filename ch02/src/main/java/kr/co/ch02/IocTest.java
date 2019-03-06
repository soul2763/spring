package kr.co.ch02;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.GenericApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

/*
 * 날짜 : 2019/03/04
 * 이름 : 김철학
 * 내용 : Ioc 실습하기
 */
public class IocTest {
	
	public static void main(String[] args) {		
		// Ioc 적용안했을 때(결합도가 높다)
		LgTV ltv = new LgTV();		
		ltv.power();
		ltv.chDown();
		ltv.chUp();
		
		// 다형성을 적용한 결합도 낮추기
		TV stv = new SamsungTV();
		stv.power();
		stv.chDown();
		stv.chUp();
		
		// Ioc 적용한 객체주입
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
