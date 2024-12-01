package coding100days;

import java.util.Scanner;

public class day91 {

    /* Buatlah program yang dapat menerima inputan bilangan dengan ketentuan sebagai berikut:
1. Jika nilai yang diinput adalah bilangan genap, maka program akan 
    menampilkan pesan genap dan kemudian meminta user untuk 
    memasukkan kembali angka.
2. Jika nilai yang diinput adalah ganjil, maka program akan menampilkan 
    pesan “You and I, end” dan tidak menerima inputan angka lagi */
    
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int nil;

        while (true) {
            System.out.print("Masukkan nilai: ");
            nil = in.nextInt();

            if (nil % 2 == 0) {
                System.out.println("Genap. Masukkan nilai lagi.");
            } else {
                System.out.println("You and I, end.");
                break;
            }
        }
    }
}
