package com.company;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.Map.Entry;

public class Lambda7 {
    public static void main(String[] args) {
        Map<String, String> m = new HashMap();
        m.put("a", "apple");
        m.put("b", "ball");
        m.put("c", "cat");
        m.put("d", "dog");

        Set<Map.Entry<String, String>> entryset = m.entrySet();
        StringBuilder s = new StringBuilder();
        {

            for (Map.Entry<String,String> str:m.entrySet())
            {
                String str1=str.getKey()+str.getValue();
                s.append(str1);
            }
            System.out.println(s);
        }
    }
}
