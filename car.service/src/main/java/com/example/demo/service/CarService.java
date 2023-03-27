package com.example.demo.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import com.example.demo.entity.Car;
import com.example.demo.repository.CarRepository;

@Service
public class CarService {
	
	@Autowired
	CarRepository carRepository;
	
	public List<Car> getAll() {
		return carRepository.findAll();
	}
	
	public Car getCarById(int id) {
		return carRepository.findById(id).orElse(null);
	}
	
	public Car registrar(Car car) {
		Car carNew = carRepository.save(car);
		return carRepository.save(carNew);
	}
	
	public List<Car> byUserId(int userId) {
		List<Car> listCar = carRepository.byUserId(userId);
		return listCar;
	}
}
