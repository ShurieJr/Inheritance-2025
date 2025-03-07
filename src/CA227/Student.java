package CA227;

public class Student extends Person{
    Student(){
        this("ali");
        System.out.println("Student no-arg constructor!");
    }
    Student(String name){
        super(40,"Gedi" , "waaberi");
        System.out.println("parametrized Student Constructor!");
    }
}
