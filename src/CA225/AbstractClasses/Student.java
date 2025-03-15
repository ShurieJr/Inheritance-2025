package CA225.AbstractClasses;

public class Student extends Person{
    private double grade;

    Student(String name , int age, double grade){
        super(name , age);
        this.grade = grade;
    }


    void printInfo() {
        System.out.println("student name: " + getName());
        System.out.println("Student age: " + getAge());
        System.out.println("Grade: " + grade);
    }
}
