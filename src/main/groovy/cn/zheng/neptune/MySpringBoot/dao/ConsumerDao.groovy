package cn.zheng.neptune.MySpringBoot.dao

import cn.zheng.neptune.MySpringBoot.configuration.SystemDateTime
import cn.zheng.neptune.MySpringBoot.vo.Consumer
import org.springframework.data.mongodb.repository.MongoRepository
import org.springframework.data.mongodb.repository.Query
import org.springframework.stereotype.Repository

@Repository
@SystemDateTime(format = "dd") //todo: here doesn't work, but i'd use ElementType.TYPE, need to study more
interface ConsumerDao extends MongoRepository<Consumer,Integer> {
}