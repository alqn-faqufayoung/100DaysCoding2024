package coding100days;
 
import java.util.Scanner;

public class day53 {
    // Looping : for
    /*  digunakan untuk mengeksekusi sekelompok pernyataan berulang kali berdasarkan kondisi tertentu.
        for loop biasanya digunakan ketika kita tahu berapa kali kita ingin menjalankan sebuah blok kode. */
 
     public static void main(String[] args) {
      Scanner in = new Scanner(System.in);
      
         System.out.print("Masukkan angka yg mau di ulang-ulang = ");
          int a = in.nextInt();
         System.out.print("mau di ulang berapa kali = ");
          int b = in.nextInt();

             for (int x =1 ; x <= b; x++) {
              System.out.println("perulangan ke-"+x+" = "+a);
   }
  }
 }
