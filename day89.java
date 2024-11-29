package coding100days;

import java.util.Scanner;

public class day89 {

    /* Soal
Buatlah program menggunakan Java dengan ketentuan sebagai berikut:
1. Tanyakan kepada pengguna berapa banyak elemen yang ingin ditambahkan ke dalam array satu dimensi dengan tipe data String.
2. Buat array satu dimensi sesuai dengan jumlah elemen yang dimasukkan oleh pengguna.
3. Minta pengguna untuk mengisi setiap elemen array dengan memasukkan nama-nama teman mereka.
4. Cetak semua elemen array ke layar menggunakan perulangan.
5. Tanyakan kepada pengguna indeks elemen mana yang ingin diubah.
6. Minta pengguna untuk memasukkan nilai baru pada indeks tersebut.
7. Cetak kembali semua elemen array yang sudah diperbarui.
     */
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        System.out.print("input jumlah elemen : ");
        int jum = in.nextInt();
        in.nextLine();

        String[] ar = new String[jum];

        System.out.println("====================================================");

        for (int i = 0; i < jum; i++) {
            System.out.print("masukkan nama mahasiswa ke-" + (i + 1) + ": ");
            ar[i] = in.nextLine();
        }

        System.out.println("====================================================");
        System.out.println("mahasiswa yang sudah di input: ");

        for (int i = 0; i < jum; i++) {
            System.out.println("nama mahasiswa ke-" + (i + 1) + ": " + ar[i]);
        }
        System.out.println("====================================================");

        System.out.print("apakah ada yang mau di revisi..? jika ada, nomor berapa: ");
        int rev = in.nextInt();
        in.nextLine();

        System.out.print("gantinya: ");
        String gan = in.nextLine();

        if (rev >= 0 && rev <= ar.length) {
            ar[rev - 1] = gan;
            System.out.println("====================================================");
            for (int i = 0; i < jum; i++) {
                System.out.println("nama mahasiswa ke-" + (i + 1) + ": " + ar[i]);
            }
        }

    }
}
