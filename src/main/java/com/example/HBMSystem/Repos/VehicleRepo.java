package com.example.HBMSystem.Repos;


import com.example.HBMSystem.Modulars.vehicleMod;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface VehicleRepo extends JpaRepository<vehicleMod,Integer>{
}
