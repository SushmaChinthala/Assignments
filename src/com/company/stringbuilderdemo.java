package com.company;
import java.lang.StringBuilder;

public class stringbuilderdemo {
    public static void main(String args[])
    {
        StringBuilder str1=new StringBuilder("StringBuffer");
        System.out.println(str1);
        StringBuilder str2=new StringBuilder(" is a peer class of string");
        System.out.println(str1.append(str2));
        StringBuilder str3=new StringBuilder(" that provides much of");
        System.out.println(str2.append(str3));
        StringBuilder str4=new StringBuilder(" the functionality of strings");
        System.out.println(str3.append(str4));
        StringBuilder str5=new StringBuilder("it is used to - at the specified index position");
        System.out.println(str5.insert(15,"insert text"));
        StringBuilder str6=new StringBuilder("this method returns the reversed object on which it was called");
        System.out.println(str6.reverse());

    }
}
