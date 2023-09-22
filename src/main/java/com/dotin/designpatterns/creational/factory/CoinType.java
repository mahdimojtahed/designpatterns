package com.dotin.designpatterns.creational.factory;

import com.dotin.designpatterns.creational.factory.Coins.GoldCoin;
import com.dotin.designpatterns.creational.factory.Coins.SilverCoin;

import java.util.function.Supplier;

public enum CoinType {

    // () -> new GoldCoin();
    GOLD(GoldCoin::new),
    SILVER(SilverCoin::new);

    private final Supplier<Coin> coinSupplier;

    CoinType(Supplier<Coin> coinSupplier) {
        this.coinSupplier = coinSupplier;
    }

    public Supplier<Coin> getCoinSupplier() {
        return coinSupplier;
    }
}
