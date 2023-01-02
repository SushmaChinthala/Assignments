package com.company;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Comparator;
import java.util.concurrent.locks.Condition;
import java.util.function.Predicate;


class person
{
    String Firstname;
    String LastName;
    int age;
    public person(String Firstname,String LastName,int age )
    {
        this.Firstname=Firstname;
        this.LastName=LastName;
        this.age=age;
    }
    public String getFirstname()
    {
        return Firstname;
    }

    public void setFirstname(String firstname)
    {
        Firstname = firstname;
    }

    public String getLastName()
    {
        return LastName;
    }

    public void setLastname(String lastName)
    {
        LastName = lastName;
    }

    public int getAge()
    {
        return age;
    }

    public void setAge(int age)
    {
        this.age = age;
    }
    @Override
    public String toString() {
        return "persons{" +
                "Firstname='" + Firstname + '\'' +
                ", Lastname='" + LastName + '\'' +
                ", age=" + age +
                '}';
    }
}

public class LambdaExample2
{
    public static void main(String[] args)
    {
        List<person> people = Arrays.asList(
                new person("Sushma", "chinthala", 21),
                new person("srimanya", "gangavarapu", 21),
                new person("prathyusha", "challagundla", 20),
                new person("poojitha", "prathipati", 20)
        );
        Collections.sort(people, (p1, p2) -> p1.getLastName().compareTo(p2.getLastName()));
        System.out.println("printing all persons");
        printConditionally(people, p -> true);
        System.out.println("printing all the persons with last name begining wuth c");
        printConditionally(people, p -> p.getLastName().startsWith("c"));
        System.out.println("printing all the persons with Firstname name begining wuth c");
        printConditionally(people, p -> p.getFirstname().startsWith("c"));

    }


    private static void printConditionally(List<person> people, Predicate<person> predicate) {

        for (person p : people) {
            if (predicate.test(p)) {
                System.out.println(p);
            }
        }
    }
}


