package com.deymerpizzeria.persistence.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name = "pizza")
@Getter
@Setter
@NoArgsConstructor
public class PizzaEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_pizza", nullable = false)
    private Integer idPizza;

    @Column(nullable = false, length = 30, unique = true)
    private String name;

    @Column(nullable = false, length = 150)
    private String description;

    @Column(nullable = true, columnDefinition = "Decimal(5,2)")
    private Double price;
    @Column(columnDefinition = "smallint") // para mysql es "tinyint"
    private Boolean vegetarian;

    @Column(columnDefinition = "smallint") // para mysql es "tinyint"
    private Boolean vegan;

    @Column(columnDefinition = "smallint", nullable = false) // para mysql es "tinyint"
    private Boolean available;
}
