package com.example.HBMSystem.Modulars;


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
    private float periodCharge;

    @Column
    private String UserId;

    @Column
    private date Date;

    @Column
    private float TotalAmount;

    public int getNo() {
        return no;
    }

    public void setNo(int no) {
        this.no = no;
    }

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

    public float getPeriodCharge() {
        return periodCharge;
    }

    public void setPeriodCharge(float periodCharge) {
        this.periodCharge = periodCharge;
    }

    public String getUserId() {
        return UserId;
    }

    public void setUserId(String userId) {
        UserId = userId;
    }

    public date getDate() {
        return Date;
    }

    public void setDate(date date) {
        Date = date;
    }

    public float getTotalAmount() {
        return TotalAmount;
    }

    public void setTotalAmount(float totalAmount) {
        TotalAmount = totalAmount;
    }
}
