package com.example.HBMSystem.Modulars;


import org.hibernate.annotations.JoinColumnOrFormula;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.sql.Blob;
import java.util.Date;

@Entity
@Table(name = "electricity")
public class electricity
{
    @Id
    private int id;

    @Column
    private int no;

    @Column
    private int Acc;

    @Column
    private float usedUnits;

    @Column
    private String UserId;

    @Column
    private java.util.Date Date;

    @Column
    private float TotalAmount;

    @Column
    private Blob AddImage;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getNo() {
        return no;
    }

    public void setNo(int no) {
        this.no = no;
    }

    public int getAcc() {
        return Acc;
    }

    public void setAcc(int acc) {
        Acc = acc;
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
