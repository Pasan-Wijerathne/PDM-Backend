package com.example.HBMSystem.Controllers;
import com.example.HBMSystem.Modulars.WaterEntity;
import org.springframework.beans.factory.annotation.Autowired;
import com.example.HBMSystem.Repos.WaterbillRepo;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/billmanager/")

public class waterCon
{
    @Autowired
    private WaterbillRepo wr;

    @GetMapping("/waterbillread")
    public List<WaterEntity> getAll(){
        return wr.findAll();
    }

    @PostMapping("/waterbilladdedit")
    public WaterEntity createbill(@RequestBody WaterEntity waterbill){
        return wr.save(waterbill);
    }

    //delete from db
    @DeleteMapping("/waterdel")
    public void deletebill(@RequestBody WaterEntity waterbill){
        wr.delete(waterbill);
    }


}
