package exercise_three;

public class Principal {
    public static void main(String[] args) {

        // Question 1
        Person albert = new Person("Albert Einstein",14,3,1879);
        Person isaac = new Person("Isaac Newton",4,1,1643);
        albert.calculatesAge(29,7,2021);
        isaac.calculatesAge(29,7,2021);
        System.out.printf("Einstein is %d years old%n",albert.getAge());// Output -> Einstein is 142 years old
        System.out.printf("Newton is %d years old%n",isaac.getAge());// Output -> Newton is 378 years old

        // Question 2

        // Creating university
        University ufpa = new University("UFPA");
        // Creating first department
        Department icen = new Department("ICEN");
        Person henrique = new Person("Henrique Silva",24,04,1999);
        Person lauriany = new Person("Lauriany Laureiro",05,8,1995);
        icen.addPerson(henrique);
        icen.addPerson(lauriany);
        // Adding first department to university
        ufpa.addDepartment(icen);

        // Creating second department
        Department icsa = new Department("ICSA");
        Person laura = new Person("Laura Montenegro",4,3,1997);
        Person rafael = new Person("Rafael Matos",23,2,1993);
        icsa.addPerson(laura);
        icsa.addPerson(rafael);
        // Adding second department to university
        ufpa.addDepartment(icsa);

        // Creating third department
        Department ilc = new Department("ILC");
        Person sergio = new Person("Sérgio Pinto",4,11,1971);
        Person gabriel = new Person("Gabriel Silva",15,6,1989);
        ilc.addPerson(sergio);
        ilc.addPerson(gabriel);
        // Adding third department to university
        ufpa.addDepartment(ilc);
    }
}
