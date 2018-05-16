package com.example.HBMSystem.Controllers;



import com.example.HBMSystem.Modulars.broadComMod;
import com.example.HBMSystem.Repos.broadComRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/comparisonboard/")
public class broadComparise {
    @Autowired
    private comparisonBroadRepo broadCom;

    //read from the db
    @GetMapping("/broadbandRead")
    public List<comparisonBroad> getAll() {
        return broadCom.findAll();
    }

    //add edit from db

    @PostMapping("/broadbandEdit")
    public comparisonBroad createbroad2(@RequestBody comparisonBroad braodbandinfo) {

        return broadCom.save(broadbandinfo);
    }

    @DeleteMapping("/broadDel")
    public void deletebroad2(@RequestBody comparison broadbandinfo){
        broadCom.delete(broadbandinfo);
    }

}
