package CA226.AbstractClasses;

public abstract class Shape {
    private double radius;

    Shape(){
        radius = 1;
        System.out.println("no arg-shape");
    }

    Shape(double value){
        radius = value;
        System.out.println("param cons- shape");
    }
   abstract void display();  //abstract method

    void test(){ //concrete method
        System.out.println("Shape!");
    }
}
