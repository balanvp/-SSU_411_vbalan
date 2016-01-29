package com.company;

import java.time.Month;
import java.util.Calendar;

import java.util.Calendar;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Введите год:");
        String scan = sc.nextLine();

        int year = Integer.parseInt(scan);
        try {
            if (year < 1800 || year > 2020)
                System.out.print("ERROR");

        } catch (NumberFormatException e) {
            System.err.println("Неверный формат года!");
        }

        System.out.println(year);
        sc.close();

        Calendar c = Calendar.getInstance();
        for (int month = 0; month < 12; ++month)
        {
            c.set(year, month, 13);
            if (c.get(Calendar.DAY_OF_WEEK) == Calendar.FRIDAY) {

                if (month == 0)  {System.out.print("Янврь" + "   ");}
                if (month == 1) { System.out.print("Февраль" + "   ");}
                if (month == 2) {System.out.print("Март" + "   ");}
                if (month== 3) { System.out.print("Апрель" + "   ");}
                if (month == 4) {System.out.print("Май" + "   ");}
                if (month == 5) {System.out.print("Июнь" + "   "); }
                if (month == 6) {System.out.print("Июль" + "   ");}
                if (month == 7) { System.out.print("Август" + "   ");}
                if (month == 8) { System.out.print("Сентябрь" + "   ");}
                if (month == 9) {System.out.print("Октябрь" + "   ");}
                if (month == 10) {System.out.print("Ноябрь" + "   ");}
                if (month == 11) {System.out.print("Декабрь" + "   ");}
            }
        }
    }
}


