package CA225.Exception;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class Exceptions {

    public static void main(String[] args) throws FileNotFoundException{
        //readFile();

setAge(-1);

        int[] numbers = {1 , 3 , 5};
        String name = "Ali";
        Exceptions st=null;
       try{
           System.out.println(st.toString());
           System.out.println(2/2);
           System.out.println(name.charAt(9));
           System.out.println(numbers[0]);

       }
       catch (IndexOutOfBoundsException ex){
           System.out.println(ex.getMessage());
       }
       catch (NullPointerException e){
           System.out.println(e.getMessage());
       }
       catch (ArithmeticException e){
           System.out.println("cannot divide by zero!");
       }
       finally {
           System.out.println("Final Statements!");
       }

    }

    static void readFile() throws FileNotFoundException {
        FileInputStream fs = new FileInputStream("File.txt");

    }

   static void setAge(int age) {
        if(age >0)
            System.out.println("Your age is legal!");
        else
            System.out.println("Age must be greater than zero!");
//            throw new IllegalArgumentException("Age must be greater than zero!");
    }
}
