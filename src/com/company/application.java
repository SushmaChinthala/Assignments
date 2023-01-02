package com.company;
import java.util.Scanner;

public class application {
    public static void main(String args[]) {
        int count,  flag = 0;
        String username = "Sushma";
        String password = "Sushma@123";
        Scanner s = new Scanner(System.in);
        System.out.println("loginname:");
        String loginname = s.next();
        System.out.println("enter upassword");
        String upassword = s.next();

        for (count = 0; count <=3; count++)
        {

                if ((username.equals(loginname)) && (password.equals(upassword))) {

                    flag = 1;
                    break;

                } else {
                    System.out.println("loginname:");
                    loginname = s.next();
                    System.out.println("enter upassword");
                    upassword = s.next();


                }
                if (count > 3) {
                    System.out.println("contact admin");
                }

        }
        if (flag == 1) {
            System.out.println("welcome");
        }


    }
}

