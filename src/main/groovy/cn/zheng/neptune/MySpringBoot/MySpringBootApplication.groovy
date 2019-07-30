package cn.zheng.neptune.MySpringBoot

import org.springframework.boot.SpringApplication
import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.context.annotation.EnableAspectJAutoProxy

@SpringBootApplication
class MySpringBootApplication {

	static void main(String[] args) {
		SpringApplication.run(MySpringBootApplication, args)
	}

}
