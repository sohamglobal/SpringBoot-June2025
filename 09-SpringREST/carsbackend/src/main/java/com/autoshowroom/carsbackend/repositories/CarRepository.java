package com.autoshowroom.carsbackend.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.autoshowroom.carsbackend.entities.Car;

@Repository
public interface CarRepository extends JpaRepository<Car, String> {

	List<Car> findByCompany(String company);
}
