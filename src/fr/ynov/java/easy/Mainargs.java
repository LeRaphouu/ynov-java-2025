package fr.ynov.java.easy;

import java.util.Scanner;

public class Mainargs {
    public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);
    System.out.println("Enter Number : ");
    int choice = sc.nextInt();

    Scanner operator = new Scanner(System.in);
    System.out.println("Enter un opérateur entre +,*,- : ");
    String op = operator.next();

    Scanner sc1 = new Scanner(System.in);
    System.out.println("Enter second Number : ");
    int choice2 = sc1.nextInt();


    switch (op) {
        case "+":
            System.out.println("the result is : " + (choice + choice2));
            break;
        case "-":
            System.out.println("the result is : " + (choice - choice2));
            break;
        case"*":
            System.out.println("the result is : " + (choice * choice2) );
            break;
    }

    }
}
