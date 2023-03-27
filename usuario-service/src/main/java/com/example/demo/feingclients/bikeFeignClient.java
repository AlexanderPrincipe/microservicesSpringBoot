package com.example.demo.feingclients;

import java.util.List;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

import com.example.demo.model.Bike;
import com.example.demo.model.Car;

@FeignClient(name = "bike-service", url = "http://localhost:8003")
public interface bikeFeignClient {
	@PostMapping("/bike")
	Bike saveFeign(@RequestBody Bike bike);
	
	@GetMapping("/bike/byUserId/{userId}")
	List<Bike> getBikes(@PathVariable("userId") int userId);
}
 