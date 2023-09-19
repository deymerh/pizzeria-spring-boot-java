package com.deymerpizzeria.persistence.entity;
import jakarta.persistence.*;
import java.time.LocalDateTime;

@Entity
@Table(name = "pizza_order")
public class OrderEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_order", nullable = false)
    private Integer idOrder;

    @Column(name = "id_customer", nullable = false, length = 15)
    private String idCustomer;

    @Column(nullable = false, columnDefinition = "TIMESTAMP") // For MySQL: "DATETIME"
    private LocalDateTime date;

    @Column(nullable = false, columnDefinition = "DECIMAL(6,2)") // Size Not is required "(6,2)" on PostgreSQL
    private Double total;

    @Column(nullable = false, columnDefinition = "CHAR(1)") // // Size Not is required "(1)" on PostgreSQL
    private String method;

    @Column(name = "additional_notes", length = 200)
    private String additionalNotes;

    /**
    @OneToOne
    @JoinColumn(name = "id_customer", referencedColumnName = "id_customer", insertable = false, updatable = false)
    private CustomerEntity customer;

    @OneToMany(mappedBy = "order")
    private List<OrderItemEntity> items;
    */
}
