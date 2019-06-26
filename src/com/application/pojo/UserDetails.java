package com.application.pojo;

import javax.persistence.*;

@Entity
@Table(name="userDetails")
public class UserDetails {
    @Id
    @Column(name="id")
    private int userId;
    @Column (name="username")
    private String userName;

    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }
}
