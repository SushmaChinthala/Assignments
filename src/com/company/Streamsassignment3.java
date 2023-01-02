package com.company;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

class Trader {
    String name;
    String city;

    public Trader(String name, String city) {
        this.name = name;
        this.city = city;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCity() {

        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Trader trader = (Trader) o;
        return city.equals(trader.city);
    }

    @Override
    public int hashCode() {
        return Objects.hash(city);
    }


    @Override
    public String toString() {
        return "Trader{" +
                "name='" + name + '\'' +
                ", city='" + city + '\'' +
                '}';
    }
}

public class Streamsassignment3 {
    public static void main(String[] args) {
        Trader t1 = new Trader("sushma", "ongole");
        Trader t2 = new Trader("srimanya", "ongole");
        Trader t3 = new Trader("prathyusha", "guntur");
        Trader t4 = new Trader("poojitha", "vijayawada");


        ArrayList<Trader> tr = new ArrayList<>();
        {
            tr.add(t1);
            tr.add(t2);
            tr.add(t3);
            tr.add(t4);

        }

        tr.stream().distinct().forEach(p -> System.out.println(p.getCity()));
        List<Trader> sortedlist4 = tr.stream().filter(p -> p.getCity().equals("ongole")).sorted(Comparator.comparing(Trader::getName)).collect(Collectors.toList());
        sortedlist4.forEach(System.out::println);
        List<Trader> sortedlist5 = tr.stream().sorted(Comparator.comparing(Trader::getCity)).collect(Collectors.toList());
        sortedlist5.forEach(System.out::println);
        List<Trader> sortedlist6 = tr.stream().filter(p -> p.getCity().equals("ongole")).collect(Collectors.toList());
        System.out.println(sortedlist6);
       tr.stream().sorted(Comparator.comparing(Trader::getName)).forEach(p->System.out.println(p.getName()));

    }
}
