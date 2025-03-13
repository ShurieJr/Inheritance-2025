package CA2213.AbstractCh;

public class Circle extends Shape{

    Circle(double value){
        super(value);
    }
    void display(){

    }
    void calculateArea(){
       super.calculateArea();
    }

    public static void main(String[] args) {
        Circle c1 = new Circle(3);
        c1.calculateArea();
    }
}
