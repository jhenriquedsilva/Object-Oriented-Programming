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

        System.out.println();

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

        // Question 3
        AdressBook ab = new AdressBook();
        ab.addPerson(sergio);
        ab.addPerson(lauriany);
        ab.addPerson(henrique);
        ab.showAdressBook();
        ab.removePerson("Lauriany Laureiro");
        ab.showAdressBook();
        ab.findPerson("Sérgio Pinto");
        ab.showPerson(1);

        // Question 4
        Elevator elevator = new Elevator(10, 15);
        System.out.println(elevator.getCurrentFloor());
        System.out.println(elevator.getCurrentNumberOfPassengers());
        elevator.getIn();
        elevator.getIn();
        System.out.println(elevator.getCurrentNumberOfPassengers());
        elevator.goUp();
        System.out.println(elevator.getCurrentFloor());
        elevator.goUp();
        elevator.goUp();
        elevator.goDown();
        elevator.getOut();
        System.out.println(elevator.getCurrentFloor());
        System.out.println(elevator.getCurrentNumberOfPassengers());
        System.out.println();

        // Question 5
        // Creating a television
        Television tv = new Television();
        tv.remote.showCurrentChannel();
        tv.remote.showCurrentVolume();
        tv.remote.turnVolumeDown();
        tv.remote.showCurrentVolume();
        tv.remote.turnUpChannel();
        tv.remote.showCurrentChannel();
        tv.remote.turnToChannel(75);
        tv.remote.showCurrentChannel();

        // Program execution
        /*
        Einstein is 142 years old
        Newton is 378 years old

        Name: Sérgio Pinto
        Birthdate: 4/11/1971
        Age: 0

        Name: Lauriany Laureiro
        Birthdate: 5/8/1995
        Age: 0

        Name: Henrique Silva
        Birthdate: 24/4/1999
        Age: 0

        Name: Sérgio Pinto
        Birthdate: 4/11/1971
        Age: 0

        Name: Henrique Silva
        Birthdate: 24/4/1999
        Age: 0

        Sérgio Pinto position is 0

        Name: Henrique Silva
        Birthdate: 24/4/1999
        Age: 0

        0
        0
        A peron got in
        A peron got in
        2
        Going up
        1
        Going up
        Going up
        Going down
        A peron got out
        2
        1

        Searching for current channel...
        Channel number is 5.
        Searching for current volume...
        Current volume is 50.
        Turning the volume down
        Searching for current volume...
        Current volume is 49.
        Turning up the channel
        Searching for current channel...
        Channel number is 6.
        Turning to a new channel
        Searching for current channel...
        Channel number is 75.
         */

    }
}
