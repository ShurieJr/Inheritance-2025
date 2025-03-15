package CA221.AbstractClasses;

public class rectangle extends Shape{

    rectangle(double L , double W){
        super(L , W);
    }
    @Override
    void calculateArea() {
        System.out.println("Rectangle Area:");
        System.out.println(getLength() * getWidth());
    }
}
