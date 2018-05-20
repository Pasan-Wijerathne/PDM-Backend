package com.example.HBMSystem.Modulars;

import javax.persistence.*;
import java.sql.Blob;
import java.text.DateFormat;
import java.util.Date;

@Entity
@Table(name = "electricitybill")

public class ElectricityEntity {

    @Id
    @GeneratedValue
    @Column(name ="no")
    private Integer no;

    @Column
    private String accno;

    @Column
    private float usedunits;

    @Column
    private Integer userid;

    @Column
   // private Date date;
    private java.sql.Date date;

    @Column
    private float totalamount;

    @Column
    private Blob addimage;


    public Integer getNo() {
        return no;
    }

    public void setNo(Integer no) {
        this.no = no;
    }

    public String getAccno() {
        return accno;
    }

    public void setAccno(String accno) {
        this.accno = accno;
    }

    public float getUsedunits() {
        return usedunits;
    }

    public void setUsedunits(float usedunits) {
        this.usedunits = usedunits;
    }

    public Integer getUserid() {
        return userid;
    }

    public void setUserid(Integer userid) {
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

    public Blob getAddimage() {
        return addimage;
    }

    public void setAddimage(Blob addimage) {
        this.addimage = addimage;
    }
}