package com.company;

import java.util.Scanner;


public class MainBasket {
    public static void main(String[] args) {
        Baskets b = new Basket();
        Scanner in = new Scanner(System.in);
        String command, product, quantity;
        System.out.println("1 добавить объект в корзину");
        System.out.println("2 удалить объект");
        System.out.println("3 изменить объект");
        System.out.println("4 очистить");
        System.out.println("5 вывести количество продуктов");
        System.out.println("6 вывести все продукты ");
        System.out.println("7 закрыть");
        do {
            command = in.nextLine();


            if (command.equals("1")) {
                System.out.print("название продукта: ");
                product = in.nextLine();
                System.out.print("количество продуктов: ");
                quantity = in.nextLine();
                try {
                    int count = Integer.parseInt(quantity);
                    b.addProduct(product, count);
                    System.out.println("Выполнено");
                } catch (Exception e) {
                    System.out.println("Не добавлено");
                }

            } else if (command.equals("2")) {
                System.out.print("название продукта: ");
                product = in.nextLine();
                try {
                    b.removeProduct(product);
                    System.out.println("Выполнено");
                } catch (Exception e) {
                    System.out.println("не удалено");
                }

            } else if (command.equals("3")) {
                System.out.print("название продукта: ");
                product = in.nextLine();
                System.out.print("количество продуктов: ");
                quantity = in.nextLine();
                try {
                    int count = Integer.parseInt(quantity);
                    b.updateProductQuantity(product, count);
                    System.out.println("Выполнено");
                } catch (Exception e) {
                    System.out.println("не изменено");
                }

            } else if (command.equals("4")) {
                b.clear();

            } else if (command.equals("5")) {
                System.out.print("название продукта: ");
                product = in.nextLine();
                try {
                    System.out.println(b.getProductQuantity(product));
                } catch (Exception e) {
                    System.out.println("Нет такого продукта");
                }

            } else if (command.equals("6")) {
                for (String prd : b.getProducts())
                    System.out.println(prd);

            } else if (command.equals("7")) {
            } else {
                System.out.println("Неизвестная команда");
            }
        }
        while (!command.equals("7"));
    }
}