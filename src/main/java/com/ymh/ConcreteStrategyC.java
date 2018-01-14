package com.ymh;
/*
 *** @author 杨明辉
 ***
 ***
 */
public class ConcreteStrategyC implements Strategy{
    public double strategyInterface(double bookPrice) {
        return bookPrice*0.6;
    }
}
