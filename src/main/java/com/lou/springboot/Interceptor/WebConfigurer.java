package com.lou.springboot.Interceptor;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.CacheControl;
import org.springframework.stereotype.Component;
import org.springframework.web.servlet.config.annotation.*;

import java.util.Arrays;
import java.util.List;
import java.util.concurrent.TimeUnit;

//@Configuration
//public class WebConfigurer extends   WebMvcConfigurerAdapter {
//    /**
//     * 授权拦截的路径 addPathPatterns：拦截的路径 excludePathPatterns：不拦截的路径
//     */
//    @Override
//    public void addInterceptors(InterceptorRegistry registry) {
//        registry.addInterceptor(new MockInterceptor()).addPathPatterns("/**").excludePathPatterns("/",
//                "/static/**", "/users/*", "/mock", "/error", "/index/*","/index.html","/user.html");
//        super.addInterceptors(registry);
//    }
//
//
//
//    @Override
//    public void addResourceHandlers(ResourceHandlerRegistry registry) {
////addResourceHandler请求路径
////addResourceLocations 在项目中的资源路径
////setCacheControl 设置静态资源缓存时间
//        registry.addResourceHandler("/static/**").addResourceLocations("classpath:/static/")
//                .setCacheControl(CacheControl.maxAge(1, TimeUnit.HOURS).cachePublic());
//        super.addResourceHandlers(registry);
//    }



//}


