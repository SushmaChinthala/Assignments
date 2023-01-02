package com.company;

import java.time.*;
import java.time.temporal.ChronoUnit;
import java.time.temporal.TemporalAdjusters;

class Java8TimeandDateExample
{
    public static void main(String[] args)
    {

        LocalDate l1=LocalDate.now();
        System.out.println(l1);
        Clock c1=Clock.systemDefaultZone();
        LocalDate l2=LocalDate.now(c1);
        System.out.println(l2);
       // ZoneId z1=ZoneId.of("Military");
        //LocalDate l3=LocalDate.now(z1);
        //System.out.println(l3);
        LocalDate l4=LocalDate.of(2017,03,02);
        System.out.println(l4);
        LocalDate l5=LocalDate.parse("2017-03-05");
        System.out.println(l5);
        LocalDate l6=l5.plusDays(2);
        System.out.println(l6);
        LocalDate l7=l6.minus(2, ChronoUnit.DAYS);
        System.out.println(l7);
        DayOfWeek d1=LocalDate.parse("2017-03-01").getDayOfWeek();
        System.out.println(d1);
       int  DayOfMonth =LocalDate.parse("2017-03-01").getDayOfMonth();
        System.out.println(DayOfMonth);
        LocalDate thisyear=LocalDate.now();
        System.out.println(thisyear.isLeapYear());
      boolean before=LocalDate.parse("2017-03-01").isBefore(LocalDate.parse("2017-02-28"));
        System.out.println(before);
        boolean after=LocalDate.parse("2017-03-01").isBefore(LocalDate.parse("2017-02-28"));
        System.out.println(after);
        LocalDateTime asstartofday=LocalDate.parse("2017-03-01").atStartOfDay();
        System.out.println(asstartofday);
        LocalDate with=LocalDate.parse("2017-03-02").with(TemporalAdjusters.firstDayOfMonth());
        System.out.println(with);
        System.out.println("Wirking with time methods");
        LocalTime t1=LocalTime.now();
        System.out.println(t1);
        LocalTime t2=LocalTime.parse("09:30");
        System.out.println(t2);
        LocalTime t3=LocalTime.of(10,07);
        System.out.println(t3);
        LocalTime plus=t3.plus(1,ChronoUnit.HOURS);
        System.out.println(plus);
        boolean before1=LocalTime.parse("09:30").isBefore(LocalTime.parse("09:35"));
        System.out.println(before1);
        System.out.println(LocalTime.MAX);
        System.out.println(LocalTime.MIN);





    }
}
