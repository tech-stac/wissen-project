package com.wissen.wissenproject.entity.jwt;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;
import lombok.EqualsAndHashCode;

@Data
@Entity
@Table(name = "t_user")
@EqualsAndHashCode
public class User {
    @Id
    private String  userName;
    private String password;
}
