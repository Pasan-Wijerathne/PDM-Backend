package com.example.HBMSystem.Controllers;


import com.example.HBMSystem.Modulars.telecomparison;
import com.example.HBMSystem.Modulars.mysim;
import org.springframework.beans.factory.annotation.Autowired;
import com.example.HBMSystem.Repos.telecomparisonRepo;
import org.springframework.web.bind.annotation.*;


@RestController
@RequestMapping("/telephone/")

public class telecomprison {

    @Autowired
    private telecomparisonRepo comp;

    //read from the db
    @GetMapping("/teleread")
    public List<telecomparison> getAll() {
        return comp.findAll();
    }

    //add edit from db

    @PostMapping("/teleEdit")
    public mysim createtele(@RequestBody telecomparison bms) {

        return sim1.save(bms);
    }

    @DeleteMapping("/simdel")
    public void deleteTele(@RequestBody telecomparison bms){
        comp.delete(bms);
    }
}
