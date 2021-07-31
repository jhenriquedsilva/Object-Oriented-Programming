package exercise_three;

public class Person {

    private int age, birthDay, birthMonth, birthYear;
    private String name;

    public Person(String name, int birthDay, int birthMonth, int birthYear) {
        this.birthDay = birthDay;
        this.birthMonth = birthMonth;
        this.birthYear = birthYear;
        this.name = name;
    }

    // calculaIdade
    public void calculatesAge(int currentDay, int currentMonth, int currentYear) {
        int age;
        if (currentMonth < birthMonth) {
            age = currentYear - birthYear - 1;
        } else if (currentMonth == birthMonth){
            if (currentDay < birthDay) {
                age = age = currentYear - birthYear - 1;
            } else {
                age = age = currentYear - birthYear;
            }
        } else {
            age = currentYear - birthYear;
        }
        this.age = age;
    }

    // informaIdade
    public int getAge() {
        return this.age;
    }

    // informaNome
    public String getName() {
        return this.name;
    }

    // ajustaDataDeNascimento
    public void fixBirthDate(int newBirthDay, int newBirthMonth, int newBirthYear) {
        this.birthDay = newBirthDay;
        this.birthMonth = newBirthMonth;
        this.birthYear = newBirthYear;
    }

    @Override public String toString() {
        return String.format(
                "Name: %s%nBirthdate: %d/%d/%d%nAge: %d",
                this.name, this.birthDay, this.birthMonth, this.birthYear,this.age
        );
    }

}
