package genel_sorular;
//  class dan miras alma deneme

public class classad extends classdeneme {
   private String yas;

   public classad(String ad, String soyad, String yas) {
      super(ad, soyad);
      this.yas = yas;
      classdeneme.soyad = soyad;
   }
}
