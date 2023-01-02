package com.company;
import java.lang.String;

 class saving
 {
     String name;
     int money;


     saving(String name, int money)
     {
         this.name = name;
         this.money = money;
     }

     public void fixeddeposit()
     {
         System.out.println("money deposited is " + money);

     }
     public int totalMoney()
     {
       return money;
     }

 }
 class current
 {
     String name;
     int moneyc;
     current(String name,int moneyc)
            {
              this.name=name;
              this.moneyc=moneyc;
            }
            public int cashcredit()
            {
                System.out.println("money credited is "+moneyc);

                return moneyc;
            }
     public int totalMoney()
     {
         return moneyc;
     }

 }


public class bank2 {
    public static void main(String[] args) {
        saving s=new saving("su",1000);
        s.fixeddeposit();
        int p=s.totalMoney();
        current c=new current("sv",2000);
        c.cashcredit();
        int d=c.totalMoney();
        int y=p+d;
        System.out.println("Total money in the bank is"+y);


    }
}
