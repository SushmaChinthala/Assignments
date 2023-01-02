package com.company;
import java.util.*;

public class stringdemo {
    public static void main(String args[])
    {
        String str="Hello World";
        String str1=" How are you?";
        System.out.println(str.length());
        System.out.println(str.concat(str1));
        String str3="Java string pool refers to collection of strings which are stored in heap memory";
        System.out.println(str3.toLowerCase());
        System.out.println(str3.toUpperCase());
       String  str4=str3.replace('a','$');
        System.out.println(str4.replace('a','$'));
        boolean a=str3.contains("collection");
        System.out.println(a);
        String str5="Java string pool refers to collection of strings which are stored in heap memory";
        System.out.println(str3.equals(str5));
        if(str3==str5)
        {
            System.out.println("equal");

        }



    }
}

