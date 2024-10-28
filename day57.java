package coding100days;

import java.util.Scanner;

public class day57 {

    // Looping : while Increment
    /* digunakan untuk menjalankan perulangan selama kondisi yang diberikan bernilai true,
       dan setiap kali kondisi dipenuhi, nilai variabel kontrol akan ditingkatkan (increment) di dalam loop.
       Perulangan ini terus berlanjut hingga kondisi tidak lagi terpenuhi. */

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("masukkan angka yg mau di print, yaitu 1 sampai : ");
        int y = in.nextInt();
        int x = 1;
        while (x <= y) {
            System.out.println(x);
            x++;
        }
    }
}
