package com.lou.springboot.Interceptor;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Configuration
public class WebConfigurer1 implements WebMvcConfigurer {
    @Bean
    public MockInterceptor getMockInterceptor(){
        return new MockInterceptor();
    }

    private static final String[] excludes=new String[]{"/","/static/*","/mock","/users/**","/dist/**","/error","/plugins/**","/user.html","/index.html","/login.html","/**.html"};

    @Override
    public void addInterceptors(InterceptorRegistry registry) {
        registry.addInterceptor(getMockInterceptor()).addPathPatterns("/**").excludePathPatterns(excludes);
    }

//    @Override
//    public void addResourceHandlers(ResourceHandlerRegistry registry) {
//        registry.addResourceHandler("/static/**","/dist/**").addResourceLocations("classpath:/static/");
//    }
}
