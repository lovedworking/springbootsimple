package com.tkk.review.sprintbootstarter.webstart.firstcontroller;

import com.tkk.review.sprintbootstarter.webstart.config.ConfigBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.xml.bind.ValidationEvent;
import java.util.HashMap;
import java.util.Map;

/**
 * @author fendoukaoziji
 * @time 2021-07-11 10:31
 * @action 功能描述
 **/
@Controller
public class FirstTestController {
    @Autowired
    private ConfigBean testConfig;

    @RequestMapping(value="/firstcontroller/firstRet")
    public @ResponseBody String  firstRet(){
        return "long time no see  " +
                "hi, 老朋友";
    }

    @RequestMapping(value="/secondMap")
    public @ResponseBody Map<String,Object> retMap(){
        HashMap<String, Object> retMap = new HashMap<>();
        String name = testConfig.getName();
        retMap.put("hi","welcome to beijing"+name);
        return retMap;

    }
    public static void main(String[] args) {

    }
}
