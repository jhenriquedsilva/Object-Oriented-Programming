package exercise_two;

import java.util.Scanner;

public class IsEven {

    // Question 4

    public static boolean isEven(int number) {
        return number % 2 == 0;
    }

    public static void main(String args[]) {

        Scanner sc = new Scanner(System.in);
        String answer = "s";

        do {
            System.out.println("Informe um número inteiro para saber se ele é par ou ímpar: ");
            int number = sc.nextInt();
            if (isEven(number)) {
                System.out.printf("%d is even!%n", number);
            } else {
                System.out.printf("%d is odd!%n", number);
            }

            System.out.println("Se deseja fazer mais uma verificação, digite qualquer tecla");
            System.out.println("Se deseja sair, digite 'n': ");
            answer = sc.next();

        } while (!answer.equals("n"));
    }
}
