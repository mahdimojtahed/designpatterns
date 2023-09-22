package com.dotin.designpatterns.creational.factory.Coins;

import com.dotin.designpatterns.creational.factory.Coin;

public class GoldCoin implements Coin {

    static final String description = "THIS IS A GOLD COIN !!!";
    @Override
    public String getDescription() {
        return description;
    }
}
