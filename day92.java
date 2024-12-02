package coding100days;

import java.util.Scanner;

public class day92 {
    /* Asterisk Pattern : Pola V Terbalik */
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("masukkan Jumlah baris pola V yg diinginkan: ");
        byte x = in.nextByte();

        for (int i = 0; i < x; i++) {
            for (int j = 0; j < i; j++) {
                System.out.print(" ");
            }
            System.out.print("*");

            for (int j = 0; j < (2 * (x - i - 1) - 1); j++) {
                System.out.print(" ");
            }
            if (i != x - 1) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
