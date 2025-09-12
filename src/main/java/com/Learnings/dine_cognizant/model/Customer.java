package com.Learnings.dine_cognizant.model;

import com.fasterxml.jackson.annotation.JsonManagedReference;
import jakarta.persistence.*;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;
import java.time.LocalDate;
import java.util.Set;

@Data
@Getter
@Setter
@Entity
@Table(name = "Customer")
public class Customer {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "CustID")
    private Integer custId;

    @Column(name = "Name", length = 100)
    private String name;

    @Column(name = "Phone", length = 15)
    private String phone;

    @Column(name = "Address", columnDefinition = "TEXT")
    private String address;

    @Column(name = "DOB")
    private LocalDate dob;

    @Column(name = "PreferredPayment", length = 50)
    private String preferredPayment;

    // --- Relationships ---

    @OneToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "UserID", referencedColumnName = "UserID", unique = true)
    private User user;

    @OneToMany(mappedBy = "customer", cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    @JsonManagedReference // This annotation marks the parent side of the relationship
    private Set<Order> orders;

    // Getters and Setters are handled by Lombok
}