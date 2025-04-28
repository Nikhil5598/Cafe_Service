package com.cafe.serviceimpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cafe.entity.Cafe;
import com.cafe.exceptions.ResourceNotFoundException;
import com.cafe.repository.CafeRepository;
import com.cafe.service.CafeService;

@Service
public class CafeServiceImpl implements CafeService {
	
	@Autowired
	CafeRepository cafeRepository;
	

	@Override
	public Cafe create(Cafe cafe) {
		return cafeRepository.save(cafe);
	}

	@Override
	public List<Cafe> getAllCafe() {

		return cafeRepository.findAll();
	}

	@Override
	public Cafe getByCafeId(Long cafeId) {
		return cafeRepository.findById(cafeId).orElseThrow(() -> new ResourceNotFoundException("Cafe with given id is not found"+ cafeId));
	}
	
	@Override
	public List<Cafe> getByLocation(String location) {
		return cafeRepository.findByLocation(location);
	}
	

}
