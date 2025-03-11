package fr.ynov.java.medium;

 enum Nationality {
    FRANCE , GERMANY , ITALIAN
}

public class person {
   private String name;
   private int age;
   private String gender;
   private float height;
   private float weight;
   private Nationality nationality;


   public person (String name , int age , String gender , float height , float weight, Nationality nationality ) {
       this.name=name;
       this.age=age;
       this.gender = gender ;
       this.height = height;
       this.weight = weight;
       this.nationality = nationality;
   }

   public void displayInfo(){
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Gender: " + gender);
        System.out.println("Height: " + height + " m");
        System.out.println("Weight: " + weight + " KG");
        System.out.println("Nationality: " + nationality);

   }
}







