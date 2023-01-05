package com.wissen.wissenproject.service.impl;

import com.wissen.wissenproject.entity.sample.CustomerSample;
import com.wissen.wissenproject.repository.CustomerSampleRepo;
import com.wissen.wissenproject.service.CustomerSampleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CustomerSampleImpl implements CustomerSampleService {

    @Autowired
    CustomerSampleRepo customerSampleRepo;

    @Override
    public List<CustomerSample> getAllCutomers() {
        List<CustomerSample> findAllCustomers = customerSampleRepo.findAll();
        return findAllCustomers;
    }
}
