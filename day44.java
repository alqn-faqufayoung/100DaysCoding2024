 package coding100days;
 
     import java.util.Scanner;

         public class day44 {
 
         public static void main(String[] args) {
         /* Operator Logika : AND
         >> Program mengambil dua input dari pengguna dan menggunakan operator AND (&&) untuk mengecek apakah kedua kondisi benar.
         >> Jika kedua kondisi benar, hasilnya true. Jika salah satu kondisi false, hasilnya false. */
         Scanner in = new Scanner(System.in);
        
         System.out.print("Masukkan Pengeluaran = ");
          int Pengeluaran = in.nextInt();
             System.out.print("Masukkan Pemasukan = ");
              int Pemasukan = in.nextInt();
        
         boolean Hemat = (Pengeluaran < Pemasukan) && (Pemasukan > Pengeluaran);
          System.out.println("Apakah Anda termasuk orang yang Hemat = "+ Hemat);

         boolean Boros = (Pengeluaran > Pemasukan) && (Pemasukan < Pengeluaran);
          System.out.println("Apakah Anda termasuk orang yang Boros = "+ Boros);     
 }
}
