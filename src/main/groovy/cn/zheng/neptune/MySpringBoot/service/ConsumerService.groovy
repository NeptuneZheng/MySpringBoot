package cn.zheng.neptune.MySpringBoot.service

import cn.zheng.neptune.MySpringBoot.configuration.SystemDateTime
import cn.zheng.neptune.MySpringBoot.dao.ConsumerDao
import cn.zheng.neptune.MySpringBoot.vo.Consumer
import org.springframework.stereotype.Service

import javax.annotation.Resource

@Service
class ConsumerService {
	@Resource
	ConsumerDao dao

	@SystemDateTime(format = "yyyy")
	public void save(Consumer consumer){
		dao.save(consumer)
	}
}
