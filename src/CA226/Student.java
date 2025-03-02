package CA226;

public class Student extends Person{
    private int marks;

    Student(){
//        super("Gedi" , 34 , "Waaberi");
        marks = 90;
        System.out.println("Student no argument constr");
    }
    Student(String name , int age , String address , int marks){
        super(name , age , address);
        this.marks = marks;
    }

    //method
    void printInfo(){
        display();
        System.out.println("Marks:  " + marks);
    }

    public static void main(String[] args) {
        Student s1 = new Student();
    }
}
