package coding100days;
 
import java.util.Scanner;

public class day49 {
 
    public static void main(String[] args) {
        // Percabangan : if- else if - else
        /* digunakan untuk mengevaluasi beberapa kondisi dan mengambil tindakan yang sesuai untuk masing-masing kondisi.
        Jika tidak ada kondisi yang memenuhi, maka blok else akan dieksekusi.
Contoh soal :
- pada saat ujian semester matkul DDP, bagi siswa yg bisa mendapatkan nilai 1-39 mendapatkan kategori E, 40-59 mendapatkan kategori D, 60-75 mendapatkan kategori C,76-85 mendapatkan kategori B, dan 86-100 mendapatkan kategori A,
> buatlah inputan nilai uts mahasiswa, dan kategorikan nilai tersebut,
  jika mendapatkan nilai 01-39 mendapatkan kategori E,
                         40-59 mendapatkan kategori D,
                         60-75 mendapatkan kategori C,
                         76-85 mendapatkan kategori B,
                         86-100 mendapatkan kategori A,
                         dan jika nilai inputan diluar target di atas, maka beritahu jika nilai yg bisa di input 1-100. */
     Scanner in = new Scanner(System.in);
      System.out.println("Masukkan nilai uts anda = ");
       int nilaiUts = in.nextInt();
       
     if (nilaiUts >= 86 && nilaiUts <= 100) {
            System.out.println("Kategori: A");
        } else if (nilaiUts >= 76 && nilaiUts <= 85) {
            System.out.println("Kategori: B");
        } else if (nilaiUts >= 60 && nilaiUts <= 75) {
            System.out.println("Kategori: C");
        } else if (nilaiUts >= 40 && nilaiUts <= 59) {
            System.out.println("Kategori: D");
        } else if (nilaiUts >= 01 && nilaiUts <= 39) {
            System.out.println("Kategori: E");
        } else {
            System.out.println("Nilai tidak valid, silakan masukkan nilai antara 1-100");
        }
    }
 }
