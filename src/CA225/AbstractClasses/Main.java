package CA225.AbstractClasses;

public class Main {
    public static void main(String[] args) {
        Student std = new Student("Gedi" , -23 , 99);
        //std.setAge(-3);
        Teacher tc = new Teacher("c++");

        std.printInfo();
        System.out.println("-------------");
        tc.printInfo();


    }
}
