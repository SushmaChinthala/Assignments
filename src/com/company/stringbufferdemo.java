package com.company;
import java.lang.StringBuffer;

public class stringbufferdemo {
    public static void main(String args[])
    {
        StringBuffer str1=new StringBuffer("StringBuffer");
        System.out.println(str1);
        StringBuffer str2=new StringBuffer(" is a peer class of string");
        System.out.println(str1.append(str2));
        StringBuffer str3=new StringBuffer(" that provides much of");
        System.out.println(str2.append(str3));
        StringBuffer str4=new StringBuffer(" the functionality of strings");
        System.out.println(str3.append(str4));
        StringBuffer str5=new StringBuffer("it is used to - at the specified index position");
        System.out.println(str5.insert(15,"insert text"));
        StringBuffer str6=new StringBuffer("this method returns the reversed object on which it was called");
        System.out.println(str6.reverse());









    }
}
