package com.rock.controller;

import java.util.List;
import java.util.Optional;

import javax.validation.Valid;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.rock.domain.Girl;
import com.rock.domain.Result;
import com.rock.repository.GirlRepository;
import com.rock.service.GirlService;
import com.rock.util.ResultUtil;

@RestController
public class girlontroller {
	private final static Logger logger = LoggerFactory.getLogger(girlontroller.class);

	@Autowired
	private GirlRepository girlRepository;
	@Autowired
	private 	GirlService girlService;
	/**
	 * 查询所有女生列表
	 * @return
	 */
	@GetMapping(value="/girls")
	public List<Girl> girlList(){
		logger.info("girlList 方法");
		return girlRepository.findAll();
	}
	@PostMapping(value = "/girls")
	public Result<Girl> grilAdd(@Valid Girl girl,BindingResult bindingResult) {
		if(bindingResult.hasErrors()) {
			return ResultUtil.error(1, bindingResult.getFieldError().getDefaultMessage());
		}
		girl.setCupSize(girl.getCupSize());
		girl.setAge(girl.getAge());
		return ResultUtil.success(girlRepository.save(girl));
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
	
	//通过年龄查询女生列表
	@GetMapping(value = "/girls/age/{age}")
	public List<Girl> girlListByAge(@PathVariable("age") Integer age){
		
		return  girlRepository.findByAge(age);
		
	}
	
	@PostMapping(value="/girls/two")
	public  void grilTwo() {
		girlService.insertTwo();
	}
	
	
	@PostMapping(value="/girls/getAge/{id}")
	public void getAge(@PathVariable("id") Integer id) {
//		girlService.getAge(id);
	}
	
	
}
