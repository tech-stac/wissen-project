package com.wissen.wissenproject.repository;

import com.wissen.wissenproject.entity.sample.CustomerSample;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CustomerSampleRepo extends JpaRepository<CustomerSample, Integer> {

}
