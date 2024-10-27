package adv_lc_4.exception_handling;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;

public class Main {
    public static void main(String[] args) throws FileNotFoundException  {
        System.out.println("Starting to read the file");
        readFile("werwerwer");
        System.out.println("Filereader object is ready");

    }

    public static void readFile(String path) throws FileNotFoundException{
        FileReader fr = new FileReader(path);
    }

}
