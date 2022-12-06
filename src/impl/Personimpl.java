package impl;

import classes.Person;
import enums.Food;
import enums.Status;
import impl.Commorator.Comporator;
import service.PersonInterface;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Personimpl implements PersonInterface {

    @Override
    public String createPerson(ArrayList<Person> people) {
        ArrayList<Person> createRerson = new ArrayList<>();
        for (Person person : people) {
            createRerson.add(person);
            System.out.println(createRerson);

        }
        return "Person successful created";
    }

    @Override
    public List<Person> getAllPerson(ArrayList<Person> people) {
        return people;
    }

    @Override
    public List<Food> getAllFood(ArrayList<Food> foods) {
        return foods;
    }

    @Override
    public String sortByPrice(ArrayList<Food> foods) {
        Comporator comporator = new Comporator();
        foods.sort(comporator);
        for (Food food : foods) {
            System.out.println(food+" ");
        }
        return "Successful sort a price";
    }

    @Override
    public String removeByFood(ArrayList<Food> foods, String nameFood) {
        for (Food food : foods) {
            if (nameFood.toLowerCase().equals(food.name())) {
                foods.remove(food);
            }


        }
        return "food successful remove";
    }

    @Override
    public void sortByStatus(ArrayList<Person> people) {
        ArrayList<Person> client = new ArrayList<>();
        ArrayList<Person> chef = new ArrayList<>();
        for (Person person : people) {
            if (person.getStatus().equals(Status.CLIENT)) {
                client.add(person);
            } else {
                chef.add(person);
            }
        }
        System.out.println("client array:");
        System.out.println(client);
        System.out.println("-------------");
        System.out.println("chef array");
        System.out.println( chef);
        System.out.println("successful sort by status");


    }

    @Override
    public String payForFood(ArrayList<Food> foods, ArrayList<Person> people) {
        Person clientPerson = null;
        for (Person person : people) {
            if (person.getStatus().equals(Status.CLIENT)) {
                clientPerson = person;
            }
        }
        double summa = 0;
        for (Food food : foods) {
            summa += food.getPrice();
        }

        double bankAccount = clientPerson.getBankAccount() - summa;
        clientPerson.setBankAccount(bankAccount);

        int counter = 0;
        for (Person person : people) {
            if (!(person.getStatus().equals(Status.CLIENT))) {
                counter++;
            }
        }

        double salary = summa / counter;
        for (Person person : people) {
            if (!(person.getStatus().equals(Status.CLIENT))) {
                person.setBankAccount(person.getBankAccount() + salary);
            }
        }

        return "Money  successful take away";
    }
}