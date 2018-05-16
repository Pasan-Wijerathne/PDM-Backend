package com.example.HBMSystem.Controllers;

import com.example.HBMSystem.Modulars.vehicleMod;
import com.example.HBMSystem.Repos.VehicleRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/vehicle")


public class VehicleController {

    @Autowired
    private VehicleRepo v;

    //read from DB
    @GetMapping("/readvehicle")
    public List<vehicleMod> getAll()
    {
        return v.findAll();
    }

    //add to DB
    @PostMapping("/addvehicle")
    public vehicleMod add_vehicle(@RequestBody vehicleMod vehicle)
    {
        return v.save(vehicle);
    }

    //update DB
    @PostMapping ("/updatevehicle")
    public List<vehicleMod> update_vehicle(@RequestBody List<vehicleMod> vehicle){
        return v.saveAll(vehicle);
    }

    //delete from DB
    @PostMapping("/deletevehicle")
    public void delete_vehicle(@RequestBody vehicleMod vehicle)
    {
        v.delete(vehicle);
    }
}
