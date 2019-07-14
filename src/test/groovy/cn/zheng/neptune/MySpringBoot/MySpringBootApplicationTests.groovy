package cn.zheng.neptune.MySpringBoot

import cn.zheng.neptune.MySpringBoot.configuration.SystemDateTime
import cn.zheng.neptune.MySpringBoot.dao.UserDao
import cn.zheng.neptune.MySpringBoot.pojo.LegalUser
import org.junit.Test
import org.junit.runner.RunWith
import org.springframework.beans.BeanUtils
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.boot.test.context.SpringBootTest
import org.springframework.context.ApplicationContext
import org.springframework.test.context.junit4.SpringRunner

@RunWith(SpringRunner)
@SpringBootTest
class MySpringBootApplicationTests {

//	@Autowired
//	LegalUser legalUser
	@Autowired
	ApplicationContext applicationContext
//	@Autowired
//	UserDao dao

	@SystemDateTime
	String getTime(){
		return "nothing"
	}
	String date

	@Test
	void contextLoads() {
//		println(applicationContext.containsBean("legalUser"))
//		println(legalUser)

//		cn.zheng.neptune.MySpringBoot.vo.LegalUser legalUser1 = new cn.zheng.neptune.MySpringBoot.vo.LegalUser()
//		BeanUtils.copyProperties(legalUser,legalUser1)
//		dao.save(legalUser1)

		println(getTime())
	}

}
