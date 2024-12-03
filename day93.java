package coding100days;

import java.util.Scanner;

public class day93 {
// Asterisk Pattern : Pola V Terbalik
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("masukkan Jumlah baris pola V yg diinginkan kemudian kubalik: ");
        byte x = in.nextByte();
        System.out.println("===============================================================");
        for (int i = 0; i < x; i++) {
            for (int j = 0; j < (x - i - 1); j++) {
                System.out.print(" ");
            }
            System.out.print("*");

            for (int j = 0; j < (2 * i - 1); j++) {
                System.out.print(" ");
            }
            if (i != 0) {
                System.out.print("*");
            }
            System.out.println();
        }
        System.out.println("===============================================================");
    }
}
