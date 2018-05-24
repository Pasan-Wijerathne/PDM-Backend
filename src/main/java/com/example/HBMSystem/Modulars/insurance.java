package com.example.HBMSystem.Modulars;

import javax.persistence.*;
import java.sql.Blob;
import java.util.Date;

@Entity
@Table(name="insurancebill")

public class insurance {

    @Id
    @GeneratedValue
    @Column(name ="no")
    private Integer no;

    @Column
    private String userid;

    @Column
    private String accno;

    @Column
    private int noofyears;

    @Column
    private Date dateofnextpremium;

    @Column
    private float premium;

    @Column
    private String time_interval;

    public Integer getNo() {
        return no;
    }

    public void setNo(Integer no) {
        this.no = no;
    }

    public String getUserid() {
        return userid;
    }

    public void setUserid(String userid) {
        this.userid = userid;
    }

    public String getAccno() {
        return accno;
    }

    public void setAccno(String accno) {
        this.accno = accno;
    }

    public int getNoofyears() {
        return noofyears;
    }

    public void setNoofyears(int noofyears) {
        this.noofyears = noofyears;
    }

    public Date getDateofnextpremium() {
        return dateofnextpremium;
    }

    public void setDateofnextpremium(Date dateofnextpremium) {
        this.dateofnextpremium = dateofnextpremium;
    }

    public float getPremium() {
        return premium;
    }

    public void setPremium(float premium) {
        this.premium = premium;
    }

    public String getTime_interval() {
        return time_interval;
    }

    public void setTime_interval(String time_interval) {
        this.time_interval = time_interval;
    }
}
