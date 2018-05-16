package com.example.HBMSystem.Modulars;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.util.Date;

@Entity
@Table(name="gas")
public class gasMod {

    @Id
    private int no;
    @Column
    private Integer noofcylinders;
    @Column
    private String userid;
    @Column
    private Date date;
    @Column
    private float totalamount;

    public int getNo() {
        return no;
    }

    public void setNo(int no) {
        this.no = no;
    }

    public Integer getNoofcylinders() {
        return noofcylinders;
    }

    public void setNoofcylinders(Integer noofcylinders) {
        this.noofcylinders = noofcylinders;
    }

    public String getUserid() {
        return userid;
    }

    public void setUserid(String userid) {
        this.userid = userid;
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


}
