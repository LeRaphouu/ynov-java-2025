package fr.ynov.java.medium;


import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class Write {
    public static void main(String[] args)  throws IOException {
        PrintWriter write;

        write = new PrintWriter( new BufferedWriter(new FileWriter(args[0])));

        /**
         * write.println("Ton text");
         *Pour ecrire dans le fichier txt il faut untiliser la commande si dessus !!!
         */



    }
}
