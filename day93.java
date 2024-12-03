package coding100days;

import java.util.Scanner;

public class day93 {
// Asterisk Pattern : Pola V Terbalik
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("masukkan Jumlah baris pola V yg diinginkan kemudian kubalik: ");
        byte x = in.nextByte();
        System.out.println("===============================================================");
        // Loop untuk setiap baris
        for (int i = 0; i < x; i++) {
            // Mencetak spasi di sebelah kiri
            for (int j = 0; j < (x - i - 1); j++) {
                System.out.print(" ");
            }
            // Mencetak bintang di sisi kiri
            System.out.print("*");

            // Mencetak spasi antara kedua bintang (garis diagonal V terbalik)
            for (int j = 0; j < (2 * i - 1); j++) {
                System.out.print(" ");
            }
            // Mencetak bintang di sisi kanan kecuali baris pertama
            if (i != 0) {
                System.out.print("*");
            }
            // Pindah ke baris berikutnya
            System.out.println();
        }
        System.out.println("===============================================================");
    }
}
