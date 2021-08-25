package exercise_6;

public class AvarageAndStandardDeviation {

    // Question 3
    public static void calculates(double... numbers) {
        double average;
        double variance;
        double standardDeviation;
        double sum = 0;
        for (double number : numbers) {
            sum += number;
        }
        average = sum / numbers.length;
        System.out.printf("Avarage: %2f%n",average);

        sum = 0;
        for (double number : numbers) {
            sum += (number - average) * (number - average);
        }
        variance = sum / numbers.length;
        standardDeviation = Math.sqrt(variance);
        System.out.printf("Standard deviation: %2f",standardDeviation);
    }

    public static void main(String[] args) {
        calculates(4,4,4,4,4,4,4,4,4,4,4,4,4);
    }
}
