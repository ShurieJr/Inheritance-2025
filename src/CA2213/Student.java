package CA2213;

public class Student extends Person {

    private int marks;

//    Student(){
//        marks = 100;
//        System.out.println("Student No-arg Constructor!");
//    }
    Student(String name , int age , String tel ,int marks){
        super(name, age  , tel);
        this.marks = marks;
    }

    void printInfo(){
        display();
        System.out.println("Marks: " + marks);
    }
    public static void main(String[] args) {


    }
}
