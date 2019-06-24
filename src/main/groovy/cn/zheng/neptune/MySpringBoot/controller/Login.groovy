package cn.zheng.neptune.MySpringBoot.controller

import cn.zheng.neptune.MySpringBoot.dao.UserDao
import cn.zheng.neptune.MySpringBoot.vo.LegalUser
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RequestParam
import org.springframework.web.bind.annotation.ResponseBody
import org.springframework.web.bind.annotation.RestController

@RestController
class Login {
	@Autowired
	private UserDao userDao

	@RequestMapping(value = "/")
	public String test(){
		return "you got me !"
	}

	@PostMapping(value = "/add")
	public @ResponseBody boolean addNewUser(@RequestParam String name, @RequestParam String password){
		LegalUser user = new LegalUser(name,password)

		return userDao.save(user) != null
	}
}
