package CA226.INterfaces;

public class Calculaator implements MathOperations{
    @Override
    public double add(double a, double b) {
        return a + b;
    }

    @Override
    public double sub(double a, double b) {
        return a - b;
    }

    @Override
    public double dev(double a, double b) {
        return a / b;
    }

    @Override
    public double mult(double a, double b) {
        return a * b;
    }


}
