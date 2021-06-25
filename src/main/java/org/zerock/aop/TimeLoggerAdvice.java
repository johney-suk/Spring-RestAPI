package org.zerock.aop;

import java.util.Arrays;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.stereotype.Component;

import lombok.extern.log4j.Log4j;

@Aspect
@Component
@Log4j
public class TimeLoggerAdvice {


	@Around("execution(* org.zerock.service.AbstractService.*(..))")
	public Object checkTime(ProceedingJoinPoint pjp)throws Throwable {
		
		log.info("===========checkTime=============================");
		
	    long start = System.currentTimeMillis();
	    
	    log.info("Target: " + pjp.getTarget());
	    log.info("Param: " + Arrays.toString(pjp.getArgs()));
	    
	    
	    //invoke method 
	    Object result = null;
	    
	    try {
	      result = pjp.proceed();
	    } catch (Throwable e) {
	      // TODO Auto-generated catch block
	      e.printStackTrace();
	    }
	    
	    long end = System.currentTimeMillis();
	    
	    log.info("TIME: "  + (end - start));
	    
	    return result;

	}
	
}