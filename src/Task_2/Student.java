package Task_2;

public class Student implements Gradeable {
    private String name;
    private int age;
    private int grade;

    public Student(String name, int age, int grade) {
        this.name = name;
        this.age = age;
        this.grade = grade;
    }

    @Override
    public int getGrade() {

        return grade;
    }

    @Override
    public String toString() {

        return name + " - " + age + " years, grade " + grade;
    }

}

