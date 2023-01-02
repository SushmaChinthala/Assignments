package com.company;

abstract class Employees
{
    abstract void work();



}
   class Manager extends Employees
   {

       void work()
       {
           System.out.println("Manger started working");
       }

   }
   class Analyst extends Employees
   {

       void work()
       {
         System.out.println("Analyst started working");
       }
   }

public class Department
{
    static void attendenceSystem(Employees emp)
    {
        emp.work();
    }

    public static void main(String args[])
    {

       Manager m=new Manager();

      attendenceSystem(m);

       Analyst a=new Analyst();

      attendenceSystem(a);

    }
}


