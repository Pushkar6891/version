package com.company.aop.aspect;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class AccountServiceAspect {
	
	@Before(value = "com.company.aop.PointcutDefinition.serviceLayer()")
	public void beforeAdvice(JoinPoint joinPoint){
		System.out.println("Before method:"+joinPoint.getSignature());
	}
	
	@After(value = "com.company.aop.PointcutDefinition.serviceLayer()")
	public void afterAdvice(JoinPoint joinPoint){
		System.out.println("After method:"+joinPoint.getSignature());
	}
}
