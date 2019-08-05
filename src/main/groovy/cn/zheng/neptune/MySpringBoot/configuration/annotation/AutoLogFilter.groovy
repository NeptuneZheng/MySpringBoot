package cn.zheng.neptune.MySpringBoot.configuration.annotation

import java.lang.annotation.Documented
import java.lang.annotation.ElementType
import java.lang.annotation.Retention
import java.lang.annotation.RetentionPolicy
import java.lang.annotation.Target

@Target([ElementType.METHOD, ElementType.FIELD])
@Retention(RetentionPolicy.RUNTIME)
@Documented
@interface AutoLogFilter {
	String level() default "info"
	String access() default "User"
}