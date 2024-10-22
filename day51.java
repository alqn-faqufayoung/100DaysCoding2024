package coding100days;
 
import java.util.Scanner;

public class day51 {
 
    public static void main(String[] args) {
        // Percabangan : Switch Case
        /* ddigunakan di Java untuk menggantikan percabangan if-else if yang memeriksa nilai dari satu variabel.
        Dengan switch, kita dapat memeriksa nilai variabel tersebut dan menjalankan kode yang sesuai dengan salah satu nilai yang ditentukan.
        Switch case lebih efisien dan rapi ketika kita perlu memeriksa banyak nilai berbeda pada satu variabel.
Contoh soal :
- pada saat ujian semester matkul DDP, bagi siswa yg bisa mendapatkan nilai 1-39 mendapatkan kategori E, 40-59 mendapatkan kategori D, 60-75 mendapatkan kategori C,76-85 mendapatkan kategori B, dan 86-100 mendapatkan kategori A,
> buatlah inputan nilai uts mahasiswa, dan kategorikan nilai tersebutmenggunakan switch case,
  jika mendapatkan nilai 01-39 mendapatkan kategori E,
                         40-59 mendapatkan kategori D,
                         60-75 mendapatkan kategori C,
                         76-85 mendapatkan kategori B,
                         86-100 mendapatkan kategori A,
                         dan jika nilai inputan diluar target di atas, maka beritahu jika nilai yg bisa di input 1-100. */
     Scanner in = new Scanner(System.in);
 
         
        System.out.print("Masukkan umur: ");
        int umur = in.nextInt();

         
        int kategoriUmur = umur / 10;  // Pembagian rentang berdasarkan 10 tahun

         
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
