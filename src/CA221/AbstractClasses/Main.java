package CA221.AbstractClasses;

public class Main {
    public static void main(String[] args) {

        //object
        Shape c = new Circle(2);
        Shape r = new rectangle(10 , 10);

        c.calculateArea();
        r.calculateArea();
    }
}
