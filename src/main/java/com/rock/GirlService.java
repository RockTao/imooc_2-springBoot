package com.rock;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class GirlService {

	@Autowired
	private GirlRepository girlRepository;
	
	public void insertTwo() {
		Girl girlA= new Girl();
		girlA.setCupSize("BSSSSSSSSSSSSSSSSSSSSSS");
		girlA.setAge(222222222);
		girlRepository.save(girlA);
		
		Girl girlB= new Girl();
		girlB.setCupSize("Q");
		girlB.setAge(27);
		girlRepository.save(girlB);
	}
}
