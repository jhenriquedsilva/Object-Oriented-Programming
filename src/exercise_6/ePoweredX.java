package exercise_6;

import java.util.Scanner;

public class ePoweredX {
        // Question 5
        public static void calculates(int numberOfTerms, double x) {

            int counter = 0;
            double e = 0;
            while (counter < numberOfTerms) {
                if (counter == 0) {
                    e += 1;
                    counter++;
                } else {
                    e += Math.pow(x, counter) / (double) Factorial.calculatesFactorial(counter);
                    counter++;
                }

            }
            System.out.printf("O valor de e ^ x = %2f%n", e);
        }

        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            System.out.println("Este programa calcula o valor de 'e^x'");
            System.out.println("Para isso, informe o valor de 'x':");
            double x = Double.parseDouble(sc.nextLine());
            System.out.println("Informe a quantidade de termos da série infinita você deseja utilizar para fazer o cálculo:");
            int numberOfTerms = Integer.parseInt(sc.nextLine());
            calculates(numberOfTerms, x);
        }
}
