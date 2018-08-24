package com.rock.aspect;

import javax.servlet.http.HttpServletRequest;

import org.aopalliance.intercept.Joinpoint;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;
import org.springframework.web.context.annotation.ApplicationScope;
import org.springframework.web.context.request.RequestContextHolder;
import org.springframework.web.context.request.ServletRequestAttributes;
import org.springframework.web.servlet.mvc.condition.RequestConditionHolder;


/**
 * 拦截所有的http请求，幷记录
 * @author root
 * date: Aug 23, 2018 11:39:58 PM.<br/>
 */
@Aspect
@Component
public class HttpAspect {


	// 改造前
	////	@Before("execution(public * com.rock.controller.girlontroller.girlList(..))")// 拦截controler的girlList方法
	//	@Before("execution(public * com.rock.controller.girlontroller.*(..))")// 拦截girlontroller的所有的方法
	//	public  void log() {
	//		System.out.println(11111111);
	//	}
	//
	//	
	//	@After("execution(public * com.rock.controller.girlontroller.*(..))")
	//	public void doAfter() {
	//		System.out.println(22222);
	//
	//	}


	private final static Logger logger = LoggerFactory.getLogger(HttpAspect.class);
	///改造后的东西
	@Pointcut("execution(public * com.rock.controller.girlontroller.*(..))")// 拦截girlontroller的所有的方法
	public  void log() {
	}
	//获取http请求的内容 幷打印出各种信息
	@Before("log()")
	public void doBefore(JoinPoint joinpoint){
		//		System.out.println(11111111);
		ServletRequestAttributes attributes = (ServletRequestAttributes) RequestContextHolder.getRequestAttributes();
		HttpServletRequest request = attributes.getRequest();
		//		url
		logger.info("url={}",request.getRequestURL());
		//method
		logger.info("method={}",request.getMethod());
		//		ip
		logger.info("ip={}",request.getRemoteAddr());
		//		类方法
		logger.info("class_method={}",joinpoint.getSignature().getDeclaringTypeName() + "." + joinpoint.getSignature().getName());
		//		参数
		
		logger.info("args={}",joinpoint.getArgs());
	}

	@After("log()")
	public void doAfter() {
		//		System.out.println(22222);
		logger.info(""+222222);
	}
	//打印返回的内容
	@AfterReturning(returning="object",pointcut="log()")
	public void doAfterReturning( Object object) {
		logger.info("response={}",object.toString());
	}
}
