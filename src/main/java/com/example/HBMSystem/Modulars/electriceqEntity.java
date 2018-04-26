package com.example.HBMSystem.Modulars;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.util.Date;

@Entity
@Table(name ="electricequipments")

public class electriceqEntity {

    @Id
    private int no;

    @Column
    private String eq_name;

    @Column
    private String manufacturer;

    @Column
    private int noofwatts;

    @Column
    private int noofitems;

    @Column
    private Date expiredate;

    @Column
    private float noofhours;

    public int getNo() {
        return no;
    }

    public void setNo(int no) {
        this.no = no;
    }

    public String getEq_name() {
        return eq_name;
    }

    public void setEq_name(String eq_name) {
        this.eq_name = eq_name;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
    }

    public int getNoofwatts() {
        return noofwatts;
    }

    public void setNoofwatts(int noofwatts) {
        this.noofwatts = noofwatts;
    }

    public int getNoofitems() {
        return noofitems;
    }

    public void setNoofitems(int noofitems) {
        this.noofitems = noofitems;
    }

    public Date getExpiredate() {
        return expiredate;
    }

    public void setExpiredate(Date expiredate) {
        this.expiredate = expiredate;
    }

    public float getNoofhours() {
        return noofhours;
    }

    public void setNoofhours(float noofhours) {
        this.noofhours = noofhours;
    }
}
