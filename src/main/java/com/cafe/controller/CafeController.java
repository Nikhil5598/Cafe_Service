package com.cafe.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cafe.entity.Cafe;
import com.cafe.service.CafeService;

@RestController
@RequestMapping("/cafe")
public class CafeController {
	
	@Autowired
	CafeService cafeService;
	
	@PostMapping()
	public ResponseEntity<Cafe> save(@RequestBody Cafe cafe){
		return  ResponseEntity.status(HttpStatus.CREATED).body(cafeService.create(cafe));
		
	}
	
	@GetMapping()
	public ResponseEntity<List<Cafe>> getAllCafe(){
		return ResponseEntity.ok(cafeService.getAllCafe());
	}
	
	@GetMapping("/{cafeId}")
	public ResponseEntity<Cafe> getCafeById(@PathVariable Long cafeId){
		return  ResponseEntity.status(HttpStatus.OK).body(cafeService.getByCafeId(cafeId));
	}

	@GetMapping("/location/{location}")
	public ResponseEntity<List<Cafe>> getByLoc(@PathVariable String location){
		return  ResponseEntity.status(HttpStatus.OK).body(cafeService.getByLocation(location));
	}
}
