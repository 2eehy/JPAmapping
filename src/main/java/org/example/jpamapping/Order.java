package org.example.jpamapping;


import jakarta.persistence.*;

@Entity
@Table(name="burgerking_order")
public class Order {

    @Id
    @Column(name="order_no")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int orderNo;

    @Embedded
    private Burger burger;

    @Embedded
    private Set set;

    protected Order(){}

    public Order(Burger burger, Set set) {

        this.burger = burger;
        this.set = set;

    }



}
