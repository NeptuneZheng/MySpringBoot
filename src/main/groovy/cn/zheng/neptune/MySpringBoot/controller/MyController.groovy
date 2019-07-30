package cn.zheng.neptune.MySpringBoot.controller

import cn.zheng.neptune.MySpringBoot.configuration.SystemDateTime
import cn.zheng.neptune.MySpringBoot.dao.ConsumerDao
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Controller
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.ResponseBody

@Controller
class MyController {

	@Autowired
	ConsumerDao dao

	@RequestMapping("/")
	@ResponseBody
	@SystemDateTime
	public String test(){
		println("controller ...")
		return "success!"
	}
}
