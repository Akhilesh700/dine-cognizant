package com.Learnings.dine_cognizant.service;


import com.Learnings.dine_cognizant.model.DeliveryAgent;
import com.Learnings.dine_cognizant.model.Order;
import com.Learnings.dine_cognizant.model.UnassignedOrderDTO;
import com.Learnings.dine_cognizant.repository.DeliveryAgentDao;
import com.Learnings.dine_cognizant.repository.DeliveryDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class DeliveryService {

    @Autowired
    DeliveryDao deliveryDao;

    @Autowired
    DeliveryAgentDao deliveryAgentDao;

    public ResponseEntity<List<UnassignedOrderDTO>> getUnassignedOrders(Integer id) {
        List<UnassignedOrderDTO> unassignedOrderDTOS = deliveryDao.findUnassignedOrders(id);
        return new ResponseEntity<>(unassignedOrderDTOS, HttpStatus.OK);
    }

//    public ResponseEntity<List<DeliveryAgent>> getAllAvailableDeliveryAgent() {
//
//    }



}
