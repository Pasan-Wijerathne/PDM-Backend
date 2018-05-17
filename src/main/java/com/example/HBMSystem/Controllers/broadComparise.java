package com.example.HBMSystem.Controllers;



import com.example.HBMSystem.Modulars.comparisonBroad;
import com.example.HBMSystem.Repos.comparisonBroadRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/comparisonboard/")
public class broadComparise {
    @Autowired
    private comparisonBroadRepo broadCom;

    //read from the db
    @GetMapping("/broadbandRead1")
    public List<comparisonBroad> getAll() {
        return broadCom.findAll();
    }

    //add edit from db

    @PostMapping("/broadbandEdit")
    public comparisonBroad createbroad2(@RequestBody comparisonBroad broadbandinfo) {

        return broadCom.save(broadbandinfo);
    }

    @DeleteMapping("/broadDel")
    public void deletebroad2(@RequestBody comparisonBroad broadbandinfo){
        broadCom.delete(broadbandinfo);
    }

}
