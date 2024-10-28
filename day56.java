package coding100days;

import java.util.Scanner;

public class day56 {
    // Evaluasi besar 2:

    /* Buatlah program Java yang meminta pengguna untuk memasukkan suhu air dalam derajat Celsius.
       Program harus menggunakan pernyataan if untuk menentukan status air:
    - Jika suhu <= 0, tampilkan "Air membeku."
    - Jika suhu > 0 dan <= 100, tampilkan "Air dalam keadaan cair."
    - Jika suhu > 100, tampilkan "Air mendidih." */

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("masukkan suhu air: ");
        int a = in.nextInt();

        if (a <= 0) {
            System.out.println("air membeku");
        } else if (a > 0 && a <= 100) {
            System.out.println("air dalam keadaan cair");
        } else {
            System.out.println("air mendidih");
        }
    }
}
