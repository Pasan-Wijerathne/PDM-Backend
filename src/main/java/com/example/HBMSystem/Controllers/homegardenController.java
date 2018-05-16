package com.example.HBMSystem.Controllers;

import org.springframework.web.bind.annotation.*;
import com.example.HBMSystem.Modulars.gardenMod;
import com.example.HBMSystem.Repos.gardenRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
@RestController
@RequestMapping("/garden")

public class homegardenController {

    @Autowired
    private gardenRepo h;

    //read from DB
    @GetMapping("/readgarden")
    public List<gardenMod> getAll()
    {
        return h.findAll();
    }

    //add to DB
    @PostMapping("/addgarden")
    public gardenMod add_garden(@RequestBody gardenMod house_garden)
    {
        return h.save(house_garden);
    }

    //update DB
    @PostMapping ("/updategarden")
    public List<gardenMod> update_garden(@RequestBody List<gardenMod> house_garden){
        return h.saveAll(house_garden);
    }

    //delete from DB
    @PostMapping("/deletegarden")
    public void delete_garden(@RequestBody gardenMod house_garden)
    {
        h.delete(house_garden);
    }
}
