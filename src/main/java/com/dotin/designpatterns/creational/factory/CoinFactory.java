package com.dotin.designpatterns.creational.factory;

public class CoinFactory {

    public static Coin getCoin(CoinType coinType) {
        return coinType.getCoinSupplier().get();
    }

}
