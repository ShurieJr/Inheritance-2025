package CA227.Abstraction;

public class Main {
    public static void main(String[] args) {
        Student std = new Student("Mohamed abdullahi" , 34, 90);
        Teacher tc = new Teacher("Abdifitah ahmed" , 45 , "C++");
        std.displayInfo();
        System.out.println("------------------");
        tc.displayInfo();
    }
}
