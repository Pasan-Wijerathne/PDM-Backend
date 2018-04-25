package com.example.HBMSystem.Controllers;


import com.example.HBMSystem.Modulars.TestEntity;
import com.example.HBMSystem.Repos.TestRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/test/rest/")

public class RooteController {


    @Autowired
    private TestRepo repo;


    //crud = create read update delete

    //read from db
    @GetMapping("/users")
    public List<TestEntity> getAll(){
        return repo.findAll();
    }

    //add to db // Craate //update
//    @PostMapping(consumes = "äpplication/json", path = "/addUser")
//    public TestEntity createTest(@RequestBody TestEntity test){
//      return repo.save(test);
//    }

    @PostMapping()

    //delete from db
    public void deleteTest(@RequestBody  TestEntity test){
        repo.delete(test);
    }
}

