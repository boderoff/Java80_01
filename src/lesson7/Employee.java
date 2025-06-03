package lesson7;

public class Employee extends Person{
    private String company;

    public Employee(String name, int age, String company) {
        super(name, age);
        this.company = company;
    }

    @Override
    public String toString() {
        return "Employee{" + super.toString().substring(7, super.toString().length() - 1) + ", company= " + company + "}";
    }

    public static void main(String[] args) {
        Employee emp1 = new Employee("Vlad", 23, "Alfa-bank");
        System.out.println(emp1.toString());
        emp1.celebrateBD();
        System.out.println(emp1.toString());
    }
}
