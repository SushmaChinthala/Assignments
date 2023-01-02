package com.company;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

class Transaction {
    Trader trader;
    int Year;
    int value;

    public Transaction(Trader trader, int year, int value) {
        this.trader = trader;
        Year = year;
        this.value = value;
    }

    public Trader getTrader() {
        return trader;
    }

    public void setTrader(Trader trader) {
        this.trader = trader;
    }

    public int getYear() {
        return Year;
    }

    public void setYear(int year) {
        Year = year;
    }

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }

    @Override
    public String toString() {
        return "Transaction{" +
                "trader=" + trader +
                ", Year=" + Year +
                ", value=" + value +
                '}';
    }
}



public class sreamsassignment4
{
    public static void main(String[] args)
    {
       Transaction s1 = new Transaction(new Trader("Sushma","ongole"), 2010, 10000);
      Transaction s2 = new Transaction(new Trader("Srimanya","ongole"), 2011, 30000);
       Transaction s3 = new Transaction(new Trader("Prathyusha","guntur"), 2011, 20000);
      Transaction s4 = new Transaction(new Trader("Poojitha","vijayawada"),2013, 15000);

    ArrayList<Transaction> t= new ArrayList<>();
    {
        t.add(s1);
        t.add(s2);
        t.add(s3);
        t.add(s4);

    }
       t.stream().filter(p->p.trader.getCity().equalsIgnoreCase("ongole")).forEach(p->System.out.println(p.getValue()));
        List<Transaction> sortedlist3=  t.stream().filter(p->p.getYear()==(2011)).sorted(Comparator.comparingInt(Transaction::getValue)).collect(Collectors.toList());
        sortedlist3.forEach(System.out::println);
        Optional<Transaction> sortedlist9=t.stream().max(Comparator.comparingInt(Transaction::getValue));
        System.out.println(sortedlist9);
         Optional<Transaction> sortedlist10=t.stream().min(Comparator.comparingInt(Transaction::getValue));
        System.out.println(sortedlist10);




}

}
