package hafta4;
import java.io.File;
import java.util.Scanner;

public class soru3 {

    public static void main(String[] args) {
        try {
            File f = new File("src/ders4_Lab2.txt");
            Scanner scan = new Scanner(f);
            Integer[] sayılar = new Integer[15];
            int büyük = 0;

            for (int i = 0; i < sayılar.length; i++) {
                sayılar[i] = Integer.valueOf(scan.nextLine());

                if (sayılar[i] == 25) {
                    System.out.println("25 değeri mevcut");
                    break;
                }
            }
            for (int i = 0; i < sayılar.length; i++) {
                if (sayılar[i] > büyük) {
                    büyük = sayılar[i];
                }
            }
            System.out.println("sayılarımızın içersindeki en büyük sayımız : " + büyük);
            scan.close();
            ort(sayılar);
        } catch (Exception e) {

        }

    }

    public static void ort(Integer[] sayılar) {
        int ortalama = 0;
        for (int i = 0; i < sayılar.length; i++) {
            ortalama += sayılar[i];
        }

        System.out.println("sayıların ortalaması : " + Double.valueOf(ortalama / sayılar.length));
    }
}
