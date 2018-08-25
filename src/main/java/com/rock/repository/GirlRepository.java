package com.rock.repository;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.rock.domain.Girl;

public interface GirlRepository  extends JpaRepository<Girl, Integer>{

	
	//t通过年龄来查询
	public List<Girl> findByAge(Integer age);

//	public Girl findOne(Integer id);
	
//	public Optional<Girl> findById(Integer id);
}
