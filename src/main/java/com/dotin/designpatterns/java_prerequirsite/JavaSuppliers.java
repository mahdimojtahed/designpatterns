package com.dotin.designpatterns.java_prerequirsite;

import java.util.function.Supplier;

public class JavaSuppliers {

    // The Supplier interface represents a supplier of results and has no input arguments.
    // It provides a single method called get() that returns a result when invoked.

    public static void main(String[] args) {

        Supplier<Integer> randomNumberSupplier = () -> (int) (Math.random() * 100);

        int randomNumber1 = randomNumberSupplier.get();
        System.out.println("rand numb 1: " + randomNumber1);

        int randomNumber2 = randomNumberSupplier.get();
        System.out.println("rand numb 2: " + randomNumber2);

    }
}
