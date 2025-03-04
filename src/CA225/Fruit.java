package CA225;

public class Fruit {
    protected int id;
    public int x;
    private int y;
    int z;
    public Fruit(){

    }
     Fruit(String name) {

    }
    //method
  protected   void display(){
        System.out.println("Fruit!");
    }
//overloading method
    void display(String name){
        System.out.println(name);
    }
}
