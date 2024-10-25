package coding100days;
 
import java.util.Scanner;

public class day54 {
    // Looping : for Increment
    /* perulangan yang meningkatkan nilai variabel kontrol (counter) setiap kali loop berjalan.
    Increment biasanya dilakukan dengan menambahkan nilai variabel kontrol sebanyak 1 pada setiap iterasi menggunakan ++ atau dengan menambah angka tertentu,
    seperti i += 2, i += 3, dst., tergantung kebutuhan. */
    
     public static void main(String[] args) {
      Scanner in = new Scanner(System.in);
      
         System.out.print("kelipatan berapa = ");
          int a = in.nextInt();
             System.out.print("kelipatan sampe = ");
              int b = in.nextInt();
        
         for (int i = 0; i <= b; i+=a) {
          System.out.println(i);
   }
  }
 }
