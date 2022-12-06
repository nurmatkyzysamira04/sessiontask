package service;

import classes.Person;
import enums.Food;

import java.util.ArrayList;
import java.util.List;

public interface PersonInterface {
    String createPerson(ArrayList<Person>people);
    List<Person>getAllPerson(ArrayList<Person>people);
    List<Food> getAllFood(ArrayList<Food>foods);
    String sortByPrice(ArrayList<Food>foods);
    String removeByFood(ArrayList<Food>foods,String nameFood);
    void sortByStatus(ArrayList<Person>people);
    String payForFood(ArrayList<Food>foods, ArrayList<Person>people);

}
