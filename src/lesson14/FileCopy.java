package lesson14;

import java.io.*;
import java.nio.file.*;

public class FileCopy {
    public static void main(String[] args) {
        File dir1 = new File("C:/Users/Vladislav Bodrov/Desktop/IDEA");;
        File file1 = new File(dir1, "input.txt");
        File file2 = new File(dir1, "output.txt");
//        Path filePath = Paths.get("C:/Users/Vladislav Bodrov/Desktop/IDEA/input.txt");
        try (BufferedReader br = new BufferedReader(new FileReader(file1))) {
            try (BufferedWriter bw = new BufferedWriter(new FileWriter(file2))) {
                String line;
                while ((line = br.readLine()) != null) {
                    System.out.println(line);
                    bw.write(line);
                    bw.newLine();
                }
                System.out.println("Файл успешно скопирован");
            }
        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        }
    }

}
