package exercise_three;

import java.util.ArrayList;

public class Department {
    private String name;
    private ArrayList<Person> people = new ArrayList<Person>();

    public Department(String name) {
        this.name = name;
    }

    public String getName() {
        return this.name;
    }

    public boolean addPerson(Person person) {
        people.add(person);
        return true;
    }
}