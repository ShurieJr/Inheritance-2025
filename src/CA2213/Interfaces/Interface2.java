package CA2213.Interfaces;

public interface Interface2 {
    public final int VALUE =100;
    void printInfo();


     static void getName(){
         System.out.println("interface 2!");
     }

    public static void main(String[] args) {
        Interface2.getName();

    }
}
