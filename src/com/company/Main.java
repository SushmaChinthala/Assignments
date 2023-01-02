package com.company;

public class Main {

    public static void main(String[] args)
    {

                for(int a=100; a<=999; a++)

                {
                     int b=a;
                     int re,sum=0;

                    while(a>0)
                    {
                        re = a % 10;
                        sum = sum + (re * re * re);
                        a = a / 10;
                    }
                    if(sum == b)
                    {
                        System.out.println("an amstrong number"+b);
                    }

                }
    }
}
