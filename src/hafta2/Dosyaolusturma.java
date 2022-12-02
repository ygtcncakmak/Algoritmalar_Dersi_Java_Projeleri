package hafta2;

import java.io.File;

public class Dosyaolusturma {
    public static void main(String[] args) throws Exception {
        excelolustur();
    }

    public static void excelolustur() {
        // src dosyası içinde bir file nesnesi oluşturuyoruz
        File file = new File("src/hafta2/output.csv");

        try {
            // file nesnesine bağlı bir code oluşturuyoruz
            // eğer dosya varsa bu dosya zaten var uyarısı alıyoruz
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
