package cn.zheng.neptune.MySpringBoot.configuration.aspect

import cn.zheng.neptune.MySpringBoot.configuration.SystemDateTime
import org.aspectj.lang.JoinPoint
import org.aspectj.lang.Signature
import org.aspectj.lang.annotation.Aspect
import org.aspectj.lang.annotation.Before
import org.aspectj.lang.annotation.Pointcut
import org.aspectj.lang.reflect.MethodSignature
import org.springframework.stereotype.Component

import java.lang.reflect.Method
import java.text.SimpleDateFormat

@Aspect
@Component
class SystemDateTimeAsp {

	@Pointcut("@annotation(cn.zheng.neptune.MySpringBoot.configuration.SystemDateTime)")
	void aspPointcut(){}

	@Before("aspPointcut()")
	String getSystemDT(JoinPoint joinPoint){
		println("-------------------")
		MethodSignature signature = joinPoint.getSignature() as MethodSignature
//		println("SystemDateTimeAsp get params: " + format)
		String date = new SimpleDateFormat("yyyyMMdd HH:mm").format(new Date())

		Method method = signature.getMethod()
		SystemDateTime dateTime = method.getAnnotation(SystemDateTime.class)
		println("SystemDateTimeAsp get method: " + method)

		return date
	}
}
