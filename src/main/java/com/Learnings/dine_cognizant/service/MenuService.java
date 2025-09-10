package com.Learnings.dine_cognizant.service;

import com.Learnings.dine_cognizant.model.MenuItems;
import com.Learnings.dine_cognizant.repository.MenuRepository;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MenuService {
    @Autowired
    private MenuRepository repo;

    @Transactional
    public List<MenuItems> getAllMenu(){
        List<MenuItems> menuItems = repo.findAll();
        return menuItems;
    }
}
