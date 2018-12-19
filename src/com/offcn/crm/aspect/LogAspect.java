package com.offcn.crm.aspect;

import java.util.Arrays;
import java.util.List;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.Signature;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

@Component
@Aspect

public class LogAspect {
	@Pointcut(value="execution(public void com.offcn.crm.interfacesImpl.MathCaculatorImpl.*(int, int))")
	public void myPointCut() {
		
	}
	@Before(value="execution(public void com.offcn.crm.interfacesImpl.MathCaculatorImpl.*(int, int))")
	public void beforeLog( JoinPoint jp) {
		Signature s = jp.getSignature();
		String name = s.getName();
		Object[] args = jp.getArgs();
		List<Object> list = Arrays.asList(args);
		
		System.out.println("before,"+name+","+list);
	}
	@After("execution(public void com.offcn.crm.interfacesImpl.MathCaculatorImpl.*(int, int))")
	public void afterLog( ) {
		System.out.println("After");
	}
	@AfterReturning(value= "execution(public void com.offcn.crm.interfacesImpl.MathCaculatorImpl.*(int, int))",returning="re")
	public void afterReturningLog(Object re) {
		System.out.println("AfterReturning,"+re);
	}
	@AfterThrowing(value="execution(public void com.offcn.crm.interfacesImpl.MathCaculatorImpl.*(int, int))" ,throwing="a")
	public void afterThrowingLog(Throwable a) {
		System.out.println("AfterThrowing,"+a.getMessage());
	}
	
	
}
