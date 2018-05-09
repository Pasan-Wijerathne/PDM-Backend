package com.example.HBMSystem.Modulars;



import org.hibernate.annotations.JoinColumnOrFormula;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.sql.Blob;

import java.util.Date;

@Entity
@Table(name = "mysim")


public class mysim {

    @Id
    private int no;

    @Column
    private String userid;

    @Column
    private int simnum;



    @Column
    private String userpwd;

    @Column
    private int simsnum;

    @Column
    private String simcountry;

    @Column
    private int simimeinum;

    @Column
    private String simcategory;

    public int getNo() {
        return no;
    }

    public void setNo(int no) {
        this.no = no;
    }

    public String getUserid() {
        return userid;
    }

    public void setUserid(String userid) {
        this.userid = userid;
    }

    public int getSimnum() {
        return simnum;
    }

    public void setSimnum(int simnum) {
        this.simnum = simnum;
    }

    public String getUserpwd() {
        return userpwd;
    }

    public void setUserpwd(String userpwd) {
        this.userpwd = userpwd;
    }

    public int getSimsnum() {
        return simsnum;
    }

    public void setSimsnum(int simsnum) {
        this.simsnum = simsnum;
    }

    public String getSimcountry() {
        return simcountry;
    }

    public void setSimcountry(String simcountry) {
        this.simcountry = simcountry;
    }

    public int getSimimeinum() {
        return simimeinum;
    }

    public void setSimimeinum(int simimeinum) {
        this.simimeinum = simimeinum;
    }

    public String getSimcategory() {
        return simcategory;
    }

    public void setSimcategory(String simcategory) {
        this.simcategory = simcategory;
    }
}
