package com.wissen.wissenproject.service;

import com.wissen.wissenproject.entity.sample.CustomerSample;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface CustomerSampleService {

    List<CustomerSample> getAllCutomers();

}
