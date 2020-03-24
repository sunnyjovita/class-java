package com.company;
import java.util.Scanner;

public class Driver_class {
    public static void main (String args[]){
        Employee e1 = new Employee(1234, "sunny", "jovita", 12000000);
        System.out.println(e1.toString());

        Invoice_item i1 = new Invoice_item("1234", "Pencil", 10, 5000);
        System.out.println(i1.toString());
        System.out.println(i1.getTotal());


        Account acc = new Account("1234", "sunny", 10000);
        System.out.println(acc.toString());
        System.out.println(acc.debit(1000));
        System.out.println(acc.credit(11000));
//        System.out.println(acc.Transfer("milo", 100000));

        Date d1 = new Date(22, 2, 2000);
        System.out.println(d1);
        d1.setDay(2);
        d1.setMonth(3);
        d1.setYear(1997);
        System.out.println(d1);
        System.out.println(d1.toString());

        Time t1 = new Time(5, 23, 2);

        System.out.println(t1);

        t1.setHour(12);
        t1.setMinute(50);
        t1.setSecond(32);

        System.out.println(t1);

        t1.setTime(15, 23, 2);

        System.out.println(t1);

        System.out.println(t1.toString());

 









    }
}
