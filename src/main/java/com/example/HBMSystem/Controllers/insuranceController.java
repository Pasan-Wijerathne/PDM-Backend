package com.example.HBMSystem.Controllers;
import com.example.HBMSystem.Modulars.insurance;
import com.example.HBMSystem.Repos.insuranceRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/insurancebill/")

public class insuranceController {

    @Autowired
    private insuranceRepo in;

    //read from db
    @GetMapping("/inRead")
    public List<insurance> getAll(){
        return in.findAll();
    }

    //add  from db
    @PostMapping ("/inadd")
    public insurance createbill(@RequestBody insurance insurancebill){
        return in.save(insurancebill);
    }

    //edit from db
    @PostMapping ("/inedit")
    public List<insurance> createbills(@RequestBody List<insurance> insurancebill){
        return in.saveAll(insurancebill);
    }

    //delete from db
    @DeleteMapping("/indelete")
    public void deletebill(@RequestBody insurance insurancebill){
        in.delete(insurancebill);
    }
}

