package CA227;

public class Fruit {
    protected double price;
    private int tax;
    String name;
    public  int total;

    public Fruit() {
    }

    Fruit(String name){
        System.out.println(name);
    }
    void display(){
        System.out.println("Fruit");
    }
    void display(String name){
        System.out.println(name);
    }
    void display(int number){

    }
}
