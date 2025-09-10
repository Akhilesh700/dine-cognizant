package com.Learnings.dine_cognizant;

import com.Learnings.dine_cognizant.service.MenuService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class DineCognizantApplicationTests {
	@Autowired
	MenuService service = new MenuService();

	@Test
	void contextLoads() {
	}

//	@Test
//	public void viewAllMenu(){
//		service.getAllMenu();
//	}

}
