package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int total = 0;
        int a = 0;

        do {
            System.out.print("bir sayı girin: ");
            a = input.nextInt();
            if (a % 4 == 0) {
                total += a;
            }
        } while (a % 2 == 0);

        System.out.println("Total= " + total);

    }
}