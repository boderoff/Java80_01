package lesson9;

public class PassportTest {
    public static void main(String[] args) {
        testAge(12);
        testAge(-1);
        testAge(151);
    }
    public static void testAge(int age) {
        try {
            Passport p = new Passport(age);
            System.out.println("Пасспорт создан, возраст: " + age);
        } catch (InvalidAgeException e) {
            System.err.println("Введенный возраст: "+ age + " " + e.getMessage());
        }
    }

}
