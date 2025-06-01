package lesson7;

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
