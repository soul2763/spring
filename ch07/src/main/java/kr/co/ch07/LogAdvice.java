package kr.co.ch07;

import org.springframework.stereotype.Component;

@Component
public class LogAdvice {
	public void beforeAdvice() {
		System.out.println("È¾´Ü°ü½É beforeAdvice...");
	}
	public void afterAdvice() {
		System.out.println("È¾´Ü°ü½É afterAdvice...");
	}
	public void afterReturnAdvice() {
		System.out.println("È¾´Ü°ü½É afterReturnAdvice...");
	}
	public void afterThrowAdvice() {
		System.out.println("È¾´Ü°ü½É afterThrowAdvice...");
	}
	public void aroundAdvice() throws Throwable {
		System.out.println("È¾´Ü°ü½É aroundAdvice...");
	}
}
