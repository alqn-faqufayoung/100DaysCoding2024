package coding100days;

import java.util.Scanner;

public class day60 {

    // Looping : do while
    /* dalam Java adalah jenis perulangan di mana blok kode dieksekusi setidaknya satu kali,
    bahkan jika kondisi perulangan tidak terpenuhi, karena kondisi perulangan diperiksa setelah eksekusi blok kode.
    Setelah eksekusi pertama, kondisi perulangan akan diperiksa, dan jika kondisinya true, loop akan terus berjalan. */

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        
        System.out.println("-=PRINT ANGKA=-");
        System.out.print("Masukkan angka mulai dari : ");
        int x = in.nextInt();
        System.out.print("Sampai angka : ");
        int y = in.nextInt();
        System.out.println("==========================================================================================================================");

        do {
            System.out.print(" " + x);
            x++;
        } while (x <= y);
    }
}
