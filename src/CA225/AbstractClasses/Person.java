package CA225.AbstractClasses;

public abstract class Person {
    private String name;
    private int age;

    Person(){
        name = "ali omar";
        age= 30;
    }
    Person(String name ,  int age){
        if(age > 0)
            this.age = age;
        this.name= name;
    }

    //methods
    //concrete method
    void display(){
        System.out.println("Person!");
    }
    //abstract method
    abstract void printInfo();

    //get & set

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        if(age > 0)
        this.age = age;
        else
            System.out.println("age must be greater than zero!");
    }
}
