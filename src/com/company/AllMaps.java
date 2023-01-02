package com.company;
import java.util.Collection;
import java.util.Map;
import java.util.HashMap;
import java.util.Set;
import java.util.LinkedHashMap;
import java.util.Hashtable;
import java.util.TreeMap;

public class AllMaps {
    public static void main(String[] args) {
       HashMap m = new HashMap();
      // LinkedHashMap m=new LinkedHashMap();
   //Hashtable m=new Hashtable<>();
        //TreeMap m=new TreeMap();
        m.put(1,'a');
        m.put(5,'e');
        m.put(4,'d');
        m.put(6,'f');
        m.put(2,'b');
        m.put(3,'c');
        m.put(7,'g');
        m.put(8,'i');
        m.put(10,'h');
        m.put("abc",1);
        
       // m.put(null,"null");
      //  m.put(null,"null");


        System.out.println(m);

    }
}
