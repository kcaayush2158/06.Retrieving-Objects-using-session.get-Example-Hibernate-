package com.application.pojo;

import java.util.Date;
import javax.persistence.*;

@Entity(name = "User_Details")
public class UserDetails {
    @Id
    @Column(name="id")
    private int id;

    //@Basic is
    //Transient help to hide the column
    @Column(name="username")
    private String username;
    @Column(name="date")
    @Temporal(TemporalType.DATE) //This annotation is for date and time
    private Date joinedDate;
    @Column(name="address")
    private String address;
    @Column(name="description")
    private String description;

    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public String getUsername() {
        return username;
    }
    public void setUsername(String username) {
        this.username = username;
    }
    public Date getJoinedDate() {
        return joinedDate;
    }
    public void setJoinedDate(Date joinedDate) {
        this.joinedDate = joinedDate;
    }
    public String getAddress() {
        return address;
    }
    public void setAddress(String address) {
        this.address = address;
    }
    public String getDescription() {
        return description;
    }
    public void setDescription(String description) {
        this.description = description;
    }



}
