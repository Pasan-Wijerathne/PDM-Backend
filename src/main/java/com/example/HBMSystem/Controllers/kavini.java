package com.example.HBMSystem.Controllers;

import com.example.HBMSystem.Modulars.vehicle;
import com.example.HBMSystem.Repos.vehicleform;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/vehicle/")


public class kavini {

    @Autowired
    private vehicleform v;

    //read from DB
    @GetMapping("/readvehicle")
    public List<vehicle> getAll()
    {
        return v.findAll();
    }

    //add,update from DB
    @PostMapping("/addvehicle")
    public vehicle addupdate_vehicle(@RequestBody vehicle vehicle)
    {
        return v.save(vehicle);
    }

    //delete from DB
    @PostMapping("/removevehicle")
    public void delete_vehicle(@RequestBody vehicle vehicle)
    {
        v.delete(vehicle);
    }
}
