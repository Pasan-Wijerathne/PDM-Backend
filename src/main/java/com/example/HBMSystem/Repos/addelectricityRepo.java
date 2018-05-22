package com.example.HBMSystem.Repos;

import com.example.HBMSystem.Modulars.addelectricityEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

public interface addelectricityRepo extends JpaRepository<addelectricityEntity,Integer>
{

    @Query("from addelectricityEntity where accno=:accno")
    public addelectricityEntity getByAccno(@Param("accno") String accno);

    @Query("from addelectricityEntity where date=:date and accno=:accno")
    public addelectricityEntity getByDateAndAccno(@Param("date") java.sql.Date date , @Param("accno") String accno);

}
