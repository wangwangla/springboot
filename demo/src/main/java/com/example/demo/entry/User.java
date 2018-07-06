package com.example.demo.entry;

import javax.persistence.Entity;
import javax.persistence.Id;
import java.io.Serializable;

/**
 * auther   kangwang
 */
@Entity
public class User implements Serializable {
    @Id
    private String id;
    private String mingzi;

    @Override
    public String toString() {
        return "User{" +
                "id='" + id + '\'' +
                ", mingzi='" + mingzi + '\'' +
                '}';
    }

    public User() {
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getMingzi() {
        return mingzi;
    }

    public void setMingzi(String mingzi) {
        this.mingzi = mingzi;
    }
}
