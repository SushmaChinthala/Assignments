package com.company;
interface Add
{
     int adding(int x,int y);
}
interface Substarct
{
    int minus(int x,int y);
}
interface Multiply
{
    int product(int x,int y);
}
interface Division
{
    int divide(int x,int y);
}
public class LamdaAssignment1
{
    public static void main(String[] args)
    {
      Substarct addlambda=(int a,int b)->
      {
          System.out.println("Substraction of two numbers is"+(a-b));
          return a-b;
      };
      addlambda.minus(5,4);
        Add minuslambda=(int a,int b)->
        {
            System.out.println("Addiotion of two numbers is"+(a+b));
            return a+b;
        };
        minuslambda.adding(5,4);
       Multiply multiplylambda=(int a,int b)->
        {
            System.out.println("product  of two numbers is"+(a*b));
            return a*b;
        };
        multiplylambda.product(5,4);
       Division dividelambda=(int a,int b)->
        {
            System.out.println("Addiotion of two numbers is"+(a/b));
            return a/b;
        };
        dividelambda.divide(5,1);
    }
}
