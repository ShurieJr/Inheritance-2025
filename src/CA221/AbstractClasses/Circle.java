package CA221.AbstractClasses;

public class Circle extends Shape{

Circle(double radius){
    super(radius);
}

    void calculateArea() {
        System.out.println("Circle Area:");
        System.out.println(getRadius() * getRadius() * Math.PI);
    }
}
