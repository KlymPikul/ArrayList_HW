package Task_3;

public class FullTimeEmployee extends Employee implements Payable {
    private double salary;

    public FullTimeEmployee(String firstName, String lastName, double salary) {
        super(firstName, lastName);
        this.salary = salary;
    }

    @Override
    public double getSalary() {
        return salary * 0.9; // удерживаем 10% налога
    }
}
