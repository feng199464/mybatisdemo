package com.mybatisdemo;

import com.mybatisdemo.service.IMybatisDemoService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;
import java.util.Map;

@SpringBootTest
class MybatisdemoApplicationTests {

	@Test
	void contextLoads() {
	}


	@Autowired
	private IMybatisDemoService mybatisDemoService;

	@Test
	public void mybatisDemo(){
		List<Map<String, Object>> maps = mybatisDemoService.selectList();
		System.out.println(maps.toString());
	}

}
