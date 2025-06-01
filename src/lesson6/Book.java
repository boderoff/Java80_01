package lesson6;

public class Book {
    private String title, author;
    private int pages;
    public Book(String title, String author, int pages) {
        this.title = title;
        this.author = author;
        this.pages = pages;
    }
    public void printInfo() {
        System.out.println("\"" + title + "\" — " + author + ", страниц: " + pages);
    }
    public void getTitle(){
        System.out.println("Название книги: " + title);
    }
    public void getAuthor() {
        System.out.println("Автор книги: " + author);
    }
    public void fetPages() {

    }
}
