
package com.example.HBMSystem.Controllers;



import com.example.HBMSystem.Modulars.teleComMod;
import org.springframework.beans.factory.annotation.Autowired;
import com.example.HBMSystem.Repos.telecomparisonRepo;
import org.springframework.web.bind.annotation.*;


@RestController
@RequestMapping("/telephone/")

public class telecomprison {

    @Autowired
    private telecomparisonRepo comp;

    //read from the db
   // @GetMapping("/teleread")
   // public List<teleComMod> getAll() {
    //    return comp.findAll();
    //}

    //add edit from db

    @PostMapping("/teleEdit")
    public teleComMod createTele(@RequestBody teleComMod telephonebill) {

        return comp.save(telephonebill);
    }

    @DeleteMapping("/teledel")
    public void deleteTele(@RequestBody teleComMod telephonebill){
        comp.delete(telephonebill);
    }
}

