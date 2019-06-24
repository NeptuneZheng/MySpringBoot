package cn.zheng.neptune.MySpringBoot.controller

import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
class Login {

	@RequestMapping(value = "/")
	public String test(){
		return "you got me !"
	}
}
