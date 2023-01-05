package com.wissen.wissenproject.repository;

import com.wissen.wissenproject.entity.sample.Employee;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EmployeeRepo extends CrudRepository<Employee, Integer> {


}
