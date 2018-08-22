package com.rock;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class girlontroller {
	
	@Autowired
	private GirlRepository girlRepository;
	/**
	 * 查询所有女生列表
	 * @return
	 */
	@GetMapping(value="/girls")
	public List<Girl> girlList(){
		return girlRepository.findAll();
	}
	@PostMapping(value = "/girls")
	public Girl grilAdd(@RequestParam("cupSize") String cupSize,
						@RequestParam("age") Integer  age) {
		Girl girl=new Girl();
		girl.setCupSize(cupSize);
		girl.setAge(age);
		return girlRepository.save(girl);
	}
	//查询
	@GetMapping(value="/girls/{id}")
	public Object girlFindOne(@PathVariable("id") Integer id) {
		
		return girlRepository.findById(id);
	}
	
	//跟新
	@PutMapping(value="/girls/{id}")
	public Girl girlUpdate(@PathVariable("id") Integer id,@RequestParam("cupSize") String cupSize,
			@RequestParam("age") Integer  age) {
		Girl girl=new Girl();
		girl.setId(id);
		girl.setAge(age);
		girl.setCupSize(cupSize);
		return girlRepository.save(girl);
		
		
	}
	
	//删除
	@DeleteMapping(value="/girls/{id}")
	public void girlDelete(@PathVariable("id") Integer id) {
		girlRepository.deleteById(id);
	}
}
