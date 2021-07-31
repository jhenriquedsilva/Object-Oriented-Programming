package exercise_three;

import java.util.ArrayList;

public class AdressBook {

    private ArrayList<Person> people = new ArrayList<Person>();

    // armazenaPessoa
    public void addPerson(Person person) {
        if (this.people.size() <= 10) {
            people.add(person);
        } else {
            System.out.println("The adress book is already full. Can't add more people");
        }
    }

    // removePessoa
    public void removePerson(String name) {
        for (Person person : people) {
            if (person.getName() == name) {
                people.remove(person);
            }
        }
    }

    // buscaPessoa
    public int findPerson(String name) {
        for (Person person : people) {
            if (person.getName() == name) {
                return people.indexOf(person);
            }
        }
        System.out.println("This person does not exist");
        return -1;
    }

    // imprimeAgenda
    public void showAdressBook() {
        for (Person person : people) {
            System.out.println(person);
        }
    }

    // imprimePessoa
    public void showPerson(int index) {
        if (index <= people.size()) {
            System.out.println(people.get(index));
        }
    }
}
