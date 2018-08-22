package com.rock;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

public interface GirlRepository  extends JpaRepository<Girl, Integer>{

	
	//t通过年龄来查询
	public List<Girl> findByAge(Integer age);
}
