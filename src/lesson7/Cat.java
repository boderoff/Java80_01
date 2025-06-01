package lesson7;

public class Cat extends Animal{
    public void makeSound() {
        System.out.println("Мяу-Мяу");
    }

    public Cat(String name) {
        super(name);
    }
    public void scratch() {
        System.out.println("Кошка царапает стенки, пиздец.");
    }
}
