package exercise_6;

public class Main {
    public static void main(String[] args) {

        // Question 1a
        int sum = 0;
        for (int number = 0;number <= 100;number++) {
            sum+= number;
            System.out.println(number);
        }
        System.out.println(sum);

        // Question 1b
        sum = 0;
        int number = 0;
        while (number <= 100) {
            sum += number;
            System.out.println(number);
            number++;
        }
        System.out.println(sum);
    }
}
