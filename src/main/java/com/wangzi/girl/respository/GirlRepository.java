package com.wangzi.girl.respository;

import com.wangzi.girl.entity.Girl;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * @Description:
 * @Author: prince
 * @Date: Created in 20:12 2017/11/21
 */
public interface GirlRepository extends JpaRepository<Girl,Integer>{
}
