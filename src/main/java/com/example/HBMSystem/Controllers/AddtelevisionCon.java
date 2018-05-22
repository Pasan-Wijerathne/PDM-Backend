package com.example.HBMSystem.Controllers;

import com.example.HBMSystem.Repos.addtelevisionRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/billmanager/")
public class AddtelevisionCon {

    @Autowired
    private addtelevisionRepo tr;


}
