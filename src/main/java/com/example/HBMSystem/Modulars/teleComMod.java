package com.example.HBMSystem.Modulars;


import org.apache.naming.java.javaURLContextFactory;
import org.hibernate.annotations.JoinColumnOrFormula;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.sql.Blob;

import java.util.Date;

@Entity
@Table(name = "telephonebill")
public class teleComMod {

    @Id
    private int no;

    @Column
    private String linetype;

    @Column
    private int number;

    @Column
    private float periodcharge;

    @Column
    private String userid;

    @Column
    private java.sql.Date date;

    @Column
    private float totalamount;

    public int getNo() {
        return no;
    }

//    public void setNo(int no) {
//        this.no = no;
//    }

    public String getLinetype() {
        return linetype;
    }

    public void setLinetype(String linetype) {
        this.linetype = linetype;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public float getPeriodcharge() {
        return periodcharge;
    }

    public void setPeriodcharge(float periodcharge) {
        this.periodcharge = periodcharge;
    }

    public String getUserid() {
        return userid;
    }

    public void setUserid(String userid) {
        this.userid = userid;
    }

    public java.sql.Date getDate() {
        return date;
    }

    public void setDate(java.sql.Date date) {
        this.date = date;
    }

    public float getTotalamount() {
        return totalamount;
    }

    public void setTotalamount(float totalamount) {
        this.totalamount = totalamount;
    }
}
