package com.wissen.wissenproject.entity;

import jakarta.persistence.*;
import lombok.*;



@Data
@Entity
@Table(name = "policy")
public class Policy {


    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "policy_id")
    private Integer policyId;

    @Column(name = "policy_name")
    private String policyName;

    @Column(name = "policy_description")
    private String policyDescription;

    @Column(name = "policy_type")
    private String policyType;
}
