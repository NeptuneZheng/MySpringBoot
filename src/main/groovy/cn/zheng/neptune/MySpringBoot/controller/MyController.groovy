package cn.zheng.neptune.MySpringBoot.controller


import cn.zheng.neptune.MySpringBoot.configuration.annotation.AutoLogFilter
import cn.zheng.neptune.MySpringBoot.configuration.annotation.SystemDateTime
import cn.zheng.neptune.MySpringBoot.dao.ConsumerDao
import cn.zheng.neptune.MySpringBoot.service.ConsumerService
import cn.zheng.neptune.MySpringBoot.vo.Consumer
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.data.domain.Example
import org.springframework.stereotype.Controller
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RequestParam
import org.springframework.web.bind.annotation.ResponseBody

@Controller
class MyController {

	@Autowired
	ConsumerDao dao

	@RequestMapping("/")
	@ResponseBody
	@AutoLogFilter(level = "warn",access = "admin")
	public String test(@RequestParam String name, @RequestParam String password, @RequestParam int age){
		println("controller received the request: ${name}, ${password} ...")

		Consumer consumer = new Consumer(name,password,age)
		dao.save(consumer)
		Example<Consumer> example = Example.of(consumer)
		println(dao.findOne(example))
		return "success!"
	}
}
