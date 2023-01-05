package com.wissen.wissenproject.entity.sample;


import jakarta.persistence.*;
import lombok.Data;
import lombok.EqualsAndHashCode;

@Data
@EqualsAndHashCode
@Entity
@Table(name = "customer_sample")
public class CustomerSample {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "customerid")
    private Integer customerId;
    @Column(name = "firstname")
    private String firstName;
    @Column(name= "lastname")
    private String lastName;
    @Column(name= "company")
    private String  company;
    @Column(name= "address")
    private String  address;
    @Column(name= "city")
    private String  city;
    @Column(name= "state")
    private String  state;
    @Column(name= "country")
    private String  country;
    @Column(name= "postalcode")
    private String  postalcode;
    @Column(name= "phone")
    private String  phone;
    @Column(name= "fax")
    private String  fax;
    @Column(name= "email")
    private String  email;
    @Column(name= "supportrepid")
    private Integer supportrepId ;

}
