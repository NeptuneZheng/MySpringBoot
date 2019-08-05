package cn.zheng.neptune.MySpringBoot.configuration.aspect


import cn.zheng.neptune.MySpringBoot.configuration.annotation.AutoLogFilter
import org.apache.logging.log4j.LogManager
import org.apache.logging.log4j.Logger
import org.aspectj.lang.JoinPoint
import org.aspectj.lang.ProceedingJoinPoint
import org.aspectj.lang.annotation.After
import org.aspectj.lang.annotation.Around
import org.aspectj.lang.annotation.Aspect
import org.aspectj.lang.annotation.Before
import org.aspectj.lang.annotation.Pointcut
import org.aspectj.lang.reflect.MethodSignature
import org.springframework.stereotype.Component

import java.lang.reflect.Method

@Aspect
@Component
class AutoLogFulterAsp {
	Logger logger = LogManager.getLogger(this)
	AutoLogFilter autoLog

	@Pointcut("@annotation(cn.zheng.neptune.MySpringBoot.configuration.annotation.AutoLogFilter)")
	void pointCut(){}

	@Before("pointCut()")
	void beforeLog(JoinPoint joinPoint){
		Class clazz = joinPoint.getClass() // 获取代理类


		MethodSignature signature = joinPoint.getSignature() as MethodSignature  // 获取连接点方法签名
		Method method = signature.getMethod() // 获取连接点方法名
		Object object = joinPoint.getTarget() // 获取连接点类信息
		Object[] param = joinPoint.getArgs()  // 获取连接点对象的参数信息

		String messages = "Aspclass: ${clazz.getName()}. class: ${object.class}, method: ${method.getName()}, + Anno param: ${param} "

		String level = autoLog.level()
		switch (level){
			case 'warn': logger.warn(messages);break
			case 'error': logger.error(messages);break
			default: logger.info(messages);break
		}
	}

	@Around("pointCut()")
	Object around(ProceedingJoinPoint joinPoint){ // ProceedingJoinPoint is only supported for around advice
		MethodSignature signature = joinPoint.getSignature() as MethodSignature  // 获取连接点方法签名
		Method method = signature.getMethod() // 获取连接点方法名
		autoLog = method.getAnnotation(AutoLogFilter.class)
		String role = autoLog.access()
		if(role == 'admin'){
			logger.info("Accreditation Success, proceeding your request now...")
			return joinPoint.proceed()
		}else {
			logger.error("Accreditation Fail...")
			return  "fail"
		}
	}



	@After("pointCut()")
	void after(){
		logger.info("ASP finished all function")
	}
}
