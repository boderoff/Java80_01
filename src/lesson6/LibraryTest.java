package lesson6;

public class LibraryTest {
    public static void main(String[] args) {
        Book book1 = new Book("Война и мир", "Лев Толстой", 1225);
        Book book2 = new Book("", "Джордж Оруэлл", 328);

        book1.printInfo();
        book2.printInfo();

        book2.setTitle("1984");
        book2.printInfo();
    }
}
