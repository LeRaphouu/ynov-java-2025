package fr.ynov.java.medium;


import java.util.Scanner;

enum Possibility{
    CISORS , ROCK , PAPER
}

public class Game {
    public static void main(String[] args) {

        Possibility possibility = Possibility.CISORS;
        Possibility possibility2 = Possibility.ROCK;
        Possibility possibility3 = Possibility.PAPER;

        Scanner sc = new Scanner(System.in);
        System.out.println(" Joueur 1 Faites votre choix : " + possibility + " " + possibility2 + " " + possibility3);
        String choix = sc.nextLine();

        Scanner sc2 = new Scanner(System.in);
        System.out.println(" Joueur 1 Faites votre choix : " + possibility + " " + possibility2 + " " + possibility3);
        String choix2 = sc.nextLine();


        if (choix.equals("CISORS")&&choix2.equals("CISORS")) {
            System.out.println("Egalité");
        }
        if (choix.equals("PAPER")&&choix2.equals("PAPER")) {
            System.out.println("Egalité");
        }
        if (choix.equals("ROCK")&&choix2.equals("ROCK")) {
            System.out.println("Egalité");
        }

        if (choix.equals("CISORS") && choix2.equals("PAPER")) {
            System.out.println("Joueur 1 a gagné");
        }
        if (choix.equals("ROCK") && choix2.equals("CISORS")) {
            System.out.println("Joueur 1 a gagné");
        }
        if (choix.equals("PAPER") && choix2.equals("ROCK")) {
            System.out.println("Joueur 1 a gagné");
        }

        if (choix2.equals("CISORS") && choix.equals("PAPER")) {
            System.out.println("Joueur 2 a gagné");
        }
        if (choix2.equals("ROCK") && choix.equals("CISORS")) {
            System.out.println("Joueur 2 a gagné");
        }
        if (choix2.equals("PAPER") && choix.equals("ROCK")) {
            System.out.println("Joueur 1 a gagné");
        }

    }
}
