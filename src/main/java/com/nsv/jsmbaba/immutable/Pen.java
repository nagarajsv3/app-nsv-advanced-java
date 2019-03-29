package com.nsv.jsmbaba.immutable;

import lombok.Getter;
import lombok.ToString;


@ToString
public final class Pen {
    private String name;
    private String color;
    private Shop shop;

    public Pen() {
    }

    public Pen(String name, String color, Shop shop) {
        this.name = name;
        this.color = color;
        this.shop = new Shop(shop.getStore(),shop.getStoreLocation()); //Immutable
        //this.shop = shop; //if shop change, Pen changes Breaks Mutability
    }

    public String getName() {
        return name;
    }

    public String getColor() {
        return color;
    }

    public Shop getShop() {
        return new Shop(shop.getStore(),shop.getStoreLocation());
    }
}
