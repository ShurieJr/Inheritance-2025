package CA225.Practice;

public class FullTimeEmp extends Employee{
    private String department;
    private double hoursWorked , rate;

    FullTimeEmp(){
        super("j21" , "Ali" , 1*10);
        department = "CIT";
        hoursWorked = 1;
        rate = 10;
    }
    public FullTimeEmp(String id , String name ,String department, double hoursWorked, double rate) {
        super(id , name , (hoursWorked * rate));
        this.department = department;
        this.hoursWorked = hoursWorked;
        this.rate = rate;
    }
    //methods
    double calculateSalary(){
        return hoursWorked * rate;
    }


    void displayDetails() {
    super.displayDetails();
        System.out.println("Department: " + department);
        System.out.println("hours worked: " + hoursWorked);
        System.out.println("rate: "  +rate);
    }


    public static void main(String[] args) {
        FullTimeEmp f = new FullTimeEmp("kl1" , "Abduraman","Cit",3, 7);
        f.displayDetails();
    }
}
