package coding100days;

import java.util.Scanner;

public class day81 {

    // String Method : valueOf()
    /*  method dalam class String yang digunakan untuk mengubah berbagai jenis data menjadi String.
         Jadi, jika kamu punya angka, boolean, atau objek, dan ingin mengubahnya menjadi teks (string), kamu bisa menggunakan valueOf(). */

    public static int perkalian(int x) {
        return x * 999;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("masukkan nilai: ");
        int inAngka = in.nextInt();

        System.out.println("Sebelum pake valueOf(): " + perkalian(inAngka));

        int method = perkalian(inAngka);
        String konversi = String.valueOf(method) + ",Sekian";
        System.out.println("Sesudah pake valueOf(): " + konversi);

    }
}
