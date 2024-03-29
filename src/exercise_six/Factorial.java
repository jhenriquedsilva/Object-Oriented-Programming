package exercise_six;

import java.util.Scanner;
// Question 2
public class Factorial {

    public static int calculatesFactorial(int number) {
        int factorial = 1;
        if (number == 0 || number == 1) {
            return factorial;
        } else {
            while (number > 1) {
                factorial *= number;
                number--;
            }
        }
        return factorial;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.printf("Enter a number to calculate its factorial:%n");
        int number = Integer.parseInt(sc.nextLine());
        Factorial factorial = new Factorial();
        int result = factorial.calculatesFactorial(number);
        System.out.printf("Factorial equals %d",result);
    }
}
