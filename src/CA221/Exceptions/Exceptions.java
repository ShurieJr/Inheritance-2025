package CA221.Exceptions;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class Exceptions {

    public static void main(String[] args) {


        int[] numbers = {1 , 4 ,6};
         String name = "omar";
        try {
            System.out.println(2/0); // /zero
            System.out.println(name.charAt(8));  //index out of bounds
            System.out.println(name.length()); // nullpointer
            System.out.println(numbers[8]); //index out bounds
            setAge(4);

        }catch (IndexOutOfBoundsException ex){
            System.out.println(ex.getMessage());
        }
        catch (NullPointerException e){
            System.out.println(e.getMessage());
        }
        catch (ArithmeticException e){
            System.out.println("cannot divide by zero!");
        }
        finally {
            System.out.println("Final statement");
        }
    }
    static void readFile() { //checked exceptions
        try {
            FileInputStream fs = new FileInputStream("ca221.txt");
        } catch (FileNotFoundException e) {
            System.out.println("file not found!");
        }
    }

    //unchecked exception
    static void setAge(int age)  {
        if(age > 0)
            System.out.println("Bravo!");
        else
            System.out.println("Age must be greater than zero!");
    }
}
