package com.example.demo.mvc.Service.impl;



import com.example.demo.mvc.Service.testService;


import com.example.demo.mvc.mapper.testMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;



@Service("testService")
public class testServiceImpl implements testService {


    @Autowired
    private testMapper testmapper;

    public String test() {

       return testmapper.quertTest().toString();
    }
}
