package fr.ynov.java.easy;

import java.util.Scanner;

public class Scanners {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Your Name : ");

        String name = String.valueOf(sc.nextLine());

        System.out.println(name);

        Scanner sc1 = new Scanner(System.in);
        System.out.println("Choose Numbers : ");

        int choice1 = sc1.nextInt();
        System.out.println(choice1);

        Scanner sc2 = new Scanner(System.in);
        if (choice1 % 2 == 0) {
            System.out.println("Even Numbers");
        } else {
            System.out.println("Odd Numbers");
        }
    }
}
