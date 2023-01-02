package com.company;

import java.util.Scanner;

class ReverseNumber
{
   public static void main(String args[])
   {
       Scanner s=new Scanner(System.in);
       System.out.println("Enter a number:");
       int a=s.nextInt();
       int dig=0;

       while(a>0)
       {
           int re=a%10;
           dig=dig*10+re;
           a=a/10;

       }
       System.out.println(dig);


}
}
