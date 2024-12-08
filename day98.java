package coding100days;

import java.util.Scanner;

public class day98 {
// Soal : Total penjumlahan bilangan genap dari x ke y

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Bilangan x: ");
        int x = in.nextInt();
        System.out.print("Bilangan y: ");
        int y = in.nextInt();

        int t = 0;

        if (x < y) {
            for (int i = x; i <= y; i++) {
                if (i % 2 == 0) {
                    t += i;
                }
            }
            System.out.println("jumlah bilangan genap dari x ke y: " + t);
        } else if (x > y) {
            for (int i = y; i <= x; i++) {
                if (i % 2 == 0) {
                    t += i;
                }
            }
            System.out.println("jumlah bilangan genap dari y ke x: " + t);
        }
    }
}
