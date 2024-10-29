package coding100days;

import java.util.Scanner;

public class day58 {
    // Looping : while Decrement

    /* adalah perulangan di mana nilai variabel kontrol dikurangi (decrement) pada setiap iterasi.
    Perulangan ini terus berlangsung selama kondisi yang diberikan tetap true, dan nilai variabel kontrol berkurang setiap kali loop dieksekusi.
    Decrement biasanya dilakukan dengan i-- (mengurangi 1) atau dengan nilai tertentu, seperti i -= 2, i -= 3, dan sebagainya. */
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("masukkan angka yg mau di print mundur sampai 0 : ");
        int x = in.nextInt();
        int y = 0;
        while (x >= y) {
            System.out.println(x);
            x--;
        }
    }
}
