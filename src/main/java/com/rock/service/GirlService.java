package com.rock.service;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.rock.domain.Girl;
import com.rock.repository.GirlRepository;

@Service
public class GirlService {

	@Autowired
	private GirlRepository girlRepository;
	
	
	@Transactional
	public void insertTwo() {
		
		Girl girlB= new Girl();
		girlB.setCupSize("Q");
		girlB.setAge(27);
		girlRepository.save(girlB);
		
		
		Girl girlA= new Girl();
		girlA.setCupSize("BSSSSSSSSSSSSSSSSSSSSSS");
		girlA.setAge(222222222);
		girlRepository.save(girlA);
		
		
	}
}
