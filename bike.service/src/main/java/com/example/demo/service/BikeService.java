package com.example.demo.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.entity.Bike;
import com.example.demo.repository.BikeRepository;

@Service
public class BikeService {
	
	@Autowired
	BikeRepository bikeRepository;
	
	public List<Bike> getAll() {
		return bikeRepository.findAll();
	}
	
	public Bike getBikeById(int id) {
		return bikeRepository.findById(id).orElse(null);
	}
	
	public Bike registrar(Bike bike) {
		Bike bikeNew = bikeRepository.save(bike);
		return bikeRepository.save(bikeNew);
	}
	
	public List<Bike> byUserId(int userId) {
		List<Bike> listBike = bikeRepository.byBikeId(userId);
		return listBike;
	}
}
