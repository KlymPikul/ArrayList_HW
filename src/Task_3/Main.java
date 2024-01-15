package Task_3;
import java.util.ArrayList;
import java.util.List;
/*
Хранение истории заказов в интернет-магазине:

Условие: Необходимо создать класс Employee со свойствами firstName и lastName и методом info, который возвращает строку с именем и фамилией сотрудника.
Создайте класс PartTimeEmployee и FullTimeEmployee, которые наследуются от Employee. Помимо свойств и методов Employee данные классы должны иметь. PartTimeEmployee:
свойство perHour (ставка за час)
свойство totalTime (кол-во отработанных часов)
метод getSalary (метод возвращает произведение отработанных часов и ставку)
FullTimeEmployee:

свойство salary (зарплата)
метод getSalary (метод возвращает зп удержав 10 процентов налога)
Создайте массив ArrayList из 5 сотрудников (среди которых и PartTimeEmployee и FullTimeEmployee) и найдите общую зарплату, которую получат все сотрудники.
 */
public class Main {
    public static void main(String[] args) {

        List<Employee> employees = new ArrayList<>();
        employees.add(new PartTimeEmployee("Hayk", "XXX", 500, 40));
        employees.add(new PartTimeEmployee("Mark", "Pikul", 400, 20));
        employees.add(new FullTimeEmployee("Nikol", "Pikul", 80000));
        employees.add(new FullTimeEmployee("Klym", "Pikul", 90000));
        employees.add(new FullTimeEmployee("Maryna", "Pikul", 75000));

        double totalSalary = 0.0;
        for (Employee employee : employees) {
            if (employee instanceof Payable) {
                totalSalary += ((Payable) employee).getSalary();
            }
        }

        System.out.println(totalSalary + " $ ");
    }
}
