package coding100days;

import java.util.Scanner;

public class day94 {
// Asterisk Pattern : Segitiga
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("masukkan Jumlah baris/tinggi pola Segitiga yg diinginkan: ");
        byte x = in.nextByte();
        System.out.println("===============================================================");

        for (int i = 1; i <= x; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
