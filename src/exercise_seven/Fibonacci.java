package exercise_seven;

import java.util.Scanner;

public class Fibonacci {
    public static Integer fibonacci(Integer position) {

        if (position == 0) {
            return 0;
        }

        if (position == 1 || position == 2) {
            return 1;
        }

        return fibonacci(position - 1) + fibonacci(position - 2);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("This program returns the term from the Fibonacci series by giving its position.");
        System.out.println("The first term is at position 0.");
        System.out.print("Please, enter the of the term that you want to know: ");
        Integer position = Integer.parseInt(sc.nextLine());

        System.out.printf("The term at position %d is: %d", position, fibonacci(position));
        sc.close();
    }
    // Program running
    /*
     * This program returns the term from the Fibonacci series by giving its position.
     * The first term is at position 0.
     * Please, enter the of the term that you want to know: 10
     * The term at position 10 is: 55
     */
}
