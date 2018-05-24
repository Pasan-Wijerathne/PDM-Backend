//package com.example.HBMSystem.Controllers;
//
//
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.web.bind.annotation.GetMapping;
//import org.springframework.web.bind.annotation.RequestBody;
//import org.springframework.web.bind.annotation.RequestMapping;
//import org.springframework.web.bind.annotation.RestController;
//import com.example.HBMSystem.Repos.loginRepo;
//import com.example.HBMSystem.Modulars.CreateuserEntity;
//
//@RestController
//@RequestMapping("/Auth")
//public class loginCon {
//
//    @Autowired
//    private loginRepo lr;
//
//    @GetMapping("/login")
//    public CreateuserEntity loginUser(@RequestBody CreateuserEntity user){
//        return lr.findById(user.getUserid());
//    }
//
//}
