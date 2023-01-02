package com.company;

import java.util.EnumSet;

enum  WeekDay
{
    MONDAY,TUESDAY,WEDNESDAY,THURSDAY,FRIDAY,SATURDAY
}
public class EnumSetExample {
    public static void main(String[] args) {
        EnumSet<WeekDay> enumset = EnumSet.range(WeekDay.MONDAY, WeekDay.FRIDAY);
        for (WeekDay weekday : enumset) {
            System.out.println("weekday" + weekday);
        }
    }
}
