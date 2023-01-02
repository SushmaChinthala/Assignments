package com.company;
abstract class persistence
{
    abstract void persist();
}
class filepersistance extends persistance
{
    public void persist()
    {

            System.out.println("data is saved in file");

    }
}
    class databasepersistence extends persistence
    {
    public void persist()
    {
        System.out.println("data is saved in database");

    }
    }

public class persistance {
    public static void main(String[] args) {
        filepersistance p=new filepersistance();
        p.persist();
        databasepersistence q=new databasepersistence();
        q.persist();

    }
}
