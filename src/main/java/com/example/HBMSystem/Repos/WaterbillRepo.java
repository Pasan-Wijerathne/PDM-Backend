package com.example.HBMSystem.Repos;

import com.example.HBMSystem.Modulars.WaterEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface WaterbillRepo extends JpaRepository<WaterEntity,Integer> {
}
