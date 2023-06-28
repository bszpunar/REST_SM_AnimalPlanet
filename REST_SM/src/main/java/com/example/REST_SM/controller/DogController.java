package com.example.REST_SM.controller;

import com.example.REST_SM.model.Dog;
import com.example.REST_SM.service.DogService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class DogController {

    @Autowired
    DogService dogService;

    @GetMapping("/dogs")
    public List<Dog> getAll(){
        return dogService.getAll();
    }

    @GetMapping("/dogs/{id}")
    public Dog getAll(@PathVariable int id){
        return dogService.getOne(id);
    }

    @PostMapping("/dogs/save")
    public String addDog(@RequestBody Dog dog){
        return dogService.addDog(dog);
    }

    @DeleteMapping("dogs/remove/{id}")
    public String deleteDog(@PathVariable int id){
        return dogService.deleteDog(id);
    }

    @PutMapping("dogs/update")
    public String updateDog(@RequestBody Dog dog){
        return dogService.updateDog(dog);
    }

}
