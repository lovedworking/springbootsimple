package com.tkk.review.sprintbootstarter.webstart.beanVO;

import org.springframework.stereotype.Component;

/**
 * @author fendoukaoziji
 * @time 2021-07-11 16:30
 * @action 功能描述
 **/
@Component
public class InfoVO {
    private  int age;
    private  int id;

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
