package com.ymh;

public class Context {
    private Strategy strategy;

    public Context(Strategy strategy){
        this.strategy = strategy;
    }

    public double contextInterface(double bookPrice){
        return strategy.strategyInterface(bookPrice);
    }

}
