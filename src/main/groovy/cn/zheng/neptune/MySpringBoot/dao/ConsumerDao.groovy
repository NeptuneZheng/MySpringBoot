package cn.zheng.neptune.MySpringBoot.dao

import cn.zheng.neptune.MySpringBoot.vo.Consumer
import org.springframework.data.mongodb.repository.MongoRepository
import org.springframework.data.mongodb.repository.Query
import org.springframework.stereotype.Repository

@Repository
interface ConsumerDao extends MongoRepository<Consumer,Integer> {
}