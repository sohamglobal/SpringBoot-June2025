package com.sohamglobal.injectiondemo.services;

import org.springframework.stereotype.Service;

@Service
public class CustomerServices {
	
	public float calcuateCustomerBill(float amount)
	{
		float discount,netbill;
		
		if(amount>20000)
			discount=amount*13/100;
		else
			discount=amount*9/100;
		
		netbill=amount-discount;
		
		return netbill;
		
	}

}
