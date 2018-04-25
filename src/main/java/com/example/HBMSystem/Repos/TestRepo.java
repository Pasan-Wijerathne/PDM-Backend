package com.example.HBMSystem.Repos;

import com.example.HBMSystem.Modulars.TestEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TestRepo extends JpaRepository<TestEntity, Integer> {
}
