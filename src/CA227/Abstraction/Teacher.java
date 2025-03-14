package CA227.Abstraction;

public class Teacher extends Person{
    private String subject;
    Teacher(String name , int age , String subject)
    {
       super(name , age);
       this.subject = subject;
    }

    //override display method


    void displayInfo() {
        System.out.println("Teacher name: " + getName());
        System.out.println("Teacher age: " + getAge());
        System.out.println("subject: "  + subject);
    }
}
