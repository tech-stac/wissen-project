package com.wissen.wissenproject.entity;


import jakarta.persistence.*;
import lombok.Data;
import lombok.EqualsAndHashCode;

import java.util.Date;

@Data
@Entity
@Table(name = "insurance")
public class Insurance {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "policy_reference_number")
    private Integer policyReferenceNumber;
    @Column(name = "policy_id")
    private Integer policyId;
    @Column(name = "customer_id")
    private Integer customerId;
    @Column(name = "policy_commencement_date")
    private Date policyCommencementDate;
    @Column(name = "policy_end_date")
    private Date policyEndDate;
    @Column(name = "payment_mode")
    private String paymentMode;
    @Column(name = "payment_frequency")
    private String paymentFrequency;
    @Column(name = "premium_amount")
    private Double premiumAmount;
    @Column(name = "policy_status")
    private String policyStatus;
    @Column(name = "policy_tenure")
    private Integer policyTenure;
    @Column(name = "policy_type")
    private String policyType;


}
