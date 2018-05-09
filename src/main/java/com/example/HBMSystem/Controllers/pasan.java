package com.example.HBMSystem.Controllers;
import com.example.HBMSystem.Modulars.ElectricityEntity;
import org.springframework.beans.factory.annotation.Autowired;
import com.example.HBMSystem.Repos.ElectricitybillRepo;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/billmanager/")

//tho server eka run karala nea ne

public class pasan {

    @Autowired
    private ElectricitybillRepo eb;

    //read from db
    @GetMapping("/elecbillread")
    public List<ElectricityEntity> getAll(){
        return eb.findAll();
    }

    //add edit from db
    @PostMapping ("/elecbilladdedit")
    public ElectricityEntity createbill(@RequestBody ElectricityEntity electricitybill){
        return eb.save(electricitybill);
    }

    //delete from db
    @DeleteMapping("/elecbilldel")
    public void deletebill(@RequestBody ElectricityEntity electricitybill){
        eb.delete(electricitybill);

    }

}
