package com.offcn.crm.aspect;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

@Component
@Aspect
@Order(value=2147483646)
public class TransactionAspect {
	@Around(value = "com.offcn.crm.aspect.LogAspect.myPointCut()")
	public void aroundAdvice(ProceedingJoinPoint pjp) {
		try {
			try {
				System.out.println("kaiqishiwu");
				Object proceed = pjp.proceed();
				
			} finally {
				System.out.println("huanrao");
			}
			System.out.println("tijiaoshiwu");
			
		} catch (Throwable e) {
			System.out.println("shijianhuigun");
		}
		
	}
}