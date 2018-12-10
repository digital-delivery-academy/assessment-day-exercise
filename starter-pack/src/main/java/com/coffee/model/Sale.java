package com.coffee.model;

public class Sale {
    Item item;
    String roast;
    int quantity;

    public Sale(Item item, String roast, int quantity, String extra) {
        this.item = item;
        this.roast = roast;
        this.quantity = quantity;
        this.extra = extra;
    }

    String extra;

    public Item getItem() {
        return item;
    }

    public void setItem(Item item) {
        this.item = item;
    }

    public String getRoast() {
        return roast;
    }

    public void setRoast(String roast) {
        this.roast = roast;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public String getExtra() {
        return extra;
    }

    public void setExtra(String extra) {
        this.extra = extra;
    }
}
