package com.rock.aspect;

import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;
import org.springframework.web.context.annotation.ApplicationScope;


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

	@Before("log()")
	public void doBefore(){
		//		System.out.println(11111111);
		logger.info(111111111 +"");
	}

	@After("log()")
	public void doAfter() {
		//		System.out.println(22222);
		logger.info(""+222222);

	}
}
