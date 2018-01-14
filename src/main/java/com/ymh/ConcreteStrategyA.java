package com.ymh;
/*
 *** @author 杨明辉
 ***
 ***
 */
public class ConcreteStrategyA implements Strategy{

    public double strategyInterface(double bookPrice) {
        return bookPrice*1.2;
    }
}
