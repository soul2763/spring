package kr.co.ch06.advice;

import org.aspectj.lang.ProceedingJoinPoint;
import org.springframework.stereotype.Component;

@Component
public class AroundAdvice {

	public void around1(ProceedingJoinPoint pjp) throws Throwable {
		System.out.println("Ⱦ�ܰ��� - around1-1 ...");
		pjp.proceed(); // �ٽɰ���(����Ʈ��) ����
		System.out.println("Ⱦ�ܰ��� - around1-2 ...");
	}
	
	public void around2(ProceedingJoinPoint pjp) throws Throwable {
		System.out.println("Ⱦ�ܰ��� - around2-1 ...");
		pjp.proceed(); // �ٽɰ���(����Ʈ��) ����
		System.out.println("Ⱦ�ܰ��� - around2-2 ...");
	}
	
	public void around3(ProceedingJoinPoint pjp) throws Throwable {
		System.out.println("Ⱦ�ܰ��� - around3-1 ...");
		pjp.proceed(); // �ٽɰ���(����Ʈ��) ����
		System.out.println("Ⱦ�ܰ��� - around3-2 ...");
	}
	
}
