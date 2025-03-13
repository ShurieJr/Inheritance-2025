package CA226.INterfaces;

public interface MathOperations {
  public abstract double add(double a , double b);
    double sub(double a , double b);
    double dev(double a , double b);
    double mult(double a , double b);

    static double modulas(double a , double b){
        return a % b;
    }
}
