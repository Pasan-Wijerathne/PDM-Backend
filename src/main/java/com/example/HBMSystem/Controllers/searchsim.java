//
//
//package com.example.HBMSystem.Controllers;
//import com.example.HBMSystem.Modulars.searchsimMod;
//import com.example.HBMSystem.Modulars.mysim;
//import org.springframework.beans.factory.annotation.Autowired;
//import com.example.HBMSystem.Repos.searchsimRepo;
//import org.springframework.web.bind.annotation.*;
//
//public class searchsim {
//    @Autowired
//    private searchsimRepo search;
//
//    //read from the db
//    @GetMapping("/searchread")
//    public List<searchsimMod> getAll() {
//        return search.findAll();
//    }
//
//    //add edit from db
//
//    @PostMapping("/searchEdit")
//    public searchsim createSearch(@RequestBody searchsimMod mysim) {
//
//        return search.save(mysim);
//    }
//
//    @DeleteMapping("/searchdel")
//    public void deleteSearch(@RequestBody searchsimMod mysim){
//        search.delete(mysim);
//    }
//
//}
