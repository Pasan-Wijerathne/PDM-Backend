package com.example.HBMSystem.Controllers;
import com.example.HBMSystem.Modulars.ElectricityEntity;
import org.springframework.beans.factory.annotation.Autowired;
import com.example.HBMSystem.Repos.ElectricitybillRepo;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/billmanager/")

public class pasan {

    @Autowired
    private ElectricitybillRepo eb;


    //read from db
    @GetMapping("/elecbillread")
    public List<ElectricityEntity> getAll(){
        return eb.findAll();
    }

    //add  from db
    @PostMapping ("/elecbilladd")
    public ElectricityEntity createbills(@RequestBody ElectricityEntity electricitybill){
        return eb.save(electricitybill);
    }



    //save from db
    @PostMapping ("/elecbillsa")
    public List<ElectricityEntity> createbills(@RequestBody List<ElectricityEntity> electricitybill){
        return eb.saveAll(electricitybill);
    }

    //delete from db
    @DeleteMapping("/elecbilldel")
    public void deletebill(@RequestBody ElectricityEntity electricitybill){
        eb.delete(electricitybill);
    }

}

