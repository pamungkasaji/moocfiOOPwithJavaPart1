/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.util.ArrayList;
import java.util.Iterator;

public class Phonebook {

    private ArrayList<Person> people;

    public Phonebook() {
        people = new ArrayList<>();
    }

    public void add(String name, String number) {
        Person person = new Person(name, number);
        people.add(person);
    }

    public void printAll() {
        for (Person person : people){
            System.out.println(person.getName() + " number: " + person.getNumber());
        }
    }

    public String searchNumber (String name) {
        for (Person person : people){
            if (person.getName().equals(name)){
                return person.getNumber();
            }
        }
        return "number not known";
    }
}
