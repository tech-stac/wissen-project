package com.wissen.wissenproject.entity.sample;

import jakarta.persistence.*;
import lombok.Data;
import lombok.EqualsAndHashCode;

import java.util.Date;

@Data
@EqualsAndHashCode
@Entity
@Table(name = "employee")
public class Employee {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "employeeid")
    private Integer employeeId;
    @Column(name = "lastname")
    private String  lastName ;
    @Column(name = "firstname")
    private String  firstName;
    @Column(name = "title")
    private String  title;
    @Column(name = "reportsto")
    private Integer reportsTo;
    @Column(name = "birthdate")
    private Date birthDate;
    @Column(name = "hiredate")
    private Date  hireDate;
    @Column(name = "address")
    private String  address;
    @Column(name = "city")
    private String  city;
    @Column(name = "state")
    private String  state;
    @Column(name = "country")
    private String  country;
    @Column(name = "postalcode")
    private String  postalCode;
    @Column(name = "phone")
    private String  phone;
    @Column(name = "fax")
    private String  fax;
    @Column(name = "email")
    private String  email;


}
