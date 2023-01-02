package com.company;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Iterator;
import java.util.TreeSet;

public class Hashsetassignment
{
    public static void main(String[] args)
    {
        HashSet h = new HashSet();
        // LinkedHashSet h=new LinkedHashSet<>();
        // TreeSet h=new TreeSet<>();

        h.add("a");
        h.add("c");
        h.add("b");
        h.add("f");
        h.add("k");
        h.add(null);
        System.out.println(h);

}
}