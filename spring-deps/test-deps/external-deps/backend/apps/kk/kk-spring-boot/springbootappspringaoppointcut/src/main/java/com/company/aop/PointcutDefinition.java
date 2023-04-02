package com.company.aop;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;

@Aspect
public class PointcutDefinition {

	@Pointcut("within(com.company.web..*)")
	public void webLayer() {

	}

	@Pointcut("within(com.company.service..*)")
	public void serviceLayer() {

	}

	@Pointcut("within(com.company.dao..*)")
	public void dataAccessLayer() {

	}
}
