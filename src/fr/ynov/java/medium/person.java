package fr.ynov.java.medium;

import java.util.Date;
import java.util.Calendar;

enum Nationality {
    FRANCE , GERMANY , ITALIAN
}


public class person {
   private String name;
   private Date birthDate ;
   private String gender;
   private float height;
   private float weight;
   private Nationality nationality;


public int calculateAge (Date birthDate){
    Calendar birth = Calendar.getInstance();
    birth.setTime(birthDate);
    Calendar today = Calendar.getInstance();

    int age = today.get(Calendar.YEAR) - birth.get(Calendar.YEAR);

    if (today.get(Calendar.MONTH) < birth.get(Calendar.MONTH) ||
            (today.get(Calendar.MONTH) == birth.get(Calendar.MONTH) && today.get(Calendar.DAY_OF_MONTH) < birth.get(Calendar.DAY_OF_MONTH))) {
        age--;
    }

    return age;

}

   public person (String name , Date birthDate , String gender , float height , float weight, Nationality nationality ) {
       this.name=name;
       this.birthDate= birthDate ;
       this.gender = gender ;
       this.height = height;
       this.weight = weight;
       this.nationality = nationality;
   }

   public void displayInfo(){
        System.out.println("Name: " + name);
        System.out.println("Age: "+ calculateAge(birthDate) +"years");
        System.out.println("Gender: " + gender);
        System.out.println("Height: " + height + " m");
        System.out.println("Weight: " + weight + " KG");
        System.out.println("Nationality: " + nationality);

   }

  public static void main (String [] args){

      Calendar calendar = Calendar.getInstance();
      calendar.set(2000, Calendar.MARCH, 15);
      Date birthDate = calendar.getTime();

      person person = new person("Jean Dupont", birthDate, "Male", 1.75f, 70.0f, Nationality.FRANCE);

      person.displayInfo();
  }
}







