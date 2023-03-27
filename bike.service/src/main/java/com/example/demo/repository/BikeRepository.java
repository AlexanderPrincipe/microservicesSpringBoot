package com.example.demo.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.example.demo.entity.Bike;

@Repository
public interface BikeRepository extends JpaRepository<Bike, Integer>{
	
	
	@Query("SELECT u from Bike u where u.userId = ?1")
	List<Bike> byBikeId(int userId);

}
