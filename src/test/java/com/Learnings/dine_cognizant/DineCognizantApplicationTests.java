package com.Learnings.dine_cognizant;

import com.Learnings.dine_cognizant.service.MenuService;
import lombok.AllArgsConstructor;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
@AllArgsConstructor
class DineCognizantApplicationTests {
	private final MenuService service;

	@Test
	void contextLoads() {
	}

//	@Test
//	public void viewAllMenu(){
//		service.getAllMenu();
//	}

}
