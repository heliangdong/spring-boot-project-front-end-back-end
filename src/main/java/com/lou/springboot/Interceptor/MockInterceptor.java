package com.lou.springboot.Interceptor;

import com.lou.springboot.controller.MockController;
import com.lou.springboot.service.MockService;
import com.lou.springboot.service.impl.MockCaseServiceImpl;
import org.aopalliance.intercept.Interceptor;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;
import org.springframework.web.servlet.handler.HandlerInterceptorAdapter;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.PrintWriter;


public class MockInterceptor implements  HandlerInterceptor  {
    private static Logger logger = LoggerFactory.getLogger(MockInterceptor.class);
    @Autowired
    private MockCaseServiceImpl  mockCaseService;

    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {
        String requestURI = request.getRequestURI();
        logger.info("您已经进入拦截器requestURI="+requestURI);
        request.getRequestDispatcher("/mock").forward(request,response);
        return true;

    }

//    @Override
//    public void afterCompletion(HttpServletRequest request, HttpServletResponse response, Object handler, Exception ex) throws Exception {
//
//        String requestURI = request.getRequestURI();
//        logger.info("您已经进入拦截器requestURI="+requestURI);
//        String responseStr = mockController.getmockByRequesturl(request);
//        response.getWriter().print(responseStr);
//        response.getWriter().flush();
//        response.getWriter().close();
//    }
}
