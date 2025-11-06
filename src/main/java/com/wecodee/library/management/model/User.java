package com.wecodee.library.management.model;

import jakarta.persistence.Entity;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
@AllArgsConstructor
public class User {
    private  long id;
    private String userName;
    private  long  phoneNumber;
    private String role;
    private  String password;
    private  String email;

}
