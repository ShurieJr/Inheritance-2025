package CA221;

public class Apple extends Friut {
    Apple() {

    }

    //method
   public void display(String name , int age){
        System.out.println("Apple!");
    }

    public static void main(String[] args) {
        Friut f = new Friut();
        f.name = "orange";
    }
}
