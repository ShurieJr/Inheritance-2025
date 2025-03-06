package CA2213.Exceptions;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.sql.SQLException;

public class test {
    static int age;
    public static void main(String[] args)  {

        try{
            int x = 1;
            int y =2;
            //FileInputStream f = new FileInputStream("file.txt");
           System.out.println(x/y);
           int[] numbers = {1,3,4};
            System.out.println(numbers[1]);
        }
        catch (IndexOutOfBoundsException ex){
            System.out.println("index out of bound! ");
        }
        finally {
            System.out.println("final statement!");
        }

//        try {
//            readFile();
//        } catch (FileNotFoundException e) {
//            throw new RuntimeException(e);
//        }

        // FileInputStream f = new FileInputStream("file.txt");
    }

    //method
    static void setAge(int age)
            throws IllegalArgumentException{
        if(age >=1)
        test.age = age;
        else
            throw new IllegalArgumentException("Age must be gretaer than 0");
    }

    static void readFile() throws FileNotFoundException{
        FileInputStream f = new FileInputStream("file.txt");
    }
}
