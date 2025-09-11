package com.Learnings.dine_cognizant.repository;

import com.Learnings.dine_cognizant.model.MenuItems;
import com.Learnings.dine_cognizant.model.Restaurant;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface RestaurantRepository extends JpaRepository<Restaurant, Integer> {

}
