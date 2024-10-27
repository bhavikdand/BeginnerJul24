package adv_lc_4.exception_handling;

import java.io.FileNotFoundException;

public class Connection {

    public void connect(){
        System.out.println("Connecting to DB");
    }

    public void disconnect(){
        System.out.println("Disconnecting from DB");
    }

    public void execute(String query) throws RuntimeException, FileNotFoundException {
        System.out.println("Executing query:" + query);
    }
}
