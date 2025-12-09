package lesson14;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.List;
import java.util.Scanner;

public class FileStats {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите путь к файлу: ");
        String dir = scanner.nextLine();
        File file = new File(dir);
//        try {
//            List<String> lines = Files.readAllLines(Path.of(dir));
//            int countLines = lines.size();
//            System.out.println("Количество строк в файле = " + countLines);
//        } catch (IOException ex) {
//            System.out.println(ex.getMessage());
//        }
        try (BufferedReader br = new BufferedReader(new FileReader(file))) {
            String line;
            int countS = 0;
            int countL = 0;
            while ((line = br.readLine()) != null) {
                System.out.println(line);
                String[] lineS = line.split("\\W+");
                countS = countS + lineS.length;
                countL++;
            }
            System.out.println("Количество строк в файле = " + countL);
            System.out.println("Количество слов в файле = " + countS);
        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        }
    }
}
