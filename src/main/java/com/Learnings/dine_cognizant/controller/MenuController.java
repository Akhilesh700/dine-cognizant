package com.Learnings.dine_cognizant.controller;

import com.Learnings.dine_cognizant.model.MenuItems;
import com.Learnings.dine_cognizant.service.MenuService;
import lombok.Getter;
import lombok.Setter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.awt.*;
import java.util.List;
import java.util.Locale;

@Controller
@Getter
@Setter
@RestController
public class MenuController {
    @Autowired
    MenuService service = new MenuService();

    @GetMapping("/menu")
    public List<MenuItems> getAllMenu(){
        List<MenuItems> menuItems = service.getAllMenu();
        return menuItems;
    }
//    @GetMapping("/add-menuitem")
//    public List<MenuItems> addMenuItem(Long restId, Menu menu){
//        List<MenuItems> menuItems = service.addMenuItem();
//        return menuItems;
//    }

}
