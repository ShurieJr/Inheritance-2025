package CA221.interfaces;

public class Calculator extends test implements MathOperations , Interface2{

    @Override
    public void add(double a, double b) {
        System.out.println(a + b);
    }


    @Override
    public void mult(double a, double b) {
        System.out.println(a * b);
    }

    @Override
    public void div(double a, double b) {
        System.out.println(a / b);
    }

    @Override
    public void sub(double a, double b) {
        System.out.println(a - b);
    }

    @Override
    public void mod(double a, double b) {
        System.out.println(a % b);
    }
void test(){
    System.out.println(MathOperations.RESULT);
}
    public static void main(String[] args) {
        MathOperations c = new Calculator();

        c.add(2 ,3 );
        c.mult(2 , 9);
    }

}
