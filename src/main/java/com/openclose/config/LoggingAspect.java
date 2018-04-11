package com.openclose.config;

import java.util.Arrays;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.annotation.Configuration;

@Aspect
@Configuration
public class LoggingAspect
{
	private Logger log = LoggerFactory.getLogger(this.getClass());

	@Pointcut("within(com.openclose.controller.*)")
	public void loggingControllerPointcut()
	{

	}

	@Pointcut("within(com.openclose.service.* || com.openclose.repository.*)")
	public void loggingServiceAndRepoPointCut()
	{

	}

	@Before("loggingControllerPointcut()")
	public void around(JoinPoint joinPoint)
	{
		log.info(" >> Entry " + joinPoint.getTarget().getClass().getName() + " " + joinPoint.getSignature().getName() + "()");
		log.info("Incoming arguemnts :" + Arrays.toString(joinPoint.getArgs()));
	}

	@AfterReturning(pointcut = "loggingControllerPointcut()", returning = "result")
	public void afterReturning(JoinPoint jointpoint, Object result)
	{
		log.info("Result: " + result);
		log.info(" >> Exit " + jointpoint.getTarget().getClass().getName() + " " + jointpoint.getSignature().getName() + "()");
	}

}
