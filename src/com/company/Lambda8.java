package com.company;

import java.util.ArrayList;
import java.util.List;

public class Lambda8 {
    public static void main(String[] args) {
        Thread t1 = new Thread(()->
        {
            List<Integer> list = new ArrayList<>();
            {
                list.add(5);
                list.add(4);
                list.add(3);
                list.add(2);
                list.add(1);
                System.out.println(list);
            }
        });
        t1.run();
    }
}
