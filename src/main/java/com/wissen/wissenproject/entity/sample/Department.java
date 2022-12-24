package com.wissen.wissenproject.entity.sample;


import jakarta.persistence.*;
import lombok.Data;
import lombok.EqualsAndHashCode;
import java.util.List;

@Data
@Entity
@EqualsAndHashCode
@Table(name = "department")
public class Department {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "department_id")
    public Integer departmentId;

    @Column(name = "department_name")
    public String departmentName;

    @OneToMany
    @JoinColumn(name ="department_id")
    private List<Employee> employees;

}
