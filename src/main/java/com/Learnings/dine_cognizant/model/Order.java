package com.Learnings.dine_cognizant.model;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.Set;

@Getter
@Setter
@Entity
// "Order" is a reserved keyword in SQL, so we must quote it.
@Table(name = "`Order`")
public class Order {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "OrderID")
    private Integer orderId;

    @Column(name = "SpecialReq", columnDefinition = "TEXT")
    private String specialReq;

    @Column(name = "OrderTime")
    private LocalDateTime orderTime;

    @Column(name = "TotalAmount", precision = 10, scale = 2)
    private BigDecimal totalAmount;

    // --- Relationships ---

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "CustID", nullable = false)
    private Customer customer;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "RestID", nullable = false)
    private Restaurant restaurant;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "StatusID")
    private Status status;

    @OneToMany(mappedBy = "order", cascade = CascadeType.ALL, orphanRemoval = true)
    private Set<OrderItems> orderItems;

    @OneToOne(mappedBy = "order", cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    private Delivery delivery;

    @OneToMany(mappedBy = "order", cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    private Set<Payment> payments;

    // Getters and Setters are now handled by Lombok
}

