package com.example.HBMSystem.Controllers;
import com.example.HBMSystem.Modulars.electriceqEntity;
import com.example.HBMSystem.Repos.electriceqRepo;
import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/electriceq/")

public class kodiController {

    @Autowired
    private electriceqRepo eqkodi;

    //read from db
    @GetMapping ("/electriceqread")
        public List<electriceqEntity> getAll(){
            return eqkodi.findAll();
        }

    //add from db
    @PostMapping ("/electriceqadd")
    public electriceqEntity createbill(@RequestBody electriceqEntity electricequipments){
        return eqkodi.save(electricequipments) ;
    }

    //edit from db
    @PostMapping ("/electriceqesave")
    public List<electriceqEntity> createbills(@RequestBody List<electriceqEntity> electricequipments){
        return eqkodi.saveAll(electricequipments);
    }

    //delete from db
    @DeleteMapping("/electriceqdel")
    public void deletebill(@RequestBody electriceqEntity electricequipments){
        eqkodi.delete(electricequipments);

    }


}
