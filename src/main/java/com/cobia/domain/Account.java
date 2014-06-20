package com.cobia.domain;

import org.hibernate.annotations.Proxy;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity(name = "ACCOUNT")
@Proxy(lazy = false)
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

	public String getCode() {
		return code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}
}
