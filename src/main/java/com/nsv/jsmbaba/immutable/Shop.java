package com.nsv.jsmbaba.immutable;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
public class Shop {
    private String store;
    private String storeLocation;
    Shop(){}
    public Shop(String store, String storeLocation) {
        this.store = store;
        this.storeLocation = storeLocation;
    }

}
