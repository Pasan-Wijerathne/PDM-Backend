package com.example.HBMSystem.Repos;


import com.example.HBMSystem.Modulars.vehicle;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface vehicleform extends JpaRepository< vehicle,Integer>{
}
