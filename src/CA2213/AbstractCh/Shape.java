package CA2213.AbstractCh;

public abstract class Shape {
    private double radius;

    Shape(){
        radius = 1.0;
    }
    Shape(double value){
        radius = value;
    }
    //Concrete method
    void calculateArea(){
        System.out.println("area: " + (radius *radius));
    }

    //abstract Methods
    abstract void display();
}
