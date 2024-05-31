package homework6.task2;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Runnable {

    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            String line = readStringFromConsole(scanner);
            File textFile = new File("tms.txt");
            writeLineInFile(textFile, line);
            readLineFromFileAndPrint(textFile);
        }
    }

    private static void readLineFromFileAndPrint(File textFile) {
        try (Scanner scanner = new Scanner(textFile)) {
            String line = scanner.nextLine();
            printLineWithoutSpaces(line);

        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private static void printLineWithoutSpaces(String line) {
        String replacedString = line.replace(" ", "_");
        System.out.println(replacedString);
    }

    private static void writeLineInFile(File file, String line) {
        try (FileWriter fileWriter = new FileWriter(file)) {
            fileWriter.write(line);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static String readStringFromConsole(Scanner scanner) {
        return scanner.nextLine();
    }
}
