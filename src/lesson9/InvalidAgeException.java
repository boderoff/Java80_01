package lesson9;

public class InvalidAgeException extends Exception{
    public InvalidAgeException() {
        super("Недопустимый возраст: возраст должен быть от 0 до 150 лет.");
    }

    public InvalidAgeException(String message) {
        super(message);
    }
}
