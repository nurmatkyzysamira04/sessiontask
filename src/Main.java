import classes.Person;
import enums.Country;
import enums.Food;
import enums.Status;
import impl.Personimpl;

import java.time.LocalDate;
import java.util.*;

public class Main {
    public static void main(String[] args) {
      ArrayList<Person>people=new ArrayList<>();
      people.add(new Person("Samira", LocalDate.of(2004,8,3), Status.CLIENT,5000, Country.USA));
      people.add(new Person("Ilim",LocalDate.of(2003,10,3),Status.HEAD_CHEF,0,Country.CHINA));
      people.add(new Person("Nuradil",LocalDate.of(2004,3,26),Status.KITCHEN_MANAGER,0,Country.GERMANY));
      people.add(new Person("Saikal",LocalDate.of(2004,5,14),Status.PASTRY,0,Country.USA));
      people.add(new Person("Yryskeldi",LocalDate.of(2003,12,8),Status.SOUS_CHEF,0,Country.GERMANY));
      people.add(new Person("Daniyar",LocalDate.of(2004,11,15),Status.WAITER,0,Country.CHINA));
      people.add(new Person("Aiturgan",LocalDate.of(2005,8,16),Status.WAITRESS,0,Country.USA));

      ArrayList<Food> foods=new ArrayList<>(List.of(Food.TASTY,Food.WATER,Food.FISH_SEAFOOF,Food.MEAT_POULSTRY));
      Personimpl personimpl=new Personimpl();


    while (true){
        System.out.println("--------------------");
        int num=new Scanner(System.in).nextInt();
        System.out.println("1.get Oll Person\n 2.get Oll Food\n 3.sort By price\n 4.remove By Food,5.Sort by status,6.Create Person 7. Pay For Food,");
        if (num==1){
            System.out.println(personimpl.getAllPerson(people));
        } else if (num==2) {
            System.out.println(personimpl.getAllFood(foods));

        } else if (num==3) {
            System.out.println(personimpl.sortByPrice(foods));

        } else if (num==4) {
            System.out.println(" Enter by name :");
            String name=new Scanner(System.in).nextLine();
            System.out.println(personimpl.removeByFood(foods,name));

        } else if (num==5) {
            System.out.println(personimpl.sortByPrice(foods));

        } else if (num==6) {
            System.out.println(personimpl.createPerson(people));

        } else if (num==7){
            System.out.println(personimpl.payForFood(foods, people));
        }
        else{
            System.out.println(" no such command ! ");
        }


    }





    }



}