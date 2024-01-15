package Task_2;

import java.util.ArrayList;
import java.util.List;
/*
Журнал оценок студентов:

Условие: Необходимо создать класс Student со свойствами name, age и grade. Добавьте метод grade, который возвращает оценку.
Создайте ArrayList из 5 студентов. Найдите объект студента с максимальной оценкой.
 */
public class Main {
    public static void main(String[] args) {

        Student student1 = new Student("Klym", 34, 93);
        Student student2 = new Student("Hayk", 28, 92);
        Student student3 = new Student("Vika", 21, 78);
        Student student4 = new Student("Maryna", 31, 95);
        Student student5 = new Student("Dima", 20, 88);


        List<Student> students = new ArrayList<>();
        students.add(student1);
        students.add(student2);
        students.add(student3);
        students.add(student4);
        students.add(student5);

        // поиск студента с максимальной оценкой
        MaxGradeFinder<Student> maxGradeFinder = new MaxGradeFinder<>();
        Student studentMaxGrade = maxGradeFinder.findMaxGrade(students);

        System.out.println("Student With Max Grade: ");
        System.out.println(studentMaxGrade);
    }
}
