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
        int index = 0;
        for (Person person : people) {
            if (person.getName() == name) {
                people.remove(index);
            }
            index++;
        }
    }

    // buscaPessoa
    public void findPerson(String name) {
        for (Person person : people) {
            if (person.getName() == name) {
                System.out.printf("%s position is %d%n%n",person.getName(),people.indexOf(person));
            }
        }
    }

    // imprimeAgenda
    public void showAdressBook() {
        for (Person person : people) {
            System.out.println(person);
            System.out.println();
        }
    }

    // imprimePessoa
    public void showPerson(int index) {
        if (index <= people.size()) {
            System.out.println(people.get(index));
            System.out.println();
        }
    }
}
