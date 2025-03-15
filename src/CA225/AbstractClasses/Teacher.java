package CA225.AbstractClasses;

public class Teacher extends Person{
    private String subject;

    Teacher(String subject){
        this.subject = subject;
    }

    @Override
    void printInfo() {
        System.out.println("Teacher name: " + getName());
        System.out.println("Age: " + getAge());
        System.out.println("Subjcet : " + subject);
    }
}
