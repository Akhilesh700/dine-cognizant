package com.Learnings.dine_cognizant.model;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.math.BigDecimal;

@Getter
@Setter
@Entity
@Table(name = "Menu")
public class Menu {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ItemID")
    private Integer itemId;

    @Column(name = "Name", length = 100)
    private String name;

    @Column(name = "Description", columnDefinition = "TEXT")
    private String description;

    @Column(name = "Price", precision = 10, scale = 2)
    private BigDecimal price;

    @Column(name = "PrepTime")
    private Integer prepTime; // Preparation time in minutes

    // --- Relationships ---

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "RestID", nullable = false)
    private Restaurant restaurant;

    // Getters and Setters are now handled by Lombok
}
