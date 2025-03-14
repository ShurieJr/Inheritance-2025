package CA227.Abstraction;

public class Student extends Person{

    private int grade;
    Student(String name , int age , int grade){
      super(name , age);
      this.grade = grade;
    }
    @Override
    void displayInfo() {
        System.out.println("name: " + getName());
        System.out.println("Age: " + getAge());
        System.out.println("Grade: " + grade);
    }
}
