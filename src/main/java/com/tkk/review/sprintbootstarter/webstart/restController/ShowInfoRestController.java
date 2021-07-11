package com.tkk.review.sprintbootstarter.webstart.restController;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

/**
 * @author fendoukaoziji
 * @time 2021-07-11 16:32
 * @action 功能描述
 **/
@RestController  //相当于  @Controller 和@ResponseBody
public class ShowInfoRestController {


    //http://localhost:8082/springbootyml/show1?id=1001&age=20
    @RequestMapping(value="/show1")
    public String showInfoSimple(Integer id,Integer age){
        return "show1"+id+" "+age;
    }

    @RequestMapping(value="/show/detail/{id}/{age}")
    public Object showInfoSecond(@PathVariable("id") Integer id,
                                 @PathVariable("age") Integer age){
        Map<Object, Object> retMap = new HashMap<>();
        retMap.put("id",id);
        retMap.put("age",age);
        return retMap;
    }

}
