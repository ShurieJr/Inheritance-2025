package CA226.Exception;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class exceptions {
    public static void main(String[] args) throws SQLException, MalformedURLException {
        Connection con = DriverManager.getConnection("jdbc:" , "user" , "pass");

        URL url = new URL("https:///");

        int x = 1 , y = 1;
        try {
            int[] numbers = {1, 2, 3};
            System.out.println(x / y);
            String name = null;
            System.out.println(numbers[0]);
            System.out.println(name.length());
        }
        catch(Exception e){
            System.out.println(e.getMessage());
        }
//        } catch (ArithmeticException e) {
//            System.out.println("cannot devide by zero");
//        }
//        catch (NullPointerException ex){
//            System.out.println("Null Pointer Exception!");
//        }
//        catch (IndexOutOfBoundsException error){
//            System.out.println("Array Index Out of Bounds!");
//        }

        //checked exceptions

        try {
            read();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    static void read() throws FileNotFoundException , IOException {
        try {
            FileInputStream fs = new FileInputStream("file.txt");
        } catch (FileNotFoundException e) {
            throw new FileNotFoundException();
        }
    }
}
