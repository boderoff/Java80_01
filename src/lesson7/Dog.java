package lesson7;

public class Dog extends Animal{
    @Override
    public void makeSound() {
        System.out.println("ГАВ-ГАВ");;
    }

    public Dog(String name) {
        super(name);
    }
    public void fetch() {
        System.out.println("Собака принесла палку.");
    }
}
