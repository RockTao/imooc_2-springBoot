package com.rock.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.rock.domain.Girl;
import com.rock.enums.ResultEnum;
import com.rock.exception.GirlException;
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
	
	
//	public void getAge( Integer id) {
////		Girl girl = girlRepository.findOne(id);
//        Integer age = girl.getAge();
//        if (age < 10) {
//            //返回"你还在上小学吧" code=100
//            throw new GirlException(ResultEnum.PRIMARY_SCHOOL);
//        }else if (age > 10 && age < 16) {
//            //返回"你可能在上初中" code=101
//            throw new GirlException(ResultEnum.MIDDLE_SCHOOL);
//        }
//	}
	
	/**
	 * 通过ID进行查询
	 * @param id
	 * @return
	 */
//	public Girl findOne(Integer id) {
//		return girlRepository.findOne(id);
//	}
//	
}
