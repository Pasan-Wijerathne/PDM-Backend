package com.example.HBMSystem.Controllers;

import com.example.HBMSystem.Modulars.broadbandinfo;
import com.example.HBMSystem.Modulars.mysim;
import com.example.HBMSystem.Repos.MysimRepo;
import com.example.HBMSystem.Repos.broadbandRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/telephone/")


public class OshadiCon {

    @Autowired
    private MysimRepo sim1;

    //read from the db
    @GetMapping("/simread")
    public List<mysim> getAll() {
        return sim1.findAll();
    }

    //add edit from db

    @PostMapping("/simedit")
    public mysim createsim(@RequestBody mysim bms) {

    return sim1.save(bms);
    }

    @DeleteMapping("/simdel")
    public void deletesim(@RequestBody mysim bms){
        sim1.delete(bms);
    }







}
