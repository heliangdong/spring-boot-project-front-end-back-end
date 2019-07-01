package com.lou.springboot.service.impl;

import com.lou.springboot.dao.MockCaseDao;
import com.lou.springboot.entity.MockCase;
import com.lou.springboot.service.MockCaseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class MockCaseServiceImpl implements MockCaseService {
    @Autowired
    private MockCaseDao mockCaseDao;

    @Override
    public MockCase getmockByRequesturl(String requesturl) {

        return mockCaseDao.getmockByRequesturl(requesturl);
    }
}
