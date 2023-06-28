package com.example.REST_SM.service;

import com.example.REST_SM.model.Counter;
import com.example.REST_SM.model.Dog;
import com.example.REST_SM.repository.DogRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DogService {
    @Autowired
    DogRepository dogRepository;

    public List<Dog> getAll() {
        Counter.plusOne();
        return dogRepository.getAll();
    }

    public Dog getOne(int id) {
        Counter.plusOne();
        return dogRepository.getOne(id);
    }

    public String addDog(Dog dog) {
        Counter.plusOne();
        Dog tempDog = dogRepository.getOne(dog.getId());

        if(tempDog == null){
            dogRepository.save(dog);
            return "Success!";
        }else {
            return "Error!";
        }

    }

    public String deleteDog(int id) {
        Counter.plusOne();
        Dog tempDog = dogRepository.getOne(id);


        if(tempDog != null){
            dogRepository.delete(tempDog);
            return "Record deleted successfully!";
        }else{
            return "Error!";
        }
    }


    public String updateDog(Dog dog) {
        Counter.plusOne();
        Dog tempDog = dogRepository.getOne(dog.getId());

        if(tempDog != null){
            //if(dog.getId() != 0) tempDog.setId(dog.getId());
            if(dog.getDogname() != null) tempDog.setDogname(dog.getDogname());
            if(dog.getAge() != 0) tempDog.setAge(dog.getAge());

            dogRepository.save(tempDog);

            return "Updated !";

        }else {
            return "Error!";
        }
    }
}
