package com.example.HBMSystem.Repos;


import com.example.HBMSystem.Modulars.gardenMod;
import org.springframework.stereotype.Repository;
import org.springframework.data.jpa.repository.JpaRepository;

@Repository
public interface gardenRepo extends JpaRepository<gardenMod,Integer> {
}
