package kr.co.ch05;

import org.springframework.stereotype.Component;

@Component
public class LogAdvice {
	
	public void beforLog() {
		System.out.println("========================");
		System.out.println("Ⱦ�ܰ��� - beforLog ...");
	}
	
	public void afterLog() {		
		System.out.println("Ⱦ�ܰ��� - afterLog ...");
		System.out.println("------------------------");
	}
	
}
