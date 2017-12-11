package com.wangzi.girl.entity;

import com.wangzi.girl.Enum.AEnum;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import java.util.Date;
import java.util.List;

/**
 * @Description: 通告实体类
 * @Author: prince
 * @Date: Created in 9:57 2017/11/24
 */
@Entity
public class Notice {
    @Id
    @GeneratedValue
    //通告主键id
    private Integer id;
    //成员
    private List<Girl> girlList;
    //通告内容
    private String noticeProgram;
    //通告时间
    private Date noticeTime;
    //参加费用
    private Double fee;
    //是否接此公告(跟 boolean比较？？？？)
    private AEnum aEnum;
    /**
     * @Description:
     * @param
     * @return
     * @Date:
     */
    public Notice() {
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public List<Girl> getGirl() {
        return girlList;
    }

    public void setGirl(List<Girl> girlList) {
        this.girlList = girlList;
    }

    public String getNoticeProgram() {
        return noticeProgram;
    }

    public void setNoticeProgram(String noticeProgram) {
        this.noticeProgram = noticeProgram;
    }

    public Date getNoticeTime() {
        return noticeTime;
    }

    public void setNoticeTime(Date noticeTime) {
        this.noticeTime = noticeTime;
    }

    public Double getFee() {
        return fee;
    }

    public void setFee(Double fee) {
        this.fee = fee;
    }

    public AEnum getaEnum() {
        return aEnum;
    }

    public void setaEnum(AEnum aEnum) {
        this.aEnum = aEnum;
    }
}
