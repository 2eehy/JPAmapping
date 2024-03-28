package org.example.jpamapping;

public class OrderDTO {

    private int orderNo;
    private String hamburger;
    private String side;
    private String drink;

    public OrderDTO() {
    }

    public OrderDTO(String hamburger, String side, String drink) {

        this.hamburger = hamburger;
        this.side = side;
        this.drink = drink;
    }

    public int getOrderNo() {
        return orderNo;
    }

    public void setOrderNo(int orderNo) {
        this.orderNo = orderNo;
    }

    public String getHamburger() {
        return hamburger;
    }

    public void setHamburger(String hamburger) {
        this.hamburger = hamburger;
    }

    public String getSide() {
        return side;
    }

    public void setSide(String side) {
        this.side = side;
    }

    public String getDrink() {
        return drink;
    }

    public void setDrink(String drink) {
        this.drink = drink;
    }

    @Override
    public String toString() {
        return "OrderDTO{" +
                "orderNo=" + orderNo +
                ", hamburger='" + hamburger + '\'' +
                ", side='" + side + '\'' +
                ", drink='" + drink + '\'' +
                '}';
    }
}
