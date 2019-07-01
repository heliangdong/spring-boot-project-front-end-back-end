package com.lou.springboot.dao;

import com.lou.springboot.entity.MockCase;

import java.util.List;

public interface MockCaseDao {
    List<MockCase> getAllMockCase();

    MockCase getmockByRequesturl(String requesturl);
}
