package com.sohamshopping.mobilesalesrest.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sohamshopping.mobilesalesrest.models.MobileSales;
import com.sohamshopping.mobilesalesrest.repositories.MobileRepository;

@Service
public class MobileServices {
	
	@Autowired
	private MobileRepository mobRepo;
	
	public List<MobileSales> getAllMobiles()
	{
		return mobRepo.findAll();
	}
	
	public List<MobileSales> searchBrand(String brand)
	{
		return mobRepo.findByBrand(brand);
	}
	
	public MobileSales storeNewSale(MobileSales obj)
	{
		return mobRepo.save(obj);
	}

}
