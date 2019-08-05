package cn.zheng.neptune.MySpringBoot.configuration.annotation

import java.lang.annotation.Documented
import java.lang.annotation.ElementType
import java.lang.annotation.Retention
import java.lang.annotation.RetentionPolicy
import java.lang.annotation.Target

@Target(value = [ElementType.FIELD,ElementType.METHOD])
@Retention(RetentionPolicy.RUNTIME)
@Documented
@interface SystemDateTime {
	String format() default "yyyyMMdd"
}