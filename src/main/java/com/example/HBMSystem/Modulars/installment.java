package com.example.HBMSystem.Modulars;

import javax.persistence.*;
import java.sql.Blob;
import java.util.Date;

@Entity
@Table(name="installments")

public class installment {

    @Id
    @GeneratedValue
    @Column(name ="no")
    private Integer no;

    @Column
    private Integer userid;

    @Column
    private String object;

    @Column
    private String serialno;

    @Column
    private float amount;

    @Column
    private int years;

    @Column
    private float downpayment;

    @Column
    private float intrate;

    @Column
    private float amountpermonth;

    @Column
    private float amountpayble;

    public Integer getNo() {
        return no;
    }

    public void setNo(Integer no) {
        this.no = no;
    }

    public Integer getUserid() {
        return userid;
    }

    public void setUserid(Integer userid) {
        this.userid = userid;
    }

    public String getObject() {
        return object;
    }

    public void setObject(String object) {
        this.object = object;
    }

    public String getSerialno() {
        return serialno;
    }

    public void setSerialno(String serialno) {
        this.serialno = serialno;
    }

    public float getAmount() {
        return amount;
    }

    public void setAmount(float amount) {
        this.amount = amount;
    }

    public int getYears() {
        return years;
    }

    public void setYears(int years) {
        this.years = years;
    }

    public float getDownpayment() {
        return downpayment;
    }

    public void setDownpayment(float downpayment) {
        this.downpayment = downpayment;
    }

    public float getIntrate() {
        return intrate;
    }

    public void setIntrate(float intrate) {
        this.intrate = intrate;
    }

    public float getAmountpermonth() {
        return amountpermonth;
    }

    public void setAmountpermonth(float amountpermonth) {
        this.amountpermonth = amountpermonth;
    }

    public float getAmountpayble() {
        return amountpayble;
    }

    public void setAmountpayble(float amountpayble) {
        this.amountpayble = amountpayble;
    }
}
