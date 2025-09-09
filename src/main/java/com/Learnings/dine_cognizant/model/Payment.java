package com.Learnings.dine_cognizant.model;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.math.BigDecimal;
import java.time.LocalDateTime;

@Getter
@Setter
@Entity
@Table(name = "Payment")
public class Payment {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "PaymentID")
    private Integer paymentId;

    @Column(name = "Method", length = 50)
    private String method;

    @Column(name = "Amount", precision = 10, scale = 2)
    private BigDecimal amount;

    @Column(name = "TransactionID", length = 100)
    private String transactionId;

    @Column(name = "Timestamp")
    private LocalDateTime timestamp;

    // --- Relationships ---

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "OrderID", nullable = false)
    private Order order;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "StatusID")
    private Status status;

    // Getters and Setters are now handled by Lombok
}
