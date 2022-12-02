package genel_sorular;

import java.util.Scanner;

// girilen 2 notun ortalamasını alan ve 50 den büyükse iyi değilse kötü yazdrılan program
public class no_ort {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("birinci ve ikinci notunuzu giriniz");
        int a = scan.nextInt();
        int b = scan.nextInt();
        scan.close();
        int ort;
        ort = (a + b) / 2;
        if (ort >= 50)
            System.out.println("iyi");
        else
            System.out.println("kötü");
    }
}
