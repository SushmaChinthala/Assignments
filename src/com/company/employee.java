package com.company;
class employe
{
    public int getsalary(int salary)
    {
        return salary;
    }

}
class labor extends employe{
    int hours;
    int money;
    int time;
   public labor(int hours,int money,int time)
    {
        this.hours=hours;
        this.money=money;
        this.time=time;
    }

    public int getsalary()

    {
        return (hours*money*time);
    }
}
class manager extends employe{
    public int getsalary(int salary)

    {
        return salary;
    }
}


public class employee {
    public static void main(String[] args) {

employe s=new employe();
int p=s.getsalary(500);
System.out.println(p);
labor l=new labor(5,100,30);
int v=l.getsalary();
        System.out.println(v);
   manager g=new manager();
int r=  g.getsalary(900);
        System.out.println(r);

int totalsalary=p+v+r;
        System.out.println(totalsalary);
    }
}
