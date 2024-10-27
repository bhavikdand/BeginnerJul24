package adv_lc_4.exception_handling;

import java.io.FileNotFoundException;
import java.io.FileReader;

public class Client {

    public static void main(String[] args) {
//        readFile("werwerwer");
        checkAge("1)uiui");

        Connection connection = new Connection();
        connection.connect();
        try{
            connection.execute("some query");
        }catch (RuntimeException e){
            System.out.println("Failed to execute the query because of Runtime exception");
        } catch (FileNotFoundException fnfe){
            System.out.println("Failed to execute query because file not found");
        }
        finally {
            connection.disconnect();
        }

        validateAge(15);
    }

    public static void validateAge(int age){
        if(age < 18){
            throw new InvalidAgeException("Age cannot be less than 18");
        }
        System.out.println("Age is correct");
    }

    public static boolean checkAge(String s){
        try {
            int i = Integer.parseInt(s);
            return i>=18;
        } catch (NumberFormatException nfe){
            System.out.println("Got a string: " + s);

        }finally {
            System.out.println("I will be executed always");
        }

        return false;
    }

    public static void readFile(String path){
        try {
            FileReader fr = new FileReader("");
            System.out.println("File read successfully");
        }catch (FileNotFoundException fnfe){
            System.out.println("File not found, sorry");
        }finally {
            System.out.println("I will be executed in all the cases");
        }
    }
}
