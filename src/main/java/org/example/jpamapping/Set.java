package org.example.jpamapping;

import jakarta.persistence.Column;
import jakarta.persistence.Embeddable;

@Embeddable
public class Set {

    @Column(name="side")
    private String side;
    @Column(name="drink")
    private String drink;

    protected Set(){}

    public String getSide() {
        return side;
    }

    public String getDrink() {
        return drink;
    }

    public Set(String side, String drink) {
        this.side = side;
        this.drink = drink;
    }

    @Override
    public String toString() {
        return "Set{" +
                "side='" + side + '\'' +
                ", drink='" + drink + '\'' +
                '}';
    }
}
