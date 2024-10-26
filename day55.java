package coding100days;
 
import java.util.Scanner;

public class day55 {
    // Looping : for Decrement
    /* perulangan di mana nilai variabel kontrol (counter) dikurangi setiap kali loop berjalan.
    Decrement biasanya dilakukan dengan mengurangi nilai variabel kontrol sebanyak 1
    pada setiap iterasi menggunakan -- atau dengan mengurangi angka tertentu, seperti i -= 2, i -= 3, dst. */
 
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        
        System.out.print("Masukkan/Print angka sampai = ");
        int a = in.nextInt();
                
        for (int i = a; i >= 0; i--) {
            System.out.println(i);
   }
  }
 }
