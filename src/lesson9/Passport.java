package lesson9;

public class Passport {
    int age;

    public Passport(int age) throws InvalidAgeException {
        if (age < 0 || age > 150) {
            throw new InvalidAgeException();
        }
        this.age=age;
    }
}
