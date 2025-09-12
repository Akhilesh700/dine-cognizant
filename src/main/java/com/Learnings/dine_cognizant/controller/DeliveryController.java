package com.Learnings.dine_cognizant.controller;

import com.Learnings.dine_cognizant.model.DeliveryAgent;
import com.Learnings.dine_cognizant.model.Order;
import com.Learnings.dine_cognizant.model.DTO.UnassignedOrderDTO;
import com.Learnings.dine_cognizant.service.DeliveryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

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

    @GetMapping("/order/{id}")
    public ResponseEntity<Order> findOrderById(@PathVariable("id") Integer id) {
        return deliveryService.findOrderById(id);
    }





    @PostMapping("/assign-order/{orderId}")
    public ResponseEntity<Boolean> assignOrder(Integer id) {
        return deliveryService.assignOrder(id);
    }



}
