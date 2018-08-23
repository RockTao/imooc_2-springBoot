package com.rock.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.rock.domain.Girl;

public interface GirlRepository  extends JpaRepository<Girl, Integer>{

	
	//t通过年龄来查询
	public List<Girl> findByAge(Integer age);
}
