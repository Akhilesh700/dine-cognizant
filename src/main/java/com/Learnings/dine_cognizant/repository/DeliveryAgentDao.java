package com.Learnings.dine_cognizant.repository;

import com.Learnings.dine_cognizant.model.DeliveryAgent;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface DeliveryAgentDao extends JpaRepository<DeliveryAgent, Integer> {

    
    public List<DeliveryAgent> findAllAvailableDeliveryAgent();
}
