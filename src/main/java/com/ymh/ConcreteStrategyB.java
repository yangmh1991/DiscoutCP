package com.ymh;
/*
 *** @author 杨明辉
 ***
 ***
 */
public class ConcreteStrategyB implements Strategy{
    public double strategyInterface(double bookPrice) {
        return bookPrice*1.0;
    }
}
