package fr.ynov.java.medium;

import java.util.Scanner;

public class Palindrome {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Your Word : ");

        String word = sc.nextLine();

        for (int i = 0; i < word.length(); i++) {

            if (word.charAt(i) != word.charAt(word.length() - 1 - i)) {
                System.out.println(false);
            } if (word.charAt(i) == word.charAt(word.length() - 1 - i)) {
                System.out.println(true);
            }
        }
    }



}
