package com.Learnings.dine_cognizant.model;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.math.BigDecimal;
import java.time.LocalTime;
import java.util.Set;

@Getter
@Setter
@Entity
@Table(name = "Restaurant")
public class Restaurant {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "RestID")
    private Integer restId;

    @Column(name = "Name", length = 100)
    private String name;

    @Column(name="imgUrl", length = 500)
    private String imgUrl;

    @Column(name = "Address", columnDefinition = "TEXT")
    private String address;

    @Column(name = "Phone", length = 15)
    private String phone;

    @Column(name = "Rating", precision = 2, scale = 1)
    private BigDecimal rating;

    @Column(name = "CuisineType", length = 50)
    private String cuisineType;

    @Column(name = "OpenTime")
    private LocalTime openTime;

    @Column(name = "CloseTime")
    private LocalTime closeTime;

    // --- Relationships ---

    @OneToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "UserID", referencedColumnName = "UserID", unique = true)
    private User user;

    @OneToMany(mappedBy = "restaurant", cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    private Set<MenuItems> menuItems;

    @OneToMany(mappedBy = "restaurant", cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    private Set<Order> orders;

    // Getters and Setters are now handled by Lombok
}