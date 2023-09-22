package com.dotin.designpatterns.creational.factory.Coins;

import com.dotin.designpatterns.creational.factory.Coin;

public class SilverCoin implements Coin {

    static final String description = "THIS IS A SILVER COIN !!";
    @Override
    public String getDescription() {
        return description;
    }
}
