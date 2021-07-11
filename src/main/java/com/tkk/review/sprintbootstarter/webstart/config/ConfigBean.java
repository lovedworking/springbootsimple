package com.tkk.review.sprintbootstarter.webstart.config;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

/**
 * @author fendoukaoziji
 * @time 2021-07-11 11:15
 * @action 功能描述
 **/
@Component
@ConfigurationProperties(prefix = "configinfo")
public class ConfigBean {
    private String name;
    private String age;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }
}
