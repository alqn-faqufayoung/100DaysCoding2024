package coding100days;

  public class day82 {
// Method ceil(), floor() dan round()
/*  ceil() selalu membulatkan ke atas (misal 4.1 menjadi 5.0).
     floor() selalu membulatkan ke bawah (misal 4.9 menjadi 4.0).
      round() membulatkan ke bilangan bulat terdekat (misal 4.5 menjadi 5, dan 4.3 menjadi 4). */

       public static void main(String[] args) {
        double a = 122.1;
         double b = 456.9;
          double c = 789.4;
           double d = 986.5;

        System.out.println(a + " dibulatkan menggunakan method ceil menjadi: " + Math.ceil(a));
         System.out.println(b + " dibulatkan menggunakan method floor menjadi: " + Math.floor(b));
          System.out.println(c + " dibulatkan menggunakan method round menjadi: " + Math.round(c));
           System.out.println(d + " dibulatkan menggunakan method round menjadi: " + Math.round(d));
    }
}
