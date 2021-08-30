package exercise_seven;
import java.util.Scanner;
public class Minimum {
    // Question 1
    public static Double minimum(Double number1, Double number2, Double number3) {
        return Math.min(number1, Math.min(number2, number3));
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please, enter three numbers to check the least one");
        System.out.print("First number: ");
        Double n1 = Double.parseDouble(sc.nextLine());
        System.out.print("Second number: ");
        Double n2 = Double.parseDouble(sc.nextLine());
        System.out.print("Third number: ");
        Double n3 = Double.parseDouble(sc.nextLine());

        System.out.printf("The least number among them is: %2f",minimum(n1,n2,n3));
        sc.close();
    }

}
