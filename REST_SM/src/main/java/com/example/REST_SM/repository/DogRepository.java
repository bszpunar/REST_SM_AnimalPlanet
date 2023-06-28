package com.example.REST_SM.repository;

import com.example.REST_SM.model.Dog;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;


@Repository
public interface DogRepository extends JpaRepository<Dog, Integer> {
    @Query(value = "SELECT * FROM dog",nativeQuery = true)
    List<Dog> getAll();

    @Query(value = "SELECT * FROM dog WHERE id=?", nativeQuery = true)
    Dog getOne(int id);

}
