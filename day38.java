package coding100days;
 
import java.util.Scanner;

public class day38 {
 
    public static void main(String[] args) {
    // Operator Penugasan : Pengisian dan Perkalian, Pengisian dan Pembagian 
        Scanner in = new Scanner(System.in);
        
     // Pengisian Nilai :
      System.out.println("Silahkan isi Nilai di Bawah");
       System.out.println("-------------------------------------------------------");
        System.out.print("Jumlah Siswa/i Perkelas  = ");
         int Murid = in.nextInt();
        
         // Pengisian dan Perkalian :
        
         System.out.printf("%nPengisian dan Perkalian :%n");
          System.out.print("Jumlah Kelas (Dikali) = ");
           int Kelas = in.nextInt();
            Murid *= Kelas;
             System.out.printf("Jumlah Murid x Kelas = "+ Murid +"%n");
        
         //Pengisian dan Pembagian :
        
         System.out.printf("%nPengisian dan Pembagian :%n");
          System.out.printf("Permeja Muat Berapa Murid = ");
           int Meja = in.nextInt();
            Murid /= Meja;
             System.out.printf("Jumlah Murid x Kelas : Meja (Kebutuhan Meja) = "+ Murid +"%n");
 }
}
