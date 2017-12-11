package com.wangzi.girl.respository;

import com.wangzi.girl.entity.Girl;
import com.wangzi.girl.entity.Notice;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * @Description:
 * @Author: prince
 * @Date: Created in 10:12 2017/11/24
 */
public interface NoticeRepository extends JpaRepository<Notice,Integer>{
}
