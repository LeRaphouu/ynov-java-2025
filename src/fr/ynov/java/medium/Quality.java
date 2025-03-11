package fr.ynov.java.medium;
import java.io.*;
import java.util.*;

public class Quality {
    private int id;
    private String name;


    public Quality(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public boolean equals(Quality q) {

        if (this == q)
            return true;
        if (q == null || q.getClass() != this.getClass())
            return false;

        Quality quality = (Quality) q;

        return quality.name.equals(this.name) && quality.id == this.id;
    }


    public int hashCode(int id) {
        return this.id ;
    }


    public static void main(String[] args) {
        Quality quality = new Quality(5, "Jean Dupont");
        Quality quality2 = new Quality(5, "Jean Dupont");
        System.out.println(quality.equals(quality2));


        Map<Quality, String> map = new HashMap<Quality, String>();
        map.put(quality, "CSE");
        map.put(quality2, "IT");

        for(Quality quality1 : map.keySet())
        {
            System.out.println(map.get(quality).toString());
        }
    }
}
