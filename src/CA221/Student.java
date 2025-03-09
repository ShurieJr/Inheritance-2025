package CA221;

public class Student extends Person{
    private int marks;

    Student(){
        //super();
        this(90);
//        System.out.println("Student no-arg constructor!");
    }
    Student(int value){
        //super("Gedi" , "calikamiin" , 89);
        marks = value;
        System.out.println("Student with arg constructors");
    }
    //printInfo
    void printInfo(){
        super.display();
        System.out.println("marks: " + marks);
    }

    //main method
    public static void main(String[] args) {
        Student std = new Student(89);
        std.printInfo();

    }
}
