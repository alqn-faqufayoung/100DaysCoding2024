package coding100days;

import java.util.Scanner;

public class day97 {
// Soal : Mencetak bilangan prima dari 1-n
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Masukkan batas max angka: ");
        int x = in.nextInt();

        System.out.print("bilangan prima 1 hingga " + x + ": ");
        for (int i = 2; i <= x; i++) {
            if (i == 2 || i == 3 || (i % 2 != 0 && i % 3 != 0)) {
                System.out.print(i + " ");
            }
        }
    }
}
