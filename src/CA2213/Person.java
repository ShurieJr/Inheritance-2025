package CA2213;

public class Person {
    //variables
    private String name;
    private int age;
    private String tel;

    //constructors
    Person() { // no-arg
        this("Mohamed abdullahi",50,"9800");
        System.out.println("Person constructor (no -arg)");
//        name = "Mohamed abdullahi";
//        age = 50;
//        tel = "9800";
    }

    Person(String Name, int age, String tel) {
        name = Name;
        this.age = age;
        this.tel = tel;
        System.out.println("person parametrized constrcr");
    }

    //methods
    void display() {
        System.out.println("Name: " + name);
        System.out.println("age: " + age);
        System.out.println("tel: " + tel);
    }
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
        this.age = age;
    }

    public String getTel() {
        return tel;
    }

    public void setTel(String tel) {
        this.tel = tel;
    }

    //main method
    public static void main(String[] args) {
        Person person1 = new Person("Ali gedi", 27, "7650");
        System.out.println(person1.toString());
    }
}
