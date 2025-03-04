package fr.ynov.java.easy;

import java.util.Scanner;

public class Scanners {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Your Name : ");

        String name = String.valueOf(sc.nextLine());

        System.out.println(name);
    }
}
