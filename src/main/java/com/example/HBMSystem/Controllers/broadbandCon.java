package com.example.HBMSystem.Controllers;


import com.example.HBMSystem.Modulars.broadbandinfo;
import com.example.HBMSystem.Repos.broadbandRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/broadband/")
public class broadbandCon {

    @Autowired
    private broadbandRepo broad;

    //read from the db
    @GetMapping("/broadbandRead")
    public List<broadbandinfo> getAll() {
        return broad.findAll();
    }

    //add edit from db

    @PostMapping("/broadbandEdit")
    public broadbandinfo createsim(@RequestBody broadbandinfo braodbandinfo) {

        return broad.save(broadband);
    }

    @DeleteMapping("/broadDel")
    public void deletebroad(@RequestBody broadbandinfo broadbandinfo){
        broad.delete(broadbandinfo);
    }


}
