package com.ymh;

/*
*** @author 杨明辉
***
***
 */
public class Context {
    private Strategy strategy;
    private Strategy strategyA=null;
    private Strategy strategyB=null;
    private Strategy strategyC=null;


    public double dicountPrice(Book book){
        String type = book.getBookType();
        if(type.equals("新书")){
             if(strategyA==null){
                 strategyA=new ConcreteStrategyA();
             }
             strategy = strategyA;
        }else if(type.equals("常规图书")){
             if(strategyB==null){
                strategyB=new ConcreteStrategyB();
             }
            strategy = strategyB;
        }else if(type.equals("滞销图书")){
             if(strategyC==null){
                strategyC=new ConcreteStrategyC();
             }
            strategy = strategyC;
        }else{
            try {
                throw new Exception("无该类别书籍");
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        book.discountPrice=strategy.strategyInterface(book.getBookPrice());
        return book.discountPrice;
    }

    public double contextInterface(Book[] books){
        int num=books.length, cost=0;
        for(int i=0;i<num;i++){
            cost+=dicountPrice(books[i]);
        }
        return cost;
    }

}
