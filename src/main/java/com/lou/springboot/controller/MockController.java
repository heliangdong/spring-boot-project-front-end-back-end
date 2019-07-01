package com.lou.springboot.controller;

import com.lou.springboot.entity.MockCase;
import com.lou.springboot.service.MockCaseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;
import java.util.List;

@RestController
public class MockController {
    @Autowired
    private MockCaseService mockCaseService;


    @RequestMapping("/mock")
    @ResponseBody
    public String getmockByRequesturl(HttpServletRequest request){
        System.out.println("进入mock");
        String requesturl= request.getRequestURI();
        System.out.println("requesturl="+requesturl);
    //        String requesturl= request.getParameter("requesturl");
        if(requesturl==null){
            return "请求参数不能为空";
        }
        MockCase mockCase= mockCaseService.getmockByRequesturl(requesturl);
        String responses = mockCase.getResponses();
        if(responses==null){
            return "返回为null";
        }

        return responses;
    }



}
