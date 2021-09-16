package challenge;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.lang.IllegalCallerException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.NoSuchElementException;
import java.util.Scanner;

public class ReadTextFile {

    public static void main(String args[]) throws IOException {

        System.out.println(EvaluateString.evaluate("4 / (54 - (9 * 6))"));
        /*
        File file = new File("src/d14.txt");

        BufferedReader br = new BufferedReader(new FileReader(file));

        String expression;
        int counter = 1;
        while((expression = br.readLine()) != null) {
            String result = EvaluateString.evaluate(expression);
            System.out.printf("The result of the %d° expression is %2s%n",counter, result);
            counter++;
        }

        try(Scanner input = new Scanner(Paths.get("d14"))) {
            while(input.hasNextLine()) {
                System.out.println(input.nextLine());
            }
        } catch(IOException | NoSuchElementException | IllegalStateException e) {
            e.printStackTrace();
        }
        */
    }
}
