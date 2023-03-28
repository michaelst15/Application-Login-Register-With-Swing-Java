package Exception;

import java.io.File;
import java.io.FileReader;

public class Main {
    public static void main(String[] args) {
        try {
            File file = new File("C:\\Users\\ifca\\JavaDocumentation.txt");
            FileReader fr = new FileReader(file);
            System.out.println("Read file berhasil");
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
