package com.ymh;

public class ConcreteStrategyC implements Strategy{
    public double strategyInterface(double bookPrice) {
        return bookPrice*0.6;
    }
}
