package hafta4;
import java.util.Scanner;
import java.io.*;

public class soru1 {
    public static void main(String[] args) {
        String path = "src/ders4_Lab.txt";

        try {
            File f = new File(path);
            Scanner scan = new Scanner(f);

            String[] ad = new String[5];
            String[] file = new String[25];
            Integer[] notlar = new Integer[5];
            Integer[] ahmetnot = new Integer[4];
            Integer[] mehmetnot = new Integer[4];
            Integer[] alinot = new Integer[4];
            Integer[] velinot = new Integer[4];
            Integer[] sinemnot = new Integer[4];
            int sayac = 0, sayac1 = 0, sayac2 = 0, sayac3 = 0, sayac4 = 0, sayac5 = 0;

            for (int i = 0; i < 25; i++) {

                file[i] = scan.nextLine();

            }

            for (int i = 0; i < file.length; i += 5) {
                ad[sayac] = file[i];
                sayac++;
            }

            for (int i = 1; i < 5; i++) {
                ahmetnot[sayac1] = Integer.valueOf(file[i]);
                sayac1++;

            }

            for (int i = 6; i < 10; i++) {
                mehmetnot[sayac2] = Integer.valueOf(file[i]);
                sayac2++;
            }

            for (int i = 11; i < 15; i++) {
                alinot[sayac3] = Integer.valueOf(file[i]);
                sayac3++;
            }

            for (int i = 16; i < 20; i++) {
                velinot[sayac4] = Integer.valueOf(file[i]);
                sayac4++;
            }

            for (int i = 21; i < 25; i++) {
                sinemnot[sayac5] = Integer.valueOf(file[i]);
                sayac5++;
            }

            notlar[0] = (ahmetnot[0] * 40 / 100) + (ahmetnot[1] * 20 / 100) + (ahmetnot[2] * 20 / 100)
                    + (ahmetnot[3] * 20 / 100);

            notlar[1] = Integer.valueOf(mehmetnot[0] * 40 / 100 + mehmetnot[1] * 20 / 100 + mehmetnot[2] * 20 / 100
                    + mehmetnot[3] * 20 / 100);

            notlar[2] = Integer
                    .valueOf(alinot[0] * 40 / 100 + alinot[1] * 20 / 100 + alinot[2] * 20 / 100 + alinot[3] * 20 / 100);

            notlar[3] = Integer.valueOf(velinot[0] * 40 / 100 + velinot[1] * 20 / 100 + velinot[2] * 20 / 100
                    + velinot[3] * 20 / 100);

            notlar[4] = Integer.valueOf(sinemnot[0] * 40 / 100 + sinemnot[1] * 20 / 100 + sinemnot[2] * 20 / 100
                    + sinemnot[3] * 20 / 100);

            for (int i = 0; i < ad.length; i++) {

                if (notlar[i] >= 85 && notlar[i] < 100) {
                    System.out.println(ad[i] + " : A : " + notlar[i]);
                }
                if (notlar[i] >= 75 && notlar[i] < 85) {
                    System.out.println(ad[i] + " : B : " + notlar[i]);
                }
                if (notlar[i] >= 60 && notlar[i] < 75) {
                    System.out.println(ad[i] + " : C : " + notlar[i]);
                }
                if (notlar[i] >= 45 && notlar[i] < 60) {
                    System.out.println(ad[i] + " : D : " + notlar[i]);
                }
                if (notlar[i] >= 30 && notlar[i] < 45) {
                    System.out.println(ad[i] + " : E : " + notlar[i]);
                }
                if (notlar[i] >= 0 && notlar[i] < 30) {
                    System.out.println(ad[i] + " : F : " + notlar[i]);
                }
            }

            scan.close();
        } catch (Exception e) {

        }

    }
}
