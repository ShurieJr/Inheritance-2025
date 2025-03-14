package CA227.Exceptions;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.net.MalformedURLException;
import java.net.URL;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Exceptions {
    public static void main(String[] args) throws SQLException, MalformedURLException {

        URL url = new URL("https://");

        Connection cn = DriverManager.getConnection("jdbc://local","user", "pass");
        try {
            readFile();
        } catch (FileNotFoundException e) {
            System.out.println("File not found!");
        }
        finally {
            System.out.println("Final statements!");
        }
        setAge(2);

        String[] names = {"ali" , "osman"};
        String name = null;

        if(name != null)
            System.out.println(name.length());
        else
            System.out.println("name is null");

        //unchecked exc..
        try {
            System.out.println(2 / 2); // /zero
            System.out.println(names[9]); //indexOutOfBounds
            System.out.println(name.length()); // NullPointer
        }
        catch (Exception e){
            System.out.println(e.getMessage());
        }
//        }catch (ArithmeticException e){
//            System.out.println("cannot divide by zero! ");
//        }
//        catch (IndexOutOfBoundsException ex){
//            System.out.println(ex.getMessage());
//        }
//        catch (NullPointerException e ){
//            System.out.println("String Null pointer exception");
//        }



    }

    static void readFile() throws FileNotFoundException{
        //checked excep...

    FileInputStream fs = new FileInputStream("ca227.txt");


    }

    static void setAge(int age) throws IllegalArgumentException{
        if(age > 0)
        System.out.println(age);
        else
            throw new IllegalArgumentException("Age must be greater than zero;");
    }
    static void setAge2(int age) {
        if(age > 0)
            System.out.println(age);
        else
            System.out.println("Age must be greater than zero;");
    }
}
