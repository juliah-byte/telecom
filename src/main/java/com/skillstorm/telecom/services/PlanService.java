package com.skillstorm.telecom.services;

import java.util.Random;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.skillstorm.telecom.data.PhoneRepository;
import com.skillstorm.telecom.data.UserRepository;
import com.skillstorm.telecom.models.Users;

@Service
public class PlanService {

	@Autowired
	private UserRepository uRepository;
	
	@Autowired
	private PhoneRepository pRepository;

//	public Users getUserByUsername() {
//		System.out.println("getUserByUsername reached");
////		return repository.getUserbyUsername();
//		return null;
//	}

	public int addBasicPlan(Users u) {
		System.out.println("addBasicPlan reached");
		String planData = "35GB";
		String phoneNumber = "";
		String device = "";
		Long rate = 35L;
		Long numlines = 1L;
		System.out.println(u.getUsername());
		String username = u.getUsername();
		String[] phoneNumbers = pRepository.getPhoneNumbers();
		int min, max, first, second, third;
		
		min = 100;
		max = 999;
		first = min + (int)(Math.random() * ((max - min) + 1));
		second = min + (int)(Math.random() * ((max - min) + 1));
		min = 1000;
		max = 9999;
		third = min + (int)(Math.random() * ((max - min) + 1));		
		phoneNumber = "(" + String.valueOf(first) + ") " + String.valueOf(second) + "-" + String.valueOf(third);
		
		//check if phone numbers already exists
				for(int i = 0; i < phoneNumbers.length; i++)
				{
					//generate new number if already exists
					if(phoneNumbers[i].equals(phoneNumber))
					{
						min = 100;
						max = 999;
						first = min + (int)(Math.random() * ((max - min) + 1));
						second = min + (int)(Math.random() * ((max - min) + 1));
						min = 1000;
						max = 9999;
						third = min + (int)(Math.random() * ((max - min) + 1));		
						phoneNumber = "(" + String.valueOf(first) + ") " + String.valueOf(second) + "-" + String.valueOf(third);
						i = 0;
						//start over to check for duplicate at previous entries
					}
				}
		
		String[] devices = {"iPhone 12", "Samsung Galaxy Z Flip 3", "Nokia 8.3", "Motorola Razor V3" };
		Random random = new Random();
		int phone = random.nextInt(devices.length);
		device = devices[phone];
		
		Long id = uRepository.getIdByUser(u.getUsername());
		System.out.println(id);
		//uRepository.updateUser(numlines, rate, username);
		pRepository.addDevice(phoneNumber, device, 12);
		return 0;
	}
	
	public int addPremiumPlan(Users u) {
		System.out.println("addPremiumPlan reached");
		String planData = "45GB";
		String phoneNumber1 = "";
		String phoneNumber2 = "";
		String device1 = "";
		String device2 = "";
		Long rate = 45L;
		Long numlines = 2L;
		System.out.println(u.getUsername());
		String username = u.getUsername();
		String[] phoneNumbers = pRepository.getPhoneNumbers();
		int min, max, first, second, third;

		min = 100;
		max = 999;
		first = min + (int)(Math.random() * ((max - min) + 1));
		second = min + (int)(Math.random() * ((max - min) + 1));
		min = 1000;
		max = 9999;
		third = min + (int)(Math.random() * ((max - min) + 1));		
		phoneNumber1 = "(" + String.valueOf(first) + ") " + String.valueOf(second) + "-" + String.valueOf(third);
		
		//check if phone numbers already exists
		for(int i = 0; i < phoneNumbers.length; i++)
		{
			//generate new number if already exists
			if(phoneNumbers[i].equals(phoneNumber1))
			{
				min = 100;
				max = 999;
				first = min + (int)(Math.random() * ((max - min) + 1));
				second = min + (int)(Math.random() * ((max - min) + 1));
				min = 1000;
				max = 9999;
				third = min + (int)(Math.random() * ((max - min) + 1));		
				phoneNumber1 = "(" + String.valueOf(first) + ") " + String.valueOf(second) + "-" + String.valueOf(third);
				i = 0;
				//start over to check for duplicate at previous entries
			}
		}
		
		min = 100;
		max = 999;
		first = min + (int)(Math.random() * ((max - min) + 1));
		second = min + (int)(Math.random() * ((max - min) + 1));
		min = 1000;
		max = 9999;		
		third = min + (int)(Math.random() * ((max - min) + 1));		
		phoneNumber2 = "(" + String.valueOf(first) + ") " + String.valueOf(second) + "-" + String.valueOf(third);
		
		for(int i = 0; i < phoneNumbers.length; i++) {
			if(phoneNumbers[i].equals(phoneNumber2)) {
				min = 100;
				max = 999;
				first = min + (int)(Math.random() * ((max - min) + 1));
				second = min + (int)(Math.random() * ((max - min) + 1));
				min = 1000;
				max = 9999;
				third = min + (int)(Math.random() * ((max - min) + 1));		
				phoneNumber2 = "(" + String.valueOf(first) + ") " + String.valueOf(second) + "-" + String.valueOf(third);
				i = 0;				
			}
		}
		
		String[] devices = {"iPhone 12", "Samsung Galaxy Z Flip 3", "Nokia 8.3", "Motorola Razor V3" };
		Random random = new Random();
		int phone1 = random.nextInt(devices.length);
		int phone2 = random.nextInt(devices.length);
		device1 = devices[phone1];
		device2 = devices[phone2];
		
		Long id = uRepository.getIdByUser(u.getUsername());
		System.out.println(id);
		//uRepository.updateUser(numlines, rate, username);
		pRepository.addDevice(phoneNumber1, device1, 13);
		pRepository.addDevice(phoneNumber2, device2, 13);		
		return 0;
	}
	
	public int addDeluxePlan(Users u) {
		System.out.println("addPremiumPlan reached");
		String planData = "50GB";
		String phoneNumber1 = "";
		String phoneNumber2 = "";
		String device1 = "";
		String device2 = "";
		Long rate = 50L;
		Long numlines = 2L;
		System.out.println(u.getUsername());
		String username = u.getUsername();
		String[] phoneNumbers = pRepository.getPhoneNumbers();
		int min, max, first, second, third;
		
		min = 100;
		max = 999;
		first = min + (int)(Math.random() * ((max - min) + 1));
		second = min + (int)(Math.random() * ((max - min) + 1));
		min = 1000;
		max = 9999;
		third = min + (int)(Math.random() * ((max - min) + 1));		
		phoneNumber1 = "(" + String.valueOf(first) + ") " + String.valueOf(second) + "-" + String.valueOf(third);
		
		//check if phone numbers already exists
				for(int i = 0; i < phoneNumbers.length; i++)
				{
					//generate new number if already exists
					if(phoneNumbers[i].equals(phoneNumber1))
					{
						min = 100;
						max = 999;
						first = min + (int)(Math.random() * ((max - min) + 1));
						second = min + (int)(Math.random() * ((max - min) + 1));
						min = 1000;
						max = 9999;
						third = min + (int)(Math.random() * ((max - min) + 1));		
						phoneNumber1 = "(" + String.valueOf(first) + ") " + String.valueOf(second) + "-" + String.valueOf(third);
						i = 0;
						//start over to check for duplicate at previous entries
					}
				}
		
		min = 100;
		max = 999;
		first = min + (int)(Math.random() * ((max - min) + 1));
		second = min + (int)(Math.random() * ((max - min) + 1));
		min = 1000;
		max = 9999;
		third = min + (int)(Math.random() * ((max - min) + 1));		
		phoneNumber2 = "(" + String.valueOf(first) + ") " + String.valueOf(second) + "-" + String.valueOf(third);
		
		for(int i = 0; i < phoneNumbers.length; i++) {
			if(phoneNumbers[i].equals(phoneNumber2)) {
				min = 100;
				max = 999;
				first = min + (int)(Math.random() * ((max - min) + 1));
				second = min + (int)(Math.random() * ((max - min) + 1));
				min = 1000;
				max = 9999;
				third = min + (int)(Math.random() * ((max - min) + 1));		
				phoneNumber2 = "(" + String.valueOf(first) + ") " + String.valueOf(second) + "-" + String.valueOf(third);
				i = 0;				
			}
		}
		
		String[] devices = {"iPhone 12", "Samsung Galaxy Z Flip 3", "Nokia 8.3", "Motorola Razor V3" };
		Random random = new Random();
		int phone1 = random.nextInt(devices.length);
		int phone2 = random.nextInt(devices.length);
		device1 = devices[phone1];
		device2 = devices[phone2];
		
		Long id = uRepository.getIdByUser(u.getUsername());
		System.out.println(id);
		//uRepository.updateUser(numlines, rate, username);
		pRepository.addDevice(phoneNumber1, device1, 14);
		pRepository.addDevice(phoneNumber2, device2, 14);
		return 0;
	}

}
