package CA227.Abstraction;

public abstract class Person
{
    private int age;
    private String name;

    public Person(){
        name="abdullahi";
        age= 60;
    }
    public Person(String name , int age) {
        this.age    = age;
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    //methods
    void test(){
        System.out.println("Person!");
    }
    abstract void displayInfo();
}
