package exercise_three;

public class Person {
    private int age, birthDay, birthMonth, birthYear;
    private String name;

    // I have to improve this
    public void calculatesAge(int currentDay, int currentMonth, int currentYear) {
        int ageInDays = 0;
        int yearsInDays = (currentYear - birthYear) * 360;
        int monthsInDays = (currentMonth - birthMonth) * 30;
        int days = currentDay - birthYear;
        this.age = (yearsInDays + monthsInDays + days) / 360;
    }

    public int provideAge() {
        return age;
    }

    public String provideName() {
        return this.name;
    }

    public void resetBirthDate(int newBirthDay, int newBirthMonth, int newBirthYear) {
        this.birthDay = newBirthDay;
        this.birthMonth = newBirthMonth;
        this.birthYear = newBirthYear;
    }
}
