package CA225;

public class Person {
    //variables
    private String name , address;
    private int age;
    //Constructors
    Person(){
        name  = "Gedi";
        age = 35;
        address = "waaberi";
        System.out.println("Person no-arg Constructor!");
    }

    public Person(String name, String address, int age) {
        this.name = name;
        this.address = address;
        this.age = age;
        System.out.println("Person with-arg Constructor!");
    }
    //methods
    void display(){
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Address: " + address);
    }

    //toString

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", address='" + address + '\'' +
                ", age=" + age +
                '}';
    }

    //get & set

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
