package com.tkk.review.sprintbootstarter.webstart.beanVO;

import org.springframework.stereotype.Component;

/**
 * @author fendoukaoziji
 * @time 2021-07-11 16:30
 * @action 功能描述
 **/
@Component
public class User {
    private  int age;
    private  int id;
    private String userName;

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
}
