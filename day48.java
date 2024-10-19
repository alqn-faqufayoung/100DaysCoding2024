package coding100days;

import java.util.Scanner;

public class day48 {

    // Percabangan : if- else
    /* digunakan ketika kamu ingin menjalankan satu blok kode jika suatu kondisi bernilai true,
       dan menjalankan blok kode yang berbeda jika kondisinya false.
Contoh soal :
- pada saat ujian semester matkul DDP, bagi siswa yg bisa mendapatkan nilai min 80 maka tidak mengulang matkul,
  Namun jika nilai di bawah 80, maka mengulang matkul.
> buatlah inputan nilai uts mahasiswa, jika nilai di bawah 80 maka harus mengulang matkul,
  dan jika nilai min 80+ maka tidak mengulang matkul.*/

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Masukkan nilai uts DDP anda (1-100)= ");
        int nilaiuts = in.nextInt();

        if (nilaiuts >= 80) {
            System.out.println("Selamat,nilai anda mencukupi dan tidak mengulang matkul..Congrats");
        } else {
            System.out.println("maaf, nilai anda belum mencukupi, silahkan mengulang matkul dan memperbaiki nilai..Semangat");
        }
    }
}
