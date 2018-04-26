package com.example.HBMSystem.Controllers;


import com.example.HBMSystem.Modulars.Electricity1;
import com.example.HBMSystem.Repos.Electricitybill1;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/billmanager/")

public class BillmanagerCon {

    @Autowired
    private Electricitybill1 eb;


    @GetMapping("/elecbillread")
    public List<Electricity1> getAll(){
        return eb.findAll();
    }

    @PostMapping ("/elecbilladdedit")
    public Electricity1 createbill(@RequestBody Electricity1 electricitybill){
        return eb.save(electricitybill);
    }

    //delete from db
    @DeleteMapping("/elecbilldel")
    public void deletebill(@RequestBody  Electricity1 electricitybill){
        eb.delete(electricitybill);
    }

}
