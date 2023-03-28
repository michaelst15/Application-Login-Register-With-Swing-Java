package Stream;

import java.io.*;

public class Main {
    public static void main(String[] args) {
        FileReader in = null;
        FileWriter out = null;

        try {
            in = new FileReader("latihan_input.txt");
            out = new FileWriter("latihan_out.txt");
            int c;

            while ((c = in.read()) != -1) {
                out.write(c);
            }
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                if (in != null) {
                    in.close();
                }
                if (out != null) {
                    out.close();
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
