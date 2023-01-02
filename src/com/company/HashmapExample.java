package com.company;
import java.util.Collection;
import java.util.HashMap;
import java.util.Set;

public class HashmapExample
{
    public static void main(String[] args)
    {
        HashMap<Integer,Double> h=new HashMap();
        h.put(1,1.0);
        h.put(2,2.0);
        h.put(3,3.0);
        h.put(4,4.0);
        h.put(5,5.0);
        System.out.println(h);
        Set s=h.keySet();
        System.out.println(s);
        Collection c=h.values();
        System.out.println(c);
        Set e=h.entrySet();
        System.out.println(e);


    }
}
