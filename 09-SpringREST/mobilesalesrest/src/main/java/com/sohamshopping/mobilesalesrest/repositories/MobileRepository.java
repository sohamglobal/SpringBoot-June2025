package com.sohamshopping.mobilesalesrest.repositories;

import java.util.List;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.sohamshopping.mobilesalesrest.models.MobileSales;

@Repository
public interface MobileRepository extends MongoRepository<MobileSales, String> {
	
	List<MobileSales> findByBrand(String brand);

}
