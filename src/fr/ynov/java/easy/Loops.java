package fr.ynov.java.easy;

public class Loops {

    public static void main(String[] args) {

        for (int x = 1; x < 11; x++){
            System.out.println(x);
        }
        int countW = 0;
        while (countW < 10) {
            countW++;
            System.out.println(countW);
        }

        int countDo = 0;
        do {
            countDo++;
            System.out.println(countDo);
        }
        while (countDo < 10);

    }
    }


