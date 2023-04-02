package com.company.oops.coupling.solution;

class ShoppingCartEntry {
    float dummyPrice;
    int quantity;

    public float getTotalPrice() {
        return dummyPrice * quantity;
    }
}

class CartContents {
    ShoppingCartEntry[] items;

    public float getTotalPrice() {
        float totalPrice = 0;
        for (ShoppingCartEntry item : items) {
            totalPrice += item.getTotalPrice();
        }
        return totalPrice;
    }
}

class Order {
    private CartContents cart;
    private float salesTax;

    public Order(CartContents cart, float salesTax) {
        this.cart = cart;
        this.salesTax = salesTax;
    }

    public float totalPrice() {
        return cart.getTotalPrice() * (1.0f + salesTax);
    }
}

public class CouplingExamplesSolution {

}