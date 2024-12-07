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
            boolean pri = true;

            for (int j = 2; j <= Math.sqrt(i); j++) {
                if (i % j == 0) {
                    pri = false;
                    break;
                }
            }
            if (pri) {
                System.out.print(i + " ");
            }
        }
    }
}
