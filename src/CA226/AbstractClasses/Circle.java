package CA226.AbstractClasses;

public class Circle extends Shape{

    Circle(){
        super(8);
        System.out.println("no arg- circle");
    }
    //concrete method
    void display(){
        System.out.println("Circle!");
    }

    public static void main(String[] args) {
        Circle c1 = new Circle();
    }
}
