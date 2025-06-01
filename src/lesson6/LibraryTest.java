package lesson6;

public class LibraryTest {
    public static void main(String[] args) {
        Book book1 = new Book("Война и мир", "Лев Толстой", 1225);
        Book book2 = new Book("1984", "Джордж Оруэлл", 328);

        book1.printInfo();
        book2.printInfo();
    }
}
