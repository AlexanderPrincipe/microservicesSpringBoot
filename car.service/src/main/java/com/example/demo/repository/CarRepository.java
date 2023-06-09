package com.example.demo.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.example.demo.entity.Car;

@Repository
public interface CarRepository extends JpaRepository<Car, Integer>{
	
	
	@Query("SELECT u from Car u where u.userId = ?1")
	List<Car> byUserId(int userId);

}
