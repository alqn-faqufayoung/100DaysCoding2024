package coding100days;
 
import java.util.Scanner;

public class day47 {
    // Percabangan : if
    /* digunakan untuk membuat keputusan di dalam program. Jika kondisi yang diberikan bernilai true,
    maka blok kode di dalam percabangan if akan dieksekusi. Jika tidak, blok kode tersebut akan dilewati.
    
    Contoh soal ;
    - Ada perempuan keturunan ningrat dari suku tiktok, yg mana perempuan tersebut mau dinikahi 
       jika pelamar tersebut seorang laki-laki yg mapan dan berpenghasilan yg lumayan, paling nggak panaiknya 100jt.
    > buatlah 2 inputan yg berisikan penghasilan dan uang panaik yg siap di berikan ke calon mempelai wanita,
       jika penghasilannya di atas 10jt perbulan dan siap memberikan panaik 100jt, maka pihak mempelai perempuan akan mau menerima lamaran tsb. */
    
    
 
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        
         System.out.print("Jumlah penghasilan bulanan (juta) = ");
          int gaji = in.nextInt();
             System.out.print("Jumlah panaik yg disanggupi (juta) = ");
              int panaik = in.nextInt();
              
         if (gaji>=10 && panaik>=100){
          System.out.println("Selamat, Lamaran diterima! Penghasilan dan uang panaik mencukupi. pintu rumah kami terbuka lebar untuk anda, silahkan dipersiapkan persyaratan tsb, jan bohong looh ");
         } else {
            System.out.println("Lamaran ditolak! Penghasilan atau uang panaik tidak mencukupi. mungkin anda kurang beruntung, semangat dan bekerja keraslah sodara..");
   }
  }
 }
