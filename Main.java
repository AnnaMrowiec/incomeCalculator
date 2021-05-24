package com.amrowiec;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Name: ");
        String name = scanner.nextLine().trim();

        System.out.print("Age: ");
        String age = scanner.nextLine().trim();

        System.out.print("Gross income: ");
        int grossIncome = scanner.nextInt();

        System.out.print("Monthly expenses: ");
        int expenses = scanner.nextInt();
        float tax = Math.round(expenses*19/100F);
        float netIncome = grossIncome - tax;
        
        System.out.println("You are " + name + " and you are " + age + " years old");
        System.out.println("You get " + grossIncome + " PLN");
        System.out.println("With " + tax + " tax, you earn " + netIncome + " PLN");
    }
}
