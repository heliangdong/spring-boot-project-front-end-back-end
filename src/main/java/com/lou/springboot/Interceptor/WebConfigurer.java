package com.lou.springboot.Interceptor;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;

import java.util.Arrays;

@Configuration
public class WebConfigurer extends WebMvcConfigurerAdapter {


//    @Override
//    public void addInterceptors(InterceptorRegistry registry) {
//
//
////        registry.addInterceptor(new MockInterceptor()).addPathPatterns("/**");
//        registry.addInterceptor(new MockInterceptor()).excludePathPatterns(Arrays.asList("/static/**", "/res/**"));
//
//        super.addInterceptors(registry);
//    }

}
