package com.company;
import java.util.Scanner;

public class subject {
    public static void main(String args[])
    {
        int sub1,sub2,sub3,sum=0;
        Scanner s=new Scanner(System.in);
        System.out.println("enter first subject marks");
        sub1=s.nextInt();
        System.out.println("enter second  subject marks");
        sub2=s.nextInt();
        System.out.println("enter third subject marks");
        sub3=s.nextInt();

        if(sub1>60 && sub2>60 && sub3>60)
            System.out.println("passed");
        if(sub1>60 && sub2>60 || sub3>60 || sub1>60 || sub2>60 && sub3>60)
            System.out.println("prompted");
        if(sub1<60 && sub2<60 && sub3<60)
            System.out.println("failed");




    }}
