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
    public Integer getUserid() {
        return userid;
    }

    public void setUserid(Integer userid) {
        this.userid = userid;
    }

    @Column
    private Integer userid;

    public java.sql.Date getDate() {
        return date;
    }

    public void setDate(java.sql.Date date) {
        this.date = date;
    }

    @Column
//    private Date date;
    private java.sql.Date date;
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




    public float getTotalamount() {
        return totalamount;
    }

    public void setTotalamount(float totalamount) {
        this.totalamount = totalamount;
    }


}
