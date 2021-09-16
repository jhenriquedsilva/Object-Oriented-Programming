package challenge;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;


public class ReadTextFile {

    public static void main(String args[]) throws IOException {


        File file = new File("src/d14.txt");

        BufferedReader br = new BufferedReader(new FileReader(file));

        String expression;
        int counter = 1;
        while((expression = br.readLine()) != null) {
            String result = EvaluateString.evaluate(expression);
            try {
                System.out.println((int) Double.parseDouble(result));
            } catch (Exception e) {
                System.out.println(result);
            }
            counter++;
        }
    }
}
