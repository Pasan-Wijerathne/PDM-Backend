package com.example.HBMSystem.Controllers;

import com.example.HBMSystem.Modulars.broadbandinfo;
import com.example.HBMSystem.Modulars.mysim;
import com.example.HBMSystem.Repos.MysimRepo;
import com.example.HBMSystem.Repos.broadbandRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/mysim/")


public class MysimCon {

    @Autowired
    private MysimRepo sim1;

    //read from the db
    @GetMapping("/simread")
    public List<mysim> getAll() {
        return sim1.findAll();
    }

    //add edit from db

    @PostMapping("/simedit")
    public mysim createsim(@RequestBody mysim mysim) {

    return sim1.save(mysim);
    }

    @DeleteMapping("/simdel")
    public void deletesim(@RequestBody mysim mysim){
        sim1.delete(mysim);
    }







}
