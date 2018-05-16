
package com.example.HBMSystem.Controllers;

import com.example.HBMSystem.Modulars.gasMod;
import com.example.HBMSystem.Repos.gasRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.List;

public class gasController {

    @Autowired
    private gasRepo g;

    //read from DB
    @GetMapping("/readgas")
    public List<gasMod> getAll()
    {
        return g.findAll();
    }

    //add to DB
    @PostMapping("/addgas")
    public gasMod add_gas(@RequestBody gasMod gas)
    {
        return g.save(gas);
    }

    //update DB
    @PostMapping ("/updategas")
    public List<gasMod> update_gas(@RequestBody List<gasMod> gas){
        return g.saveAll(gas);
    }

    //delete from DB
    @PostMapping("/deletegas")
    public void delete_gas(@RequestBody gasMod gas)
    {
        g.delete(gas);
    }
}
