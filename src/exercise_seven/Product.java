package exercise_seven;

import java.util.Scanner;

public class Product {
    public static Integer product(Integer... args) {
        Integer product = 1;
        for (int i = 0; i < args.length; i++) {
            product *= args[i];
        }
        return product;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.printf("The product among the numbers is: %d%n", product(1,2,4));
        System.out.printf("The product among the numbers is: %d%n", product(1,2,4,5));
        System.out.printf("The product among the numbers is: %d", product(1,2,4,5,4));
        sc.close();
    }
}
