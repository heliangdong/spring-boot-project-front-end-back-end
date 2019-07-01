package com.lou.springboot.service;

import com.lou.springboot.entity.MockCase;
import org.springframework.stereotype.Service;

@Service
public interface MockCaseService {
    MockCase getmockByRequesturl(String requesturl);
}
