package com.rock;

import org.assertj.core.api.Assert;
import org.hibernate.validator.constraints.br.TituloEleitoral;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import com.rock.domain.Girl;
import com.rock.service.GirlService;

@RunWith(SpringRunner.class)
@SpringBootTest
public class GirlServiceTest {
	@Autowired
	private GirlService girlService;
	
	
	@Test
	public void findOneTest() {
//		Girl girl = girlService.findOne(23);
//		org.junit.Assert.assertEquals(new Integer(13), girl.getAge());
	}

}
