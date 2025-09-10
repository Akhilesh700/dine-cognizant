package com.Learnings.dine_cognizant.controller;

import com.Learnings.dine_cognizant.model.DeliveryAgent;
import com.Learnings.dine_cognizant.model.UnassignedOrderDTO;
import com.Learnings.dine_cognizant.service.DeliveryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("${api.version.path}/deliveries")
public class DeliveryController {

    @Autowired
    DeliveryService deliveryService;

    //For the manager's dashboard to display orders ready for delivery.
    @GetMapping("/unassigned")
    public ResponseEntity<List<UnassignedOrderDTO>> getUnassignedOrders(@RequestHeader("restId") Integer restId) {
        return deliveryService.getUnassignedOrders(restId);
    }


    @GetMapping("/getAvailableAgents")
    public ResponseEntity<List<DeliveryAgent>> getAvailableDeliveryAgent() {
        return deliveryService.getAllAvailableDeliveryAgent();
    }

}
