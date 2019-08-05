package cn.zheng.neptune.MySpringBoot.configuration.aspect

import cn.zheng.neptune.MySpringBoot.configuration.annotation.SystemDateTime
import org.apache.logging.log4j.LogManager
import org.apache.logging.log4j.Logger
import org.aspectj.lang.ProceedingJoinPoint
import org.aspectj.lang.annotation.Around
import org.aspectj.lang.annotation.Aspect
import org.aspectj.lang.annotation.Pointcut
import org.aspectj.lang.reflect.FieldSignature
import org.aspectj.lang.reflect.MethodSignature
import org.springframework.stereotype.Component

import java.lang.reflect.Field
import java.lang.reflect.Method
import java.text.SimpleDateFormat

@Aspect
@Component
class SystemDateTimeAsp {
	Logger logger = LogManager.getLogger(this)
	SystemDateTime dateTime

	@Pointcut("@annotation(cn.zheng.neptune.MySpringBoot.configuration.annotation.SystemDateTime)")
	void aspPointcut(){}

	@Around("aspPointcut()")
	String assignmentDate(ProceedingJoinPoint joinPoint){
		logger.info("-------------")
		MethodSignature signatureMethod = joinPoint.getSignature() as MethodSignature

		Field field = joinPoint.getTarget().getClass().getDeclaredField("date")
		field.setAccessible(true)
		Method method = signatureMethod.getMethod()


		logger.info("field: ${field}")
		dateTime = method.getAnnotation(SystemDateTime.class)
		logger.info("dateTime: ${dateTime}")
		SimpleDateFormat format = new SimpleDateFormat(dateTime.format())
		String date = format.format(new Date())

		field.set(joinPoint.getTarget(),date)
		joinPoint.proceed()
		return date
	}

}
