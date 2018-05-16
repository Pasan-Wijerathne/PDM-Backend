package com.example.HBMSystem.Controllers;

import com.example.HBMSystem.Modulars.medicineMod;
import com.example.HBMSystem.Repos.medicineRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/medicine")

public class MedicineController {

    @Autowired
    private medicineRepo m;

    //read from DB
    @GetMapping("/readmedicine")
    public List<medicineMod> getAll()
    {
        return m.findAll();
    }

    //add to DB
    @PostMapping("/addmedicine")
    public medicineMod add_medicine(@RequestBody medicineMod medicine)
    {
        return m.save(medicine);
    }

    //update DB
    @PostMapping ("/updatmedicine")
    public List<medicineMod> update_medicine(@RequestBody List<medicineMod> medicine){
        return m.saveAll(medicine);
    }

    //delete from DB
    @PostMapping("/deletemedicine")
    public void delete_medicine(@RequestBody medicineMod medicine)
    {
        m.delete(medicine);
    }
}
