package CA227;

public class Person {
    //variables
    private int age;
    private String name , address;

    //constructors
Person(){
    age = 20;
    name = "Abdullahi";
    address = "Howlwadaag";
    System.out.println("Person no-arg constructor!");
}
Person(int age , String name , String address){
    this.age = age;
    this.name =  name;
    this.address = address;
    System.out.println("Param - person constructor");
}
    //methods
    void display(){
        System.out.println("name: " + name);
        System.out.println("age: " + age);
        System.out.println("address: " + address);
    }

    @Override
    public String toString() {
        return "Person{" +
                "age=" + age +
                ", name='" + name + '\'' +
                ", address='" + address + '\'' +
                '}';
    }
}
