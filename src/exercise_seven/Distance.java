package exercise_seven;

import java.util.Scanner;
// Question 3
public class Distance {
    public static Double distance(Double x1, Double y1, Double x2, Double y2) {

        return Math.sqrt(Math.pow(x1 - x2, 2) + Math.pow(y1 - y2, 2));
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("This program claculates the distance 2 points in the cartesian plane by knowing their coordinates");
        System.out.println("Please, enter the coordinates for point 1. ");
        System.out.print("x axis: ");
        Double x1 = Double.parseDouble(sc.nextLine());
        System.out.print("y axis: ");
        Double y1 = Double.parseDouble(sc.nextLine());

        System.out.println("Please, enter the coordinates for point 2.");
        System.out.print("x axis: ");
        Double x2 = Double.parseDouble(sc.nextLine());
        System.out.print("y axis: ");
        Double y2 = Double.parseDouble(sc.nextLine());

        System.out.printf("The distance between these points is: %2f", distance(x1,y1,x2,y2));
        sc.close();
    }
}
