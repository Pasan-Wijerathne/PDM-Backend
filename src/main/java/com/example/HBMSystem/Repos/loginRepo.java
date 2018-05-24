//package com.example.HBMSystem.Repos;
//
//import com.example.HBMSystem.Modulars.loginEntity;
//import com.example.HBMSystem.Modulars.loginEntity;
//import org.springframework.data.jpa.repository.JpaRepository;
//import org.springframework.data.jpa.repository.Query;
//import org.springframework.data.repository.query.Param;
//
//public interface loginRepo extends JpaRepository<loginEntity,Integer> {
//
//    @Query("from loginEntity where userid=:userid")
//    public loginEntity find(@Param("userid") Integer userid);
//
//}
