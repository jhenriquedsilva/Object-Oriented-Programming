package exercise_6;

public class CalculatesS {
    // Question 7
    public static void calculatesS() {

        Double S = 0.0;
        int counter1 = 1;
        int counter2 = 0;
        double denominator = 1;
        int numerator = 4;
        int numberOfTerms = 0;

        while (counter1 <= 200000) {
            System.out.printf("S = %2f%n", S);
            if (counter1 == 1) {
                S += numerator / denominator;
                denominator += 2;
                counter1++;
            } else if (counter1 % 2 == 0) {
                S -= numerator / denominator;
                denominator += 2;
                counter1++;
            } else {
                S += numerator / denominator;
                denominator += 2;
                counter1++;
            }

            if (S.toString().length() == 7) {
                if (S.toString().substring(0, 7).equals("3,14159") && counter2 == 0) {
                    numberOfTerms = counter1;
                    counter2++;
                }
            }
        }

        System.out.printf("S using the 200000 first terms = %2f%n", S); // Output: S using the 200000 first terms = 3,141588
        System.out.printf("It's necessary %d terms to get a value equal to or less than 3.14159%n", numberOfTerms); // Não consegui alcançar o resultado correto.
    }

    public static void main(String[] args) {
        calculatesS();
    }
}
