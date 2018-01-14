package com.ymh;
/*
*** @author 杨明辉
*** @description 书的类{书的类型，书的价格，书的折扣价}
 */
public class Book {
    private String bookType;
    private double bookPrice;
    public double discountPrice=0;
    public void setBookPrice(double bookPrice) {
        this.bookPrice = bookPrice;
    }

    public void setBookType(String bookType) {
        this.bookType = bookType;
    }

    public String getBookType() {
        return bookType;
    }

    public double getBookPrice() {
        return bookPrice;
    }

    public Book(String bookType, double bookPrice){
        this.bookPrice = bookPrice;
        this.bookType = bookType;
    }
    public String toString(){
        return bookType+" "+bookPrice;
    }
}
