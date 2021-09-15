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

        File file = new File("src/d14.txt");

        BufferedReader br = new BufferedReader(new FileReader(file));

        String st;
        while((st = br.readLine()) != null) {
            System.out.println(st);
        }
        /*
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
