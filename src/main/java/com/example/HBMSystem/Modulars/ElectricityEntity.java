package com.example.HBMSystem.Modulars;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.sql.Blob;
import java.util.Date;

@Entity
@Table(name = "electricitybill")

public class ElectricityEntity {

    @Id()
    private int no;

    @Column(name ="AccoNo")
    private int AccNo;

    @Column(name = "usedUnits")
    private float usedUnits;

    @Column(name = "UserId")
    private String UserId;

    @Column(name = "Date")
    private Date Date;

    @Column(name = "TotalAmount")
    private float TotalAmount;

    @Column(name = "AddImage")
    private Blob AddImage;

    public int getNo() {
        return no;
    }

    public void setNo(int no) {
        this.no = no;
    }

    public int getAccNo() {
        return AccNo;
    }

    public void setAccNo(int accNo) {
        AccNo = accNo;
    }

    public float getUsedUnits() {
        return usedUnits;
    }

    public void setUsedUnits(float usedUnits) {
        this.usedUnits = usedUnits;
    }

    public String getUserId() {
        return UserId;
    }

    public void setUserId(String userId) {
        UserId = userId;
    }

    public java.util.Date getDate() {
        return Date;
    }

    public void setDate(java.util.Date date) {
        Date = date;
    }

    public float getTotalAmount() {
        return TotalAmount;
    }

    public void setTotalAmount(float totalAmount) {
        TotalAmount = totalAmount;
    }

    public Blob getAddImage() {
        return AddImage;
    }

    public void setAddImage(Blob addImage) {
        AddImage = addImage;
    }
}
