package com.example;

import com.example.lambda.Function;

/**
 * Created by kosiara on 3/28/16.
 */
public class Main {
    public static void main(String[] args) {
        //check whether Java8 syntax compiles
        printHello.invoke();
    }

    static Function printHello = () -> {
            System.out.println("Hello world!");
    };
}
