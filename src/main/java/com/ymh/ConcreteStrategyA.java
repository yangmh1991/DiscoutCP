package com.ymh;

public class ConcreteStrategyA implements Strategy{

    public double strategyInterface(double bookPrice) {
        return bookPrice*1.2;
    }
}
