package exercise_seven;

import java.util.Scanner;

public class Reverse {
    // Question 2
    public static String reverse(Integer number) {
        String reversed = "";
        String numberToString = number.toString();
        for (int i = numberToString.length() - 1; i >= 0; i--) {
            reversed += numberToString.charAt(i);
        }
        return reversed;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please, enter a number to reverse it");
        System.out.print("Type a number: ");
        Integer number = Integer.parseInt(sc.nextLine());

        System.out.printf("The number in reversed order looks like: %s", reverse(number));
        sc.close();
    }
}
