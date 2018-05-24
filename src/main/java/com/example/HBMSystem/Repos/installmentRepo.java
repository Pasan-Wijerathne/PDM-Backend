package com.example.HBMSystem.Repos;

import org.springframework.data.jpa.repository.JpaRepository;
import com.example.HBMSystem.Modulars.installment;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import org.springframework.data.jpa.repository.JpaRepository;

public interface installmentRepo extends JpaRepository<installment, Integer> {

//    @Query("from installment where object=:object")
//    public installment getByObject(@Param("object") String object);
//
////    @Query("from installment where date=:date and accno=:accno")
////    public installment getByDateAndAccno(@Param("date") java.sql.Date date , @Param("accno") String accno);
//
//    @Query("from installment where amount=:amount")
//    public installment getByamount(@Param("amount") float amount);
}
