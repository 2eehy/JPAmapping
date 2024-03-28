package org.example.jpamapping;

import jakarta.persistence.Column;
import jakarta.persistence.Embeddable;
import jakarta.persistence.Embedded;

@Embeddable
public class Burger {

    @Column(name="burger")
    private String burger;

    protected Burger(){}

    public Burger(String burger) {
        this.burger = burger;
    }

    public String getBurger() {
        return burger;
    }

    @Override
    public String toString() {
        return "Burger{" +
                "burger='" + burger + '\'' +
                '}';
    }
}
