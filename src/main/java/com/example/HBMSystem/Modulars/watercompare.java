package com.example.HBMSystem.Modulars;

import javax.persistence.*;
import java.sql.Blob;
import java.util.Date;

@Entity
@Table(name="waterbill")

public class watercompare {

    @Id
    @GeneratedValue
    @Column(name ="no")
    private Integer no;

    @Column
    private String accno;

    @Column
    private float usedunits;

    @Column
    private String userid;

    @Column
    private Date date;

    @Column
    private float totalamount;

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
