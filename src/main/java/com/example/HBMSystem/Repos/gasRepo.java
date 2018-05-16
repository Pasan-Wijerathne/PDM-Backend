package com.example.HBMSystem.Repos;


import com.example.HBMSystem.Modulars.gasMod;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface gasRepo extends JpaRepository<gasMod,Integer> {
}
