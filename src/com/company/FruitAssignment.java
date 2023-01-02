package com.company;

import java.util.*;
import java.util.stream.Collector;
import java.util.stream.Collectors;
class Fruit {
    String name;
    int Calories;
    int price;
    String color;

    Fruit(String name, int Calories, int price, String color) {
        this.name = name;
        this.Calories = Calories;
        this.price = price;
        this.color = color;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getCalories() {
        return Calories;
    }

    public void setCalories(int Calories) {
        this.Calories = Calories;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public String getColor()
    {
        this.color=color;
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public String toString() {
        return "Fruit{" +
                "name='" + name + '\'' +
                ", calories=" + Calories +
                ", price=" + price +
                ", color='" + color + '\'' +
                '}';
    }
}
class SortbyCalories implements Comparator
    {
        public int compare(Object i1, Object i2)
        {
           Integer s1=(Integer)i1;
           Integer s2=(Integer)i2;
            return s2.compareTo(s1);
        }
    }
    public class FruitAssignment {
    public static void main(String[] args) {
        Fruit f = new Fruit("Apple", 100, 100, "red");
        Fruit f4=new Fruit("pomegranate",120,150,"red");
        Fruit f1 = new Fruit("Guava", 80, 50, "green");
        Fruit f2 = new Fruit("Mongo", 200, 200, "yellow");
        Fruit f3 = new Fruit("Banana", 60, 300, "paleYellow");
        ArrayList<Fruit> l = new ArrayList<>();
        {
            l.add(f);
            l.add(f1);
            l.add(f2);
            l.add(f3);
            l.add(f4);

        }
        List<Fruit>  sortedlist=  l.stream().filter(c->c.getCalories()>100).sorted(Comparator.comparingInt(Fruit::getCalories)).collect(Collectors.toList());
        sortedlist.forEach(System.out::println);
        List<Fruit>  sortedlist1=  l.stream().sorted(Comparator.comparing(Fruit::getColor)).collect(Collectors.toList());
        sortedlist1.forEach(System.out::println);
        List<Fruit>  sortedlist3=  l.stream().filter(p->p.getColor().equals("red")).sorted(Comparator.comparingInt(Fruit::getCalories)).collect(Collectors.toList());
        sortedlist3.forEach(System.out::println);


    }
}
