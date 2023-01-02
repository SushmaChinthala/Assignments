package com.company;
interface Orders
{
    void criteria(int price);
}
public class Lambda2
{
    public static void main(String[] args)
    {
     Orders lamdaexpression=(int price)->
     {
       if(price>10000)
       {
           System.out.println("order price is more than 10000");
           System.out.println("Completed");
       }
       else
       {
           System.out.println("not accepted");
       }
     };
     lamdaexpression.criteria(9000);
    }
}
