package com.cafe.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.cafe.entity.Cafe;

public interface CafeRepository extends JpaRepository<Cafe, Long> {

	List<Cafe> findByLocation(String location);
}
