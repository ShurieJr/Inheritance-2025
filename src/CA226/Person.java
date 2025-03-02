package CA226;

public class Person {
    //variables
    private String name;
    private int age;
    private String address;
    //constructors
    Person(){
        this("Ali abdirahman" , 89 , "howlwadaag");
        System.out.println("Person no-arg constructor");
//        name  = "Ali abdirahman";
//        age = 89;
//        address = "howlwadaag";
    }

    public Person(String name, int age, String address) {
        this.name = name;
        this.age = age;
        this.address = address;
        System.out.println("Person with arguments constructor");
    }
    //methods

//    @Override
//    public String toString() {
//        return "Person{" +
//                "name='" + name + '\'' +
//                ", age=" + age +
//                ", address='" + address + '\'' +
//                '}';
    //}

    void display(){
        System.out.println("name: "  + name);
        System.out.println("age: "  + age);
        System.out.println("address: "  + address);
    }

    public static void main(String[] args) {
        Person p1 = new Person();
    }
}
