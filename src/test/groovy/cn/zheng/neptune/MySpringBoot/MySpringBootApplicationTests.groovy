package cn.zheng.neptune.MySpringBoot


import cn.zheng.neptune.MySpringBoot.dao.ConsumerDao
import cn.zheng.neptune.MySpringBoot.service.ConsumerService
import cn.zheng.neptune.MySpringBoot.vo.Consumer
import org.junit.Test
import org.junit.runner.RunWith
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.boot.test.context.SpringBootTest
import org.springframework.context.ApplicationContext
import org.springframework.context.annotation.EnableAspectJAutoProxy
import org.springframework.test.context.junit4.SpringRunner

@RunWith(SpringRunner)
@SpringBootTest
class MySpringBootApplicationTests {

	@Autowired
	ApplicationContext applicationContext
//	@Autowired
//	LegalUser legalUser
	@Autowired
	ConsumerService service


	@Test
	void contextLoads() {
//		println(applicationContext.containsBean("legalUser"))
//		println(legalUser)
//


//		println(applicationContext.containsBean("systemDateTimeAsp"))
//		Main main = new Main()
//		main.doSometing()
		println(applicationContext.containsBean("systemDateTimeAsp"))
		service.save(new Consumer('CCC','123456',26))
	}

}
