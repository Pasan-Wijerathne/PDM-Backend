package com.example.HBMSystem.Controllers;
import com.example.HBMSystem.Modulars.CreateuserEntity;
import com.example.HBMSystem.Repos.CreateuserRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.List;


@RestController
@RequestMapping("/")
@CrossOrigin(origins = "http://localhost:4200",allowedHeaders = "*")

public class CreateuserCon {

    @Autowired
    private CreateuserRepo lr;

    //read from db
    @GetMapping ("/getuser")
    public List<CreateuserEntity> getAll()
    {
        return lr.findAll();
    }


//    save from db
//    @PostMapping ("/createuser")
//    public List<CreateuserRepo> createuser(@RequestBody List<CreateuserEntity> users){
//        return lr.saveAll(users);
//    }

    //add  from db
    @PostMapping ("/createuser")
    public CreateuserEntity createuser(@RequestBody CreateuserEntity users){
        return lr.save(users);
    }

}

