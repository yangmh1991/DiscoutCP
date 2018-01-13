package com.ymh;

public class ConcreteStrategyB implements Strategy{
    public double strategyInterface(double bookPrice) {
        return bookPrice*1.0;
    }
}
