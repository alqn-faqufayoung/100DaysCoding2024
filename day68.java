package coding100days;

import java.util.Scanner;

public class day68 {
    // Method Non-void
    /* method yang mengembalikan nilai setelah melakukan tugas tertentu. Tidak seperti method void yang tidak mengembalikan apapun,
       method non-void menggunakan tipe data tertentu sebagai pengembalian nilainya, seperti int, double, String, dan sebagainya.
       Kata kunci return digunakan dalam method non-void untuk mengirimkan nilai kembali ke pemanggil method. */

    public static int ngaritmatika(int x,int y) {
        int hasil = x + y - x * y / x;
        return hasil;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("masukkan 2 angka random untuk kami olah aritmatika: ");
        int a = in.nextInt();
        int b = in.nextInt();
        double hasil = ngaritmatika(a,b);
        System.out.println("contoh: " + a + " + " + b + " - " + a + " * " + b + " : " + a + " = " + hasil);
    }
}
