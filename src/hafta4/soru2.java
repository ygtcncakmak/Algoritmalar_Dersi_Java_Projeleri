package hafta4;

public class soru2 {
    public static void main(String[] args) {
        Integer[] sayılar = { 1, 3, 24, 32, 37, 40, 41, 46, 55, 123 };
        for (int a = 0; a < sayılar.length; a++) {

            if (sayılar[a] == 37) {
                System.out.println("37. sayının bulunduğu indexs : " + a);

            }
            if (sayılar[a] == 46) {
                System.out.println("46. sayının bulunduğu indexs : " + a);
            }
            if (sayılar[a] == 55) {
                System.out.println("55. sayının bulunduğu indexs : " + a);
            }

        }
        for (int a = 0; a < sayılar.length; a++) {

            if (sayılar[a] == 101) {
                System.out.println("101. sayının bulunduğu indexs : " + a);
            } else {
                System.out.println("101 sayısı mevcut değil");
                break;
            }
        }
    }
}
