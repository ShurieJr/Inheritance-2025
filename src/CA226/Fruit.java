package CA226;

public  class Fruit {
    public int x;
    protected int y;
    int z;
    private int u;

   public Fruit(){
        System.out.println("Fruit");
    }
    Fruit(String name){
        System.out.println("Fruit: " + name);
    }
//overloading

  protected  void display(){
        System.out.println("Fruit");
    }
    void display(String name){
        System.out.println("Fruit: " + name);
    }
    void display(int x){
        System.out.println("x: " + x);
    }
}
