package com.company;

import java.text.DateFormat;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;
import java.util.Date;
import java.lang.String;
class Pair<K,V>
{
  private K key;
  private V value;
 public Pair(K key,V value)
 {
     this.key=key;
     this.value=value;
 }
 public K setKey()
 {
     System.out.println(key);
     return key;
 }
 public V setValue()
 {
     System.out.println(value);
             return value;
 }
}
public class GenericClass {
    public static void main(String[] args) {
        Pair<String,String> p=new Pair<>("Sushma","Chinthala");
        p.setKey();
        p.setValue();
        Pair<String,Integer> q=new Pair<String,Integer>("Sushma",26);
        q.setKey();
        q.setValue();
    }
}
