package coding100days;
 
import java.util.Scanner;

public class day51 {
 
    public static void main(String[] args) {
        // Percabangan : Switch Case
        /* digunakan di Java untuk menggantikan percabangan if-else if yang memeriksa nilai dari satu variabel.
        Dengan switch, kita dapat memeriksa nilai variabel tersebut dan menjalankan kode yang sesuai dengan salah satu nilai yang ditentukan.
        Switch case lebih efisien dan rapi ketika kita perlu memeriksa banyak nilai berbeda pada satu variabel.
        - penggolongan umur, 1-10 anak kecil, 11-20 remaja, 21-30 dewasa, 31-40 matang, 41-50 sepuh, dan 51 keatas lansia */
     Scanner in = new Scanner(System.in);
 
         
        System.out.print("Masukkan umur: ");
        int umur = in.nextInt();

         
        int kategoriUmur = umur / 10; 

         
        switch (kategoriUmur) {
            case 1: 
                System.out.println("Kategori: Anak Kecil");
                break;
            case 2: 
                System.out.println("Kategori: Remaja");
                break;
            case 3: 
                System.out.println("Kategori: Dewasa");
                break;
            case 4: 
                System.out.println("Kategori: Matang");
                break;
            case 5: 
                System.out.println("Kategori: Sepuh");
                break;
            default: 
                if (umur >= 51) {
                    System.out.println("Kategori: Lansia");
                } else {
                    System.out.println("Umur tidak valid.");
            }
        }
    }
}
