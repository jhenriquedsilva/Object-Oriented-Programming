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
    public void removePerson(Person person) {
        if (people.contains(person)) {
            people.remove(person);
        } else {
            System.out.println("This person does not exist");
        }
    }

    // buscaPessoa
    public int findPerson(Person person) {
        if (people.contains(person)) {
            return people.indexOf(person);
        } else {
            System.out.println("This person does not exist");
            return -1;
        }
    }

    // imprimeAgenda
    public void showAdressBook() {
        for (Person p : people) {
            System.out.println(p);
        }
    }

    // imprimePessoa
}
