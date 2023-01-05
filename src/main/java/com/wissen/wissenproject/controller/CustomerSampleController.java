package com.wissen.wissenproject.controller;

import com.wissen.wissenproject.entity.sample.CustomerSample;
import com.wissen.wissenproject.service.CustomerSampleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;


@RestController
@RequestMapping("/streams")
public class CustomerSampleController {

    @Autowired
    CustomerSampleService customerSampleService;


    /**
     * @description This method is responsible to filter the customer object which starts with P letter
     * Stream.filter() method can filter out the stream elements based on a predicate.
     * @return List<CustomerSample>
     */

    @GetMapping("/filters")
    public List<CustomerSample> getAllFirstNameStartsWithPLetter(){
    List<CustomerSample> customer = customerSampleService.getAllCutomers();
    return  customer.stream().filter(s-> s.getFirstName().startsWith("P")).toList();
    }
}
