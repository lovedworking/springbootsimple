package com.tkk.review.sprintbootstarter.webstart.interceptor;

import com.tkk.review.sprintbootstarter.webstart.beanVO.User;
import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * @author fendoukaoziji
 * @time 2021-07-11 16:58
 * @action 功能描述
 **/
public class UserInterceptor implements HandlerInterceptor {
    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {
        //拦截规则
        //从session获取登录信息
        User info =(User) request.getSession().getAttribute("user");
        if(info==null){
            response.sendRedirect(request.getContextPath()+"/nologin");
            return false;
        }
        return true;
    }

    @Override
    public void postHandle(HttpServletRequest request, HttpServletResponse response, Object handler, ModelAndView modelAndView) throws Exception {

    }

    @Override
    public void afterCompletion(HttpServletRequest request, HttpServletResponse response, Object handler, Exception ex) throws Exception {

    }
}
