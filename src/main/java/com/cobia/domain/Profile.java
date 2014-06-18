package com.cobia.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity(name = "PROFILE")
public class Profile {
    @Id
    @Column(name = "CODE")
    private String code;
    @Column(name = "TYPE")
    private String type;
    @Column(name = "NAME")
    private String name;
    @Column(name = "PORTRAIT")
    private String portrait;

    public Profile() {
    }

    public Profile(String code, String type, String name, String portrait) {
        this.code = code;
        this.type = type;
        this.name = name;
        this.portrait = portrait;
    }

    public String code() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String type() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String name() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String portrait() {
        return portrait;
    }

    public void setPortrait(String portrait) {
        this.portrait = portrait;
    }
}
