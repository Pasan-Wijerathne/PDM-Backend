package com.example.HBMSystem.Modulars;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.util.Date;

@Entity
@Table(name="home_garden")

public class gardenMod {

    @Id
    private int no;

    @Column
    private String type;

    @Column
    private String description;

    @Column
    private String userid;

    @Column
    private float totalamount;

    @Column
    private Date date;

    public int getNo() {
        return no;
    }

    public void setNo(int no) {
        this.no = no;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getUserid() {
        return userid;
    }

    public void setUserid(String userid) {
        this.userid = userid;
    }

    public float getTotalamount() {
        return totalamount;
    }

    public void setTotalamount(float totalamount) {
        this.totalamount = totalamount;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }




}