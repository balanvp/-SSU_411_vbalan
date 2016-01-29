package com.company;

import java.time.Month;
import java.util.Calendar;

import java.util.Calendar;
import java.util.Scanner;


public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Введите год:");
        int y = sc.nextInt();
        if (y < 1800 || y > 2020)

            try
            {
                System.err.print("ERROR");
                return;
            }
            catch (NumberFormatException e)
            {
                System.err.println("Неверный формат года!");
            }




        System.out.println(y);
        sc.close();

        Calendar c = Calendar.getInstance();
        for (int i = 0; i < 12; ++i)



        {
            c.set(y, i, 13);
            if (c.get(Calendar.DAY_OF_WEEK) == Calendar.FRIDAY) {


                if (i == 0) {
                    System.out.print("Янврь" + "   ");
                }

                if (i == 1) {
                    System.out.print("Февраль" + "   ");
                }

                if (i == 2) {
                    System.out.print("Март" + "   ");
                }

                if (i == 3) {
                    System.out.print("Апрель" + "   ");
                }

                if (i == 4) {
                    System.out.print("Май" + "   ");
                }

                if (i == 5) {
                    System.out.print("Июнь" + "   ");
                }


                if (i == 6) {
                    System.out.print("Июль" + "   ");
                }

                if (i == 7) {
                    System.out.print("Август" + "   ");
                }

                if (i == 8) {
                    System.out.print("Сентябрь" + "   ");
                }

                if (i == 9) {
                    System.out.print("Октябрь" + "   ");
                }

                if (i == 10) {
                    System.out.print("Ноябрь" + "   ");
                }

                if (i == 8) {
                    System.out.print("Декабрь" + "   ");
                }

            }
        }
    }
}


