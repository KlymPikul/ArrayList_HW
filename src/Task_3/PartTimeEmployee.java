package Task_3;

public class PartTimeEmployee extends Employee implements Payable {
    private double perHour;
    private double totalTime;

    public PartTimeEmployee(String firstName, String lastName, double perHour, double totalTime) {
        super(firstName, lastName);
        this.perHour = perHour;
        this.totalTime = totalTime;
    }

    @Override
    public double getSalary() {

        return perHour * totalTime; // рассчитываем з/п сотрудника
    }
}
