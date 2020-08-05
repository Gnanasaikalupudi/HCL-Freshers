package com.freshers.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.freshers.model.Data;

public interface DataRepo extends JpaRepository<Data, Integer> {

	Optional<Data> findBySBU(String sbu);
}


