package com.tkk.review.sprintbootstarter.webstart.config;

import com.tkk.review.sprintbootstarter.webstart.interceptor.UserInterceptor;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

/**
 * @author fendoukaoziji
 * @time 2021-07-11 17:13
 * @action 功能描述
 **/
@Configuration   //定义此类为配置文件 相当于之前的xml配置文件
public class InterceptorConfig  implements WebMvcConfigurer {
    //mvc::interceptors

    @Override
    public void addInterceptors(InterceptorRegistry registry) {
        //要拦截User下的所有访问请求，必须用户登录后才能访问，
        //但是有一些路径是不需要登录也可以访问的
        String[] addPathPatterns={
                "/user/**"
        };
        //排除的路径 不需要登录也可访问
        String[] excludePathPatterns={
            "/user/out",
                "show/**",
                "show1/**"
        };

        //mvc::interceptor bean class=""
        registry.addInterceptor(new UserInterceptor()).addPathPatterns(addPathPatterns).excludePathPatterns(excludePathPatterns);
    }
}
