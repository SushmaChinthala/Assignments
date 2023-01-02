package com.company;
interface SI
{
    int  simpleIntrest(int a,int b,int  c) ;
}
public class java11Assignment1
{
    public static void main(String[] args)
    {

       SI simpleIntrestlambda= ( var P, var R, var T) ->
       {
           System.out.println((P*R*T)/100);
           return (P*R*T/100);
       };

simpleIntrestlambda.simpleIntrest(10000,1,1);


    }
}
