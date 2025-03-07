package CA226.Practice;

public class SavingAccount extends Account{

    SavingAccount(){
        super("Abdifitah Gedi", 1000);
    }
    void withdraw(double amount) throws IllegalArgumentException{
        if(amount <= balance && amount > 0 &&
                (balance-amount >= 100)){
            balance -= amount;
        }
        else
            throw new IllegalArgumentException("invalid operation!");
           // System.out.println("invalid operation!");
    }

    public static void main(String[] args) {
        SavingAccount save = new SavingAccount();
        save.withdraw(0);
        save.display();
    }

}
