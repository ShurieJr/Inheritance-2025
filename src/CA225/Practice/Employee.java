package CA225.Practice;

public class Employee {
     String id , name;
     double salary;

    public Employee() {
        id = "J21005";
        name = "Mohamed abdullahi";
        salary = 100;
    }

    public Employee(String id, String name, double salary) {
        this.id = id;
        this.name = name;
        this.salary = salary;
    }


    //methods
    double calculateSalary(){
        return salary;
    }

    void displayDetails(){
        System.out.println("ID: " + id);
        System.out.println("name: " + name);
        System.out.println("salary: " + salary);
    }

    void addBonus(double amount) throws IllegalArgumentException{
       if(amount > 0)
        salary += amount;
       else
       throw new IllegalArgumentException("Amount must be greater than zero!");
    }
}
