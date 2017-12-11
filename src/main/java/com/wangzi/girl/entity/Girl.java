package com.wangzi.girl.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.validation.constraints.Min;

/**
 * @Description: 实体类--自动创建表
 * @Author: prince
 * @Date: Created in 19:56 2017/11/21
 */
@Entity
public class Girl {
    @Id
    @GeneratedValue
    private Integer id;

    @Min(value = 18,message = "未满18岁不能添加")
    private Integer age;

    private String name;

    private String birthday;

    private String team;
    //成员经纪人
    private String middleman;

    private String qrcode;

    public Girl(){}

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getBirthday() {
        return birthday;
    }

    public void setBirthday(String birthday) {
        this.birthday = birthday;
    }

    public String getTeam() {
        return team;
    }

    public void setTeam(String team) {
        this.team = team;
    }

    public String getMiddleman() {
        return middleman;
    }

    public void setMiddleman(String middleman) {
        this.middleman = middleman;
    }

    public String getQrcode() {
        return qrcode;
    }

    public void setQrcode(String qrcode) {
        this.qrcode = qrcode;
    }
}
