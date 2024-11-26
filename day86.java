package coding100days;

import java.util.Scanner;

public class day86 {

    // Mencetak elemen pada Array satu dimensi
    /* bisa menggunakan loop seperti for, atau for-each untuk menampilkan setiap elemen array.
        Loop ini akan membantu kita mengakses setiap elemen array berdasarkan indeks. */

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        System.out.print("Masukkan jumlah nama: ");
        int jumlah = in.nextInt();
        in.nextLine();

        String[] ar = new String[jumlah];

        for (int i = 0; i < ar.length; i++) {
            System.out.print("Masukkan nama ke-" + (i + 1) + ": ");
            ar[i] = in.nextLine();
        }
        System.out.println("====================================================");

        System.out.println("Nama-nama yang di input:");
        for (int i = 0; i < ar.length; i++) {
            System.out.println("Nama ke-" + (i + 1) + ": " + ar[i]);
        }
        System.out.println("====================================================");
        for (String x : ar) {
            System.out.println(x);
        }
    }
}
