package lesson7;

public class Person {
    private String name;
    private int age;
    public Person(String name, int age){
        this.name = name;
        this.age = age;
    }

    @Override
    public String toString() {
        return "Person{name= " + name + ", age= " + age + "}";
    }
    public void celebrateBD(){
        age++;
        System.out.println("С др!");
    }
}
