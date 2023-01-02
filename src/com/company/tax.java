package com.company;
import java.util.Scanner;


public class tax {
    public static void main(String args[]) {
        double t = 0, i;
        Scanner s = new Scanner(System.in);
        System.out.println("enter salary");

        i = s.nextDouble();
        t = incometax(i);
        System.out.println("tax is"+t);
    }
        static double incometax ( double it ) {
            double tax1;

            if (it <= 180000) {
                tax1 = 0;
            } else if  (it <= 300000) {
                tax1 = 0.1*(it-180000);

            } else if ( it <= 500000) {
                tax1 = (0.2*(it-300000))+(0.1*100000);

            } else if ( it <= 1000000) {
                tax1 = (0.3*(it-500000))+(0.2*200000)+(0.1*100000);

            } else {
                tax1 = (0.4 * (it - 1000000)) + (0.3 * 500000) + (0.2 * 200000) + (0.1 * 100000);
            }
            return tax1;
        }


    }

