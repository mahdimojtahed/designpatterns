package com.dotin.designpatterns.creational.factory;

public class Main {
    public static void main(String[] args) {


        var goldCoin = CoinFactory.getCoin(CoinType.GOLD);
        var silverCoin = CoinFactory.getCoin(CoinType.SILVER);
        System.out.println(goldCoin.getDescription());
        System.out.println(silverCoin.getDescription());

    }
}
