package coding100days;

import java.util.Scanner;

public class day95 {
// Asterisk Pattern : Segitiga Siku dan sebaliknya
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("masukkan angka: ");
        byte x = in.nextByte();
        System.out.println("");
        
        System.out.println("====================================================");
        System.out.println("Segitiga siku");
        
        for (int i = 1; i <= x; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
        System.out.println("====================================================");
        System.out.println("Segitiga siku terbalik");

        for (int i = x; i >= 1; i--) {
            for (int j = 1; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
