package com.example.HBMSystem.Modulars;


import javax.persistence.*;
import java.sql.Blob;
import java.sql.Date;

@Entity
@Table(name = "waterbill")
public class addwaterEntity {

    @Id
    @GeneratedValue
    @Column(name ="no")
    private Integer no;

    @Column
    private String accno;

    @Column
    private Integer usedunits;

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

    public String getAccno() {
        return accno;
    }

    public void setAccno(String accno) {
        this.accno = accno;
    }

    public Integer getUsedunits() {
        return usedunits;
    }

    public void setUsedunits(Integer usedunits) {
        this.usedunits = usedunits;
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

