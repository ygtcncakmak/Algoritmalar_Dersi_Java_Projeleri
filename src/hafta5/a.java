package hafta5;
import java.io.FileWriter;

public class a {
    public static void main(String[] args) {

    }

    public static void yaz() {
        String[] isim = { "ahmet  ", "emel  ", "ayşe  ", "aynur  ", "veli  ", "hüseyin  ", "mahmut  " };
        String[] soyisim = { "çadır  ", "yolcu  ", "keskin ", "milas ", "durmuş ", "ateş ", "küçük " };
        Integer[] boy = { 182, 176, 160, 165, 172, 178, 182 };
        Double[] boy2 = { 1.82, 1.76, 1.60, 1.65, 1.72, 1.78, 1.82 };

        Integer[] kilo = { 98, 67, 92, 58, 78, 102, 89 };
        Double[] vki = new Double[kilo.length];

        try {

            FileWriter w = new FileWriter("src/output.txt");

            for (int i = 0; i < isim.length; i++) {
                w.write(isim[i] + soyisim[i]);

                w.write(boy[i] + " ; " + kilo[i] + "\n");

            }

            System.out.println("data dosya içine kaydedildi.");
            w.close();

        } catch (Exception e) {

            e.getStackTrace();
        }
    }

    public static void vucut(Double[] boy, Integer[] kilo, Double[] vki,String[] isim) {
        for (int i = 0; i < kilo.length; i++) {
            vki[i] = kilo[i] / (boy[i] * boy[i]);

            if (vki[i] <= 18.5) {
                System.out.println("zayıf kişiler "+isim[i]+vki[i]);
            }
            if (vki[i] > 18.5 && vki[i]<=24.9) {
                System.out.println("normal kilolu "+isim[i]+vki[i]);
            }
            if (vki[i] > 25&&vki[i]<=29.9) {
                System.out.println("fazla kilolu kişiler "+isim[i]+vki[i]);
            }
            if (vki[i] > 30&&vki[i]<=39.9) {
                System.out.println("obez kişiler "+isim[i]+vki[i]);
            }
            if (vki[i] > 40) {
                System.out.println("ileri derecede obez kişiler "+isim[i]+vki[i]);
            }

        }

    }
}