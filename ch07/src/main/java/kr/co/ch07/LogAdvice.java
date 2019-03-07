package kr.co.ch07;

import org.springframework.stereotype.Component;

@Component
public class LogAdvice {
	public void beforeAdvice() {
		System.out.println("Ⱦ�ܰ��� beforeAdvice...");
	}
	public void afterAdvice() {
		System.out.println("Ⱦ�ܰ��� afterAdvice...");
	}
	public void afterReturnAdvice() {
		System.out.println("Ⱦ�ܰ��� afterReturnAdvice...");
	}
	public void afterThrowAdvice() {
		System.out.println("Ⱦ�ܰ��� afterThrowAdvice...");
	}
	public void aroundAdvice() throws Throwable {
		System.out.println("Ⱦ�ܰ��� aroundAdvice...");
	}
}
