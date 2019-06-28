package com.lou.springboot.Interceptor;

import com.lou.springboot.controller.MockController;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.handler.HandlerInterceptorAdapter;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


public class MockInterceptor implements HandlerInterceptor {
    @Autowired
    private MockController mockController;


    private static final Logger log=LoggerFactory.getLogger(MockInterceptor.class);


    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {

        log.info("进入拦截器了");
        mockController.getmock();
        return  true;
    }
}
