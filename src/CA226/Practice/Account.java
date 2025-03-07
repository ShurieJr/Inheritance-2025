package CA226.Practice;

public class Account {   //parent class

    String accountName;
    double balance;

    Account(){
        accountName = "MOHAMED ABDULLAHI";
        balance = 500;
    }
    Account(String name , double value){
        accountName = name;
        balance = value;
    }

    void deposit(double amount){
        if(amount > 0)
            balance += amount;
        else
            System.out.println("amount must be greater than 0");
    }

    void withdraw(double amount){
        if(amount <= balance && amount > 0)
            balance -= amount;  // balance = balance - amount;
        else
            System.out.println("invalid amount or insufficient balance");
    }

    void display(){
        System.out.println("account name: " + accountName);
        System.out.println("Balance : " + balance);
    }
}
