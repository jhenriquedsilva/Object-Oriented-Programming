package exercise_two;

import java.util.Scanner;

public class TemperatureConverter {

    // Question 5a
    public static double celsius(double fahrenheit) {
        return 5.0 / 9.0 * (fahrenheit - 1);
    }

    // Question 5b
    public static double fahrenheit(double celsius) {
        return 9.0 / 5.0 * celsius + 32;
    }

    // Question 5c
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("I'm a temperature converter");
        System.out.println("You can convert from fahrenheit to celsius [type 1]");
        System.out.println("Or from celsius to fahrenheit [type 2]");

        System.out.println("Please, choose an option: ");
        int input = sc.nextInt();

        System.out.println("Enter a temperature to be converted: ");
        double temperature = sc.nextDouble();

        if (input == 1) {
            System.out.printf("This temperature is %2f degrees celsius", celsius(temperature));
        } else {
            System.out.printf("This temperature is %2f degrees fahrenheit", fahrenheit(temperature));
        }
    }
}
