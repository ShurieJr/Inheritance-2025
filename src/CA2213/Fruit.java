package CA2213;

public  class Fruit {

    public int x;
    protected int y;
    int z;
    private int u;

  protected  void display(){
        System.out.println("Fruit!");
    }

    void display(String name){
        System.out.println(name);
    }
    void display(int number){
        System.out.println(number);
    }

    @Override
    public String toString() {
        return "Fruit{" +
                "x=" + x +
                ", y=" + y +
                ", z=" + z +
                ", u=" + u +
                '}';
    }
}
