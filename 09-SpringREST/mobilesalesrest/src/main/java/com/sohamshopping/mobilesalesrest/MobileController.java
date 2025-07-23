package com.sohamshopping.mobilesalesrest;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.sohamshopping.mobilesalesrest.models.MobileSales;
import com.sohamshopping.mobilesalesrest.services.MobileServices;

@RestController
public class MobileController {
	
	@Autowired
	private MobileServices mobServices;
	
	
	@GetMapping("/test")
	public String getMessage()
	{
		return "spring boot mongodb working together";
	}
	
	
	@GetMapping("/all")
	public List<MobileSales> showAllMobiles()
	{
		return mobServices.getAllMobiles();
	}
	
	@GetMapping("/search/brand/{brand}")
	public List<MobileSales> getByBrand(@PathVariable("brand") String brand)
	{
		return mobServices.searchBrand(brand);
	}
	
	@PostMapping("/add")
	public MobileSales addNewSale(@RequestBody MobileSales obj)
	{
		return mobServices.storeNewSale(obj);
	}

}
