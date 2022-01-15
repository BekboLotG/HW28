package com.company;

import java.util.function.UnaryOperator;

public class Main {

    public static void main(String[] args) {
        System.out.println(sqrt().apply(9.0));
    }
    public static UnaryOperator<Double> sqrt(){
        return Math::sqrt;
    }
}
