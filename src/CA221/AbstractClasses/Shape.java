package CA221.AbstractClasses;

public abstract class Shape {
    private double radius;
    private double length , width;
    Shape(){

    }
    Shape(double radius){
        this.radius = radius;
    }
    Shape(double length , double width){
        this.length  = length;
        this.width =width;
    }
    //concrete methods
    void dispalyradius(){
        System.out.println("radius:  " + radius);
    }
    void displayLW(){
        System.out.println("length: "+ length);
        System.out.println("width: " + width);
    }
    //abstract methods
   abstract void calculateArea();

    public double getRadius() {
        return radius;
    }

    public double getLength() {
        return length;
    }

    public double getWidth() {
        return width;
    }
}
