package com.example.HBMSystem.Repos;

import com.example.HBMSystem.Modulars.medicineMod;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface medicineRepo extends JpaRepository<medicineMod,Integer> {
}
