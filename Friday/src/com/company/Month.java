package com.company;

import java.util.Calendar;
import java.util.Scanner;


public class Month
{
    public static void res(int y)
    {

        Calendar calendar = Calendar.getInstance();
        calendar.set(calendar.MONTH, y);
        int quantity = 0;
        for(int i=1800; i<=2015; i++)
        {
            calendar.set(calendar.YEAR, i);
            calendar.set(calendar.DAY_OF_MONTH, 12);
            if (calendar.get(calendar.DAY_OF_WEEK)==5)
            {
                System.out.println(calendar.get(calendar.YEAR));
                quantity++;
            }
        }
        System.out.println("Количество: " + quantity);
    }

    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите месяц: ");
        String sc = scanner.nextLine();
        try
        {
            int y = Integer.parseInt(sc);
            if (y >= 0 && y <= 11)
                res(y);
            else
                System.err.println("ERROR введите месяц из диапозона");
        }
        catch (NumberFormatException e)
        {
            System.err.println("Неправильно");
        }
    }
}