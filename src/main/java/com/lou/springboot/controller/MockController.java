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
        String requesturlStr= request.getRequestURI();
        System.out.println("requesturl="+requesturlStr);
        String requestURI = (String) request.getAttribute("requestURI");
        //        String requesturl= request.getParameter("requesturl");

        MockCase mockCase= mockCaseService.getmockByRequesturl(requestURI);
        if(mockCase==null){
            return "没有此urlMock";
        }
        String  responses = mockCase.getResponses();
        return responses;
    }



}
