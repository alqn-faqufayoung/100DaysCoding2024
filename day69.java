package coding100days;

import java.util.Scanner;

public class day69 {
    // Method Parameter
    /* nilai atau argumen yang dilewatkan ke dalam method saat dipanggil.
       Parameter memungkinkan kita untuk mengirim data atau informasi ke method,
       sehingga method dapat beroperasi berdasarkan data yang diterimanya.
       Ini memberikan fleksibilitas pada method agar dapat berfungsi dengan berbagai input. */

    public static int sukali(int angkaA, int angkaB) {
        return angkaA * angkaB;
    }

    public int subagi(int angkaX, int angkaY) {
        return angkaX / angkaY;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("input angka pertama: ");
        int a = in.nextInt();
        System.out.print("input angka kedua: ");
        int b = in.nextInt();

        System.out.println("====================================================");
        double perkalian = sukali(a, b);
        System.out.println("perkalian " + a + " x " + b + " = " + perkalian);
        day69 tes = new day69();
        double pembagian = tes.subagi(a, b);
        System.out.println("pembagian " + a + " : " + b + " = " + pembagian);
    }
}
