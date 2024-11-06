package coding100days;

import java.util.Scanner;

public class day66 {
// Pola Persegi dan Persegi Panjang

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Masukkan ukuran persegi: ");
        int kubus = in.nextInt();

        for (int i = 1; i <= kubus; i++) {
            for (int j = 1; j <= kubus; j++) {
                System.out.print(" # ");
            }
            System.out.println();
        }
        System.out.println("====================================================");
        int bawah = 5;

        int samping = 8;

        for (int i = 1; i <= bawah; i++) {
            for (int j = 1; j <= samping; j++) {
                System.out.print(" * ");
            }
            System.out.println();
        }
        System.out.println("====================================================");
        for (int i = 1; i <= kubus; i++) {
            for (int j = 1; j <= kubus - i; j++) {
                System.out.print(" ");
            }
            for (int k = 1; k <= (2 * i - 1); k++) {
                System.out.print("▲");
            }
            System.out.println();
        }
    }
}
