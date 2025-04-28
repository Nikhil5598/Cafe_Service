package com.cafe.service;

import java.util.List;

import com.cafe.entity.Cafe;

public interface CafeService {
	
	Cafe create(Cafe cafe);
	
	List<Cafe> getAllCafe();
	
	Cafe getByCafeId(Long cafeId);

	List<Cafe> getByLocation(String location);

}
