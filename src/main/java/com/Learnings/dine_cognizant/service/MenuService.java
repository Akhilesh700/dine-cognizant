package com.Learnings.dine_cognizant.service;

import com.Learnings.dine_cognizant.model.MenuItems;
import com.Learnings.dine_cognizant.model.Restaurant;
import com.Learnings.dine_cognizant.repository.MenuRepository;
import com.Learnings.dine_cognizant.repository.RestaurantRepository;
import jakarta.transaction.Transactional;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;

import java.util.List;
import java.util.Optional;

@Service
@AllArgsConstructor
@Transactional
public class MenuService {

    private final MenuRepository menuRepository;
    private final RestaurantRepository restaurantRepository;


    public List<MenuItems> getAllMenu(){
        return menuRepository.findAll();
    }

    public List<MenuItems> getAllMenuByRestaurantID(int restId) throws Exception{
        List<MenuItems> menuItemsList = null;
        try{
            menuItemsList = menuRepository.findByRestaurant_RestId(restId);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
        return menuItemsList;
    }

    public MenuItems addMenuItem(int restID, MenuItems item) throws Exception {
        MenuItems menuitem = null;
        try{
            Restaurant restaurant = restaurantRepository.findById(restID)
                    .orElseThrow(() -> new ResponseStatusException(HttpStatus.NOT_FOUND, "Restaurant not found with id: " + restID));
            item.setRestaurant(restaurant);
            menuitem = menuRepository.save(item);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
        return menuitem;
    }


}
