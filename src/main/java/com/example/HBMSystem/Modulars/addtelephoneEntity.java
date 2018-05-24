package com.example.HBMSystem.Modulars;

import javax.persistence.*;
import java.sql.Blob;
import java.sql.Date;

@Entity
@Table(name = "telephonebill")
public class addtelephoneEntity {

    @Id
    @GeneratedValue
    @Column(name ="no")
    private Integer no;

    @Column
    private String linetype;

    @Column
    private Integer number;

    @Column
    private Integer userid;

    @Column
    private float periodcharge;

    @Column
    private java.sql.Date date;

    @Column
    private float totalamount;

//    @Column
//    private Blob addimage;


    public Integer getNo() {
        return no;
    }

//    public void setNo(Integer no) {
//        this.no = no;
//    }

    public String getLinetype() {
        return linetype;
    }

    public void setLinetype(String linetype) {
        this.linetype = linetype;
    }

    public Integer getNumber() {
        return number;
    }

    public void setNumber(Integer number) {
        this.number = number;
    }

    public Integer getUserid() {
        return userid;
    }

    public void setUserid(Integer userid) {
        this.userid = userid;
    }

    public float getPeriodcharge() {
        return periodcharge;
    }

    public void setPeriodcharge(float periodcharge) {
        this.periodcharge = periodcharge;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public float getTotalamount() {
        return totalamount;
    }

    public void setTotalamount(float totalamount) {
        this.totalamount = totalamount;
    }

//    public Blob getAddimage() {
//        return addimage;
//    }
//
//    public void setAddimage(Blob addimage) {
//        this.addimage = addimage;
//    }
}
