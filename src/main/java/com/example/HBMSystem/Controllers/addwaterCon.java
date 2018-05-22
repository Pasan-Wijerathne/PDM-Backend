package com.example.HBMSystem.Controllers;
import com.example.HBMSystem.Modulars.addwaterEntity;
import com.example.HBMSystem.Repos.addwaterRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/billmanager/")

public class addwaterCon {

    @Autowired
    private addwaterRepo wr;

    //read from db
    @GetMapping("/getwaterbill")
    public List<addwaterEntity> getAll()
    {
        return wr.findAll();
    }

    //add to db
    @PostMapping("/createwaterbill")
    public List<addwaterEntity> createusers(@RequestBody List<addwaterEntity> waterbill){
        return wr.saveAll(waterbill);
    }

}
