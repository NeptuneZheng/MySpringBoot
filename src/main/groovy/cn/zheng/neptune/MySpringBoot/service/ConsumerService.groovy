package cn.zheng.neptune.MySpringBoot.service

import cn.zheng.neptune.MySpringBoot.configuration.annotation.SystemDateTime
import cn.zheng.neptune.MySpringBoot.dao.ConsumerDao
import cn.zheng.neptune.MySpringBoot.vo.Consumer
import org.springframework.stereotype.Service

import javax.annotation.Resource

@Service
class ConsumerService {
	@Resource
	ConsumerDao dao

	private String date

	@SystemDateTime(format = "yyyy-MM-dd HH:mm")
	public void save(Consumer consumer){
		println(date)
//		dao.save(consumer)
	}
}
