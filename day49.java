package coding100days;
 
import java.util.Scanner;

public class day49 {
 
    public static void main(String[] args) {
        //Percabangan : if- else if 
        /* digunakan untuk mengevaluasi beberapa kondisi berbeda. Jika kondisi dalam if tidak terpenuhi (false),
           maka program akan mengevaluasi kondisi dalam else if.
           Kamu bisa menggunakan beberapa else if untuk menangani berbagai kondisi sebelum mencapai else (jika ada),
           yang akan menangani kasus terakhir ketika tidak ada kondisi sebelumnya yang terpenuhi.
Contoh soal :
- pada saat ujian semester matkul DDP, bagi siswa yg bisa mendapatkan nilai 1-39 mendapatkan kategori E, 40-59 mendapatkan kategori D, 60-75 mendapatkan kategori C,76-85 mendapatkan kategori B, dan 86-100 mendapatkan kategori A,
> buatlah inputan nilai uts mahasiswa,dan kategorikan nilai tersebut, jika mendapatkan nilai 1-39 mendapatkan kategori E, 40-59 mendapatkan kategori D, 60-75 mendapatkan kategori C,76-85 mendapatkan kategori B, dan 86-100 mendapatkan kategori A, */
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
        } else if (nilaiUts >= 1 && nilaiUts <= 39) {
            System.out.println("Kategori: E");
        }
    }
 }
