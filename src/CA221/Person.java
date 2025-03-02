package CA221;

public class Person {
    //variables
    private String name , addess;
    private int age;
    //constructors
    Person(){
        name= "Mohamed ali";
        addess = "waaberi";
        age = 34;
        System.out.println("person no-arg constructor!");
    }

    public Person(String newName, String addess, int age) {
        name = newName;
        this.addess = addess;
        this.age = age;
    }
//methods
    void display(){
        System.out.println("name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Address: " + addess);
    }
    //toString

    @Override
    public String toString() {
        return "Person{" +
                "age=" + age +
                ", addess='" + addess + '\'' +
                ", name='" + name + '\'' +
                '}';
    }
}
