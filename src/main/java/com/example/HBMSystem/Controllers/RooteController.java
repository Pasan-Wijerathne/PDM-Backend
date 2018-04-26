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
    @GetMapping("/readdb")
    public List<TestEntity> getAll(){
        return repo.findAll();
    }

    //add to db // Craate //update
    @PostMapping("/addUser")
    public TestEntity createTest(@RequestBody TestEntity test){
      return repo.save(test);
    }


    //delete from db
<<<<<<< HEAD
    public void deleteTest(@RequestBody  TestEntity test)
    {
=======
    @DeleteMapping("/removeTest")
    public void deleteTest(@RequestBody  TestEntity test){
>>>>>>> 992cafd5ed304df60ac0fbb41593f79a65dc948c
        repo.delete(test);
    }
}

