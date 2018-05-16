package com.example.HBMSystem.Controllers;



@RestController
@RequestMapping("/telephone/")

public class telecomprison {

    @Autowired
    private telecomparisonRepo comp;

    //read from the db
    @GetMapping("/teleread")
    public List<telecomparison> getAll() {
        return comp.findAll();
    }

    //add edit from db

    @PostMapping("/teleEdit")
    public mysim createtele(@RequestBody telecomparison bms) {

        return sim1.save(bms);
    }

    @DeleteMapping("/simdel")
    public void deleteTele(@RequestBody telecomparison bms){
        comp.delete(bms);
    }
}
