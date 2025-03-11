package fr.ynov.java.medium;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Read {
    public static void main(String[] argv) throws IOException {
        BufferedReader br = null;
        String line;

        try
        {
            br = new BufferedReader(new FileReader(argv[0]));
        }
        catch  (FileNotFoundException exc)
        {
            System.out.println("File not found");
        }
        while
            ((line = br.readLine()) != null);
            System.out.println(line);
            br.close();
    }
}
