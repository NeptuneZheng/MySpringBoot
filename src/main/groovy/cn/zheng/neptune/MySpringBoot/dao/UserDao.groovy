package cn.zheng.neptune.MySpringBoot.dao

import cn.zheng.neptune.MySpringBoot.vo.LegalUser
import org.springframework.data.repository.CrudRepository


interface UserDao extends CrudRepository<LegalUser,Long>{
}