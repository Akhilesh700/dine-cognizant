package com.Learnings.dine_cognizant.model;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDateTime;

@Getter
@Setter
@Entity
@Table(name = "Delivery")
public class Delivery {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "DeliveryID")
    private Integer deliveryId;

    @Column(name = "PickupTime")
    private LocalDateTime pickupTime;

    @Column(name = "DeliveryTime")
    private LocalDateTime deliveryTime;

    @Column(name = "ETA")
    private LocalDateTime eta;

    @Column(name = "TrackingLink", length = 255)
    private String trackingLink;

    // --- Relationships ---

    @OneToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "OrderID", nullable = false)
    private Order order;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "AgentID")
    private DeliveryAgent deliveryAgent;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "StatusID")
    private Status status;

    // Getters and Setters are now handled by Lombok
}