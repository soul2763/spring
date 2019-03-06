package kr.co.ch05;

import org.springframework.stereotype.Component;

@Component
public class LogAdvice {
	
	public void beforLog() {
		System.out.println("========================");
		System.out.println("È¾´Ü°ü½É - beforLog ...");
	}
	
	public void afterLog() {		
		System.out.println("È¾´Ü°ü½É - afterLog ...");
		System.out.println("------------------------");
	}
	
}
