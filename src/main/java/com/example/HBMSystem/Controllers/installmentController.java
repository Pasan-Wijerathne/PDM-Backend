package com.example.HBMSystem.Controllers;
import com.example.HBMSystem.Modulars.installment;
import com.example.HBMSystem.Repos.installmentRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/installments/")

public class installmentController {

    @Autowired
    private installmentRepo inst;

    //read from db
    @GetMapping("/instaRead")
    public List<installment> getAll(){
        return inst.findAll();
    }

    //add  from db
    @PostMapping ("/instaadd")
    public installment createbill(@RequestBody installment installments){
        return inst.save(installments);
    }

    //edit from db
    @PostMapping ("/instaedit")
    public List<installment> createbills(@RequestBody List<installment> installments){
        return inst.saveAll(installments);
    }

    //delete from db
    @DeleteMapping("/instadelete")
    public void deletebill(@RequestBody installment installments){
        inst.delete(installments);
    }
}
