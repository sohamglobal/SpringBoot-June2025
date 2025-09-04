package com.sohamshopping.mobilesalesrest;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.sohamshopping.mobilesalesrest.models.Friend;
import com.sohamshopping.mobilesalesrest.models.MobileSales;
import com.sohamshopping.mobilesalesrest.repositories.FriendsRepository;
import com.sohamshopping.mobilesalesrest.services.MobileServices;

@RestController
public class MobileController {
	
	@Autowired
	private MobileServices mobServices;
	
	@Autowired
	private FriendsRepository friendsRepo;
	
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
	
	//----------Friends data
	
	@GetMapping("/allfriends")
	public List<Friend> getAllFriends()
	{
		return friendsRepo.findAll();
	}
	
	@PutMapping("/change/{id}")
	public String updateFriend(@PathVariable int id,@RequestBody Friend obj)
	{
		String status="";
		
		Optional<Friend> friend=friendsRepo.findById(id);
		
		if(friend.isPresent()) {
			Friend existingFriend=friend.get();
			existingFriend.setEmail(obj.getEmail());
			existingFriend.setDob(obj.getDob());
			friendsRepo.save(existingFriend);
			status="successful";
			
		}
		else
			status="failed";
		return status;
	}

	@DeleteMapping("/delete/{id}")
	public String deleteFriend(@PathVariable int id)
	{
		String status="";
		
		Optional<Friend> friend=friendsRepo.findById(id);
		
		if(friend.isPresent()) {
			Friend existingFriend=friend.get();
			
			friendsRepo.delete(existingFriend);
			status="successful";
			
		}
		else
			status="failed";
		return status;
	}

	@PostMapping("/addfriend")
	public Friend addNewFriend(@RequestBody Friend obj)
	{
		return friendsRepo.save(obj);
	}
}
