package exercise_six;
import java.util.Scanner;

public class eConstant {
    // Question 4
    public static void calculates(double numberOfTerms) {

        int counter = 0;
        double e = 0;
        while (counter < numberOfTerms) {
            e += 1 / (double) Factorial.calculatesFactorial(counter);
            counter++;
        }

        System.out.printf("Constant e = %2f%n",e);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Informe a quantidade de termos que você deseja calcular:");
        int numberOfTerms = Integer.parseInt(sc.nextLine());
        calculates(numberOfTerms);
    }
}
