package coding100days;
 
import java.util.Scanner;

public class day40 {
 
    public static void main(String[] args) {
     // Operator Perbandingan : Lebih besar dan lebih kecil 
         Scanner in = new Scanner(System.in);
     
     System.out.print("Berapa jumlah Gaji anda = ");
      int Gaji = in.nextInt();
     System.out.print("Berapa jumlah Pengeluaran anda = ");
       int Pengeluaran = in.nextInt();
       
         // Membandingkan apakah Gaji lebih besar dari Pengeluaran :
         boolean tiang = Gaji > Pengeluaran;
          System.out.println("Apakah Jumlah Gaji Bulanan lebih besar dari Jumlah Pengeluaran bulanan ? " + tiang);

         // Membandingkan apakah Gaji lebih kecil dari Pengeluaran :
         boolean pasak = Gaji < Pengeluaran;
          System.out.println("Apakah Jumlah Gaji lebih kecil dari Jumlah Pengeluaran? " + pasak);
        
         System.out.println(" -= PEPATAH MENGATAKAN: BESAR PASAK DARI PADA TIANG =- ");
 }
}
