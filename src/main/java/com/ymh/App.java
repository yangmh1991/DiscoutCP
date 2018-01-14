package com.ymh;

import java.util.Scanner;
import java.util.*;
/**
 * @author 杨明辉
 * class App(Main)
 */
public class App 
{
    public static void main( String[] args )
    {
        Scanner sc=new Scanner(System.in);
        String bT;
        double bP;
        int count=sc.nextInt();
        Book[] books=new Book[count];
        for(int i=0;i<count;i++){
            bT=sc.next();
            bP=sc.nextDouble();
            books[i]=new Book(bT,bP);
        }
        sc.close();
        Context context=new Context();
        double cost=context.contextInterface(books);
        System.out.println("总价："+cost);
    }
}
