package CA225;

public class Student extends Person {
    private int marks;

    Student() {
        //super("Mohamed abdullahi", "Hodan", 20);
        //this("Mohamed abdullahi", "Hodan", 20 , 99);
        System.out.println("Student No-arg Constructor!");
    }
    Student (String name , String address , int age , int marks){
        super(name , address , age);
        this.marks=marks;
        System.out.println("Student with-arg Constructor!");
    }

    //printInfo
    void printInfo(){
        super.display();
        System.out.println("marks: " + marks);
    }

    //main method
    public static void main(String[] args) {

        Student s1 = new Student("Abdirahman" , "Howlwadaag" , 79,99);
        s1.printInfo();

    }
}
