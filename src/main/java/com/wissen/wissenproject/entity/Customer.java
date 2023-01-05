package com.wissen.wissenproject.entity;

import jakarta.persistence.*;
import lombok.Data;
import lombok.EqualsAndHashCode;
import java.util.Date;

@Data
@EqualsAndHashCode
@Entity
@Table(name = "customer")
public class Customer {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "customer_id")
    private Integer customerId;

    @Column(name = "customer_name")
    private String customerName;
    @Column(name = "dob")
    private Date dob;

    @Column(name = "customer_email")
    private String email;
    @Column(name = "customer_address")
    private String address;
    @Column(name = "customer_contact_no")
    private Long contactNo;

    @Column(name = "customer_photo_id_proof")
    private String photoIdProof;

    @Column(name = "customer_photo_id_no")
    private String photoIdNo;
    @Column(name = "customer_address_proof")
    private String addressProof;

    @Column(name = "registration_date")
    private Date registrationDate;

}
