//package com.example.HBMSystem.Controllers;
//
//import com.example.HBMSystem.Modulars.insurance;
//import com.example.HBMSystem.Modulars.watercompare;
//import com.example.HBMSystem.Repos.watercompareRepo;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.web.bind.annotation.*;
//
//import java.util.List;
//
//@RestController
//@RequestMapping ("/watercompare/")
//
//public class WaterComCon {
//
//    @Autowired
//    private watercompareRepo wc;
//
//    //read from DB
//    @GetMapping("/wcRead")
//    public List<watercompare> getall()
//    {
//        return wc.findAll();
//    }
//
//
//    //add edit from DB
//    @PostMapping("/wcAddEdit")
//    public watercompare createcompare (@RequestBody watercompare waterBill)
//    {
//        return wc.save(waterBill);
//    }
//
//
//    //delete from DB
//    @DeleteMapping("/wcdelete")
//    public void deletecompare (@RequestBody watercompare waterBill)
//    {
//        wc.delete(waterBill);
//    }
//
//}
