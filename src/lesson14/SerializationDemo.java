package lesson14;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class SerializationDemo {
    public static void main(String[] args) {
        try(ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("student1.ser"))){
            Student s = new Student("Ivan", 20, "mypassword","www@gm.com");
            System.out.println(s.toString());
            oos.writeObject(s);
            System.out.println("Объект успешно записан в файл");
        }catch (Exception ex) {
            System.out.println(ex.getMessage());
        }

        try(ObjectInputStream ois = new ObjectInputStream(new FileInputStream("student1.ser"))){
            Student p = (Student)ois.readObject();
            System.out.println(p.toString());
        }catch (Exception ex){
            System.out.println(ex.getMessage());
        }


    }
}
