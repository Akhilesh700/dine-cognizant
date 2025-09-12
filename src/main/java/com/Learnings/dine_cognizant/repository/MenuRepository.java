package com.Learnings.dine_cognizant.repository;

import com.Learnings.dine_cognizant.model.MenuItems;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface MenuRepository extends JpaRepository<MenuItems, Long> {
    List<MenuItems> findByRestaurant_RestId(int restId);
}
