package com.xfactor.lably.controllers;

import org.springframework.web.bind.annotation.RestController;

import antlr.collections.List;
import com.xfactor.lably.entity.Test;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.UUID;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
@RestController
@RequestMapping("/test")
public class TestController {

    ArrayList<Test> tests=new ArrayList();

    // Test t1=new Test();

    @GetMapping()
    public String test() {
        return "test controller test!!!";
    }

    @PostMapping("/addTest")
    public Test registerPost(@RequestBody Test test) {
        test.setId(UUID.randomUUID().toString());
        // Save admin to db
        tests.add(test);
        return test;
    }

    @GetMapping("/getAllTest")
    public ArrayList<Test> getAllTest() {
        ArrayList<Test> temp=new ArrayList();
        for(int i=0;i<5;i++)
        {
            temp.add(tests.get(i));
        }
        return temp;
    }

    @GetMapping("/getTestByName")
    public Test getTestByName(@RequestParam String name) {
        Test resTest = null;
        for (Test test : tests) {
            if (test.getName().equalsIgnoreCase(name)) {
                resTest = test;
            }
        }
        return resTest;
    }
    
}