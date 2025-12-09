package lesson14;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

public class VersionDemo {
    public static void main(String[] args) {

            try (ObjectInputStream ois = new ObjectInputStream(
                    new FileInputStream("student.ser"))) {

                Student student = (Student) ois.readObject();
                System.out.println("Объект прочитан из файла: " + "student.ser");
                System.out.println(student.toString());

            } catch (IOException | ClassNotFoundException e) {
                System.out.println("Ошибка чтения: " + e.getMessage());
            }

    }
}
