package lesson7;

public class Person {
    private String name;
    private int age;
    private String city;
    public Person(String name, int age){
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String getCity() {
        return city;
    }

    public Person(String name, int age, String city){
        this.name = name;
        this.age = age;
        this.city = city;
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
