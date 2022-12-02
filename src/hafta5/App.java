package hafta5;

import java.io.File;

public class App {
    public static void main(String[] args) throws Exception {
        excelolustur();
        a.yaz();
    }

    public static void excelolustur() {

        File file = new File("src/output.txt");

        // String ad="sinem";

        try {

            boolean value = file.createNewFile();
            if (value) {
                System.out.println("Yeni dosya oluşturuldu.");
            } else {
                System.out.println("Bu isimde dosya zaten mevcut");
            }
        } catch (Exception e) {

            e.getStackTrace();
        }
    }
}