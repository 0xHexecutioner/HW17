package sample;

import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
      

        System.out.println("Input text. (Enter 'exit' for save):");

        StringBuilder text = new StringBuilder();
        String line;
        

        while (!(line = scanner.nextLine()).equals("exit")) {
            text.append(line).append("\n");
        }
        String userDirectory = System.getProperty("user.home") + "/Documents/";

        System.out.println("Enter the file name to save:");
        String filename = scanner.nextLine();
        

        try (FileWriter writer = new FileWriter(filename)) {
            writer.write(text.toString());
            System.out.println("Text saved " + filename);
        } catch (IOException e) {
            System.out.println("Saving error.");
        }
    }
}
