package com.cobia.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "ACCOUNT")
public class Account {
    private String code;
    private String email;
    private String password;

    public Account() {
    }

    @Id
    @Column(name = "CODE")
    public String code() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    @Column(name = "email")
    public String email() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Column(name = "password")
    public String password() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
