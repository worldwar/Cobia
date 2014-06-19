package com.cobia.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity(name = "ACCOUNT")
public class Account {
    @Id
    @Column(name = "CODE")
    private String code;

    @Column(name = "email")
    private String email;

    @Column(name = "password")
    private String password;

    public Account() {
    }

    public Account(String code, String email, String password) {
        this.code = code;
        this.email = email;
        this.password = password;
    }


    public String code() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String email() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String password() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
