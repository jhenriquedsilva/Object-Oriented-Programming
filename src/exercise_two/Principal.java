package exercise_two;

public class Principal {

    // Question 1a
    public static double hypotenuse(double num1, double num2) {
        return Math.sqrt(num1 * num1 + num2 * num2);
    }

    // Question 1b
    public static int smallest(int num1, int num2, int num3) {
        if (num1 < num2 && num1 < num3) {
            return num1;
        } else if (num2 < num1 && num2 < num3) {
            return num2;
        } else {
            return num3;
        }
    }

    // Question 1c
    public static void instructions() {
        System.out.println("\nI don't return anything");
    }

    // Question 1d
    public static float intToFloat(int intNum) {
        return (float) intNum;
    }

    // Question 6
    public static double distance(double x1, double y1, double x2, double y2) {
        return Math.sqrt(Math.pow(x1 - x2, 2) + Math.pow(y1 - y2, 2));
    }

    public static void main(String args[]) {
        // Question 1a
        System.out.println("Hypotenuse is " + hypotenuse(4,3));

        // Question 1b
        System.out.println("\nThe minimum value is "+ smallest(13, 45, 56));

        // Question 1c
        instructions();

        // Question 1d
        System.out.println("\nI was an int, but I'm a float now: "+ intToFloat(10));
    }
}
