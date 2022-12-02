package hafta5;
import java.util.Scanner;
import java.io.*;

public class satiratla {
    public static void main(String[] args) {
        String path = "src/output.txt";
        try {
            File f = new File(path);
            Scanner scan = new Scanner(f);
            String[] topla = new String[8];
            for (int i = 0; i < topla.length; i++) {
                topla[i] = scan.nextLine();
                if (topla[1] != null) {
                    System.out.println(topla[i]);
                }

            }
scan.close();
        } catch (Exception e) {

        }
    }
}
