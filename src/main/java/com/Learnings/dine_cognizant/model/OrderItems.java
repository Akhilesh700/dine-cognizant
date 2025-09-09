package com.Learnings.dine_cognizant.model;

import jakarta.persistence.*;
import lombok.*;

import java.io.Serializable;
import java.math.BigDecimal;

// --- Composite Key Class ---
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode
@Embeddable
class OrderItemsId implements Serializable {
    @Column(name = "OrderID")
    private Integer orderId;

    @Column(name = "ItemID")
    private Integer itemId;
}

// --- Main Entity Class ---
@Getter
@Setter
@Entity
@Table(name = "OrderItems")
public class OrderItems {

    @EmbeddedId
    private OrderItemsId id;

    @Column(name = "Quantity")
    private Integer quantity;

    @Column(name = "Price", precision = 10, scale = 2)
    private BigDecimal price; // Price at the time of order

    // --- Relationships ---

    @ManyToOne(fetch = FetchType.LAZY)
    @MapsId("orderId") // This maps the 'orderId' part of the embedded ID
    @JoinColumn(name = "OrderID")
    private Order order;

    @ManyToOne(fetch = FetchType.LAZY)
    @MapsId("itemId") // This maps the 'itemId' part of the embedded ID
    @JoinColumn(name = "ItemID")
    private Menu menu;

    // Getters and Setters are now handled by Lombok
}