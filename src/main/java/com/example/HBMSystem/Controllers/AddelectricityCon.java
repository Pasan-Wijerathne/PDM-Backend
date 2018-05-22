package com.example.HBMSystem.Controllers;
import com.example.HBMSystem.Modulars.addelectricityEntity;
import org.springframework.beans.factory.annotation.Autowired;
import com.example.HBMSystem.Repos.addelectricityRepo;
import org.springframework.data.repository.query.Param;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/billmanager/")

public class AddelectricityCon {

    @Autowired
    private addelectricityRepo eb;


    //this is filter query
    @GetMapping("/ecId")
    public addelectricityEntity getById(@Param("accno") String accno){
        return eb.getByAccno(accno);
    }

    @GetMapping("/ecdateid")
    public addelectricityEntity getByDateandAccno(@Param("date") java.sql.Date date , @Param("accno") String accno)
    {
        return eb.getByDateAndAccno(date,accno);
    }

    //read from db
    @GetMapping("/elecbillread")
    public List<addelectricityEntity> getAll(){
        return eb.findAll();
    }

    //add  from db
    @PostMapping ("/elecbilladd")
    public addelectricityEntity createbills(@RequestBody addelectricityEntity electricitybill){
        return eb.save(electricitybill);
    }


    //save from db
    @PostMapping ("/elecbillsave")
    public List<addelectricityEntity> createbills(@RequestBody List<addelectricityEntity> electricitybill){
        return eb.saveAll(electricitybill);
    }

    //delete from db
    @DeleteMapping("/elecbilldel")
    public void deletebill(@RequestBody addelectricityEntity electricitybill){
        eb.delete(electricitybill);
    }

}

