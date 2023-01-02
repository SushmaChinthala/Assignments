package com.company;
import java.util.Scanner;

public class intrest {
    public static void main(String args[])
    {
        int p,r,t,output,n,output2;
        Scanner input=new Scanner(System.in);
        System.out.println("enter principle amount");
        p= input.nextInt();
        System.out.println("enter rate");
        r=input.nextInt();
        System.out.println("enter time");
        t= input.nextInt();
        System.out.println("enter number of times intrest is applied");
        n= input.nextInt();
        output=(p*r*t)/100;
        output2=p*(1+(r/n))^(n*t);
        System.out.println("intrest is"+output);
        System.out.println("c intrest is"+output2);

    }
}
