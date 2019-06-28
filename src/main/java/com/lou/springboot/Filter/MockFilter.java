package com.lou.springboot.Filter;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import javax.servlet.*;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

public class MockFilter implements Filter {
    private static final Logger log=LoggerFactory.getLogger(MockFilter.class);



    @Override
    public void doFilter(ServletRequest servletRequest, ServletResponse servletResponse, FilterChain filterChain) throws IOException, ServletException {
        HttpServletRequest request = (HttpServletRequest) servletRequest;
        HttpServletResponse response =(HttpServletResponse)servletResponse;
        String requestURI = request.getRequestURI();
        log.info(requestURI);
        if(requestURI=="/mock"){
            response.sendRedirect("/mock");
        }
        filterChain.doFilter(servletRequest,servletResponse);
    }

}
