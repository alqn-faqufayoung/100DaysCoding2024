package coding100days;

import java.time.LocalTime;
import java.util.Scanner;

public class day100 {
/* Buatlah program Java yang meminta pengguna untuk memasukkan nama mereka,
    kemudian memberikan salam berdasarkan waktu saat ini. */
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        LocalTime now = LocalTime.now();
        System.out.println("====================================================");
        System.out.print("Hayy,.. Nama kamu siapa = ");
        String x = in.nextLine();
        System.out.println(">>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>");
        if (now.isBefore(LocalTime.of(12, 0))) {
            System.out.println("Selamat pagi " + x + " Program anda telah selesai ");
            System.out.println("====================================================");
        } else if (now.isBefore(LocalTime.of(17, 0))) {
            System.out.println("Selamat siang " + x + " Program anda telah selesai ");
            System.out.println("====================================================");
        } else {
            System.out.println("Selamat malam " + x + " Program anda telah selesai ");
            System.out.println("====================================================");
        }
    }
}
