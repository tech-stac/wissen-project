package com.wissen.wissenproject.controller;

import com.wissen.wissenproject.entity.sample.CustomerSample;
import com.wissen.wissenproject.service.CustomerSampleService;
import com.wissen.wissenproject.service.EmailService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import java.util.List;


@RestController
@RequestMapping("wissen/streams")
public class CustomerSampleController {

    @Autowired
    CustomerSampleService customerSampleService;

    @Autowired
    EmailService emailService;


    /**
     * @description This method is responsible to filter the customer object which starts with P letter
     * Stream.filter() method can filter out the stream elements based on a predicate.
     * @return List<CustomerSample>
     */

    @GetMapping("/filters")
    public List<CustomerSample> getAllFirstNameStartsWithPLetter(){
    List<CustomerSample> customer = customerSampleService.getAllCutomers();
    //emailService.sendEmail();
    return  customer.stream().filter(s-> s.getFirstName().startsWith("P")).toList();
    }

    @GetMapping("/filters/name")
    public List<CustomerSample> getAllFirstNameStartsWithS(){
        List<CustomerSample> customer = customerSampleService.getAllCutomers();
        //emailService.sendEmail();
        return  customer.stream().filter(s-> s.getFirstName().startsWith("S")).toList();
    }
    
}
