package lesson7;

class Animal {
    private String name;

    public Animal(String name) {
        this.name = name;
    }
    public void makeSound() {
        System.out.println("Гав, или мяу, кароче какой-то звук.");
    }
}

class Cat extends Animal{
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

class Dog extends Animal{
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

public class Zoo {
    public static void main(String[] args) {
        Animal[] animals = {
                new Dog("Бобик"),
                new Cat("Барсик")
        };

        for (Animal animal : animals) {
            animal.makeSound();

            if (animal instanceof Dog dog) {
                dog.fetch();
            }
            else if (animal instanceof Cat cat) {
                cat.scratch();
            }
        }
    }
}
