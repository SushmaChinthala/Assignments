package com.company;
import java.util.LinkedList;
import java.util.Iterator;
class DOB {
    int year;
    int month;
    int date;

    DOB(int year, int month, int date) {
        this.year = year;
        this.month = month;
        this.date = date;
    }

    @Override
    public String toString() {
        return "DOB{" +
                "year=" + year +
                ", month=" + month +
                ", date=" + date +
                '}';
    }
}
public class LinkedlistObject {
    public static void main(String[] args) {
        DOB b1 = new DOB(2002, 07, 28);
        DOB b2 = new DOB(2004, 10, 24);
        DOB b3 = new DOB(2008, 12, 25);
        DOB b4 = new DOB(2012, 11, 26);
        LinkedList<DOB> l1 = new LinkedList<>();
        l1.add(b1);
        l1.add(b2);
        l1.add(b3);
        l1.add(b4);
        System.out.println(l1);
        Iterator<DOB> itr = l1.iterator();
        {
            while (itr.hasNext())
            {
                int i=itr.next().year;
                if (i % 4 == 0 )
                {
                    System.out.println("your date of birth is "+i+"is a leap year");
                }
                else
                {
                    System.out.println("your date of birth is"+i+" Not a leap year");
                }

            }
        }
    }
}





