package coding100days;

import java.util.Scanner;

public class day45 {

    public static void main(String[] args) {
        // Operator Logika : OR
        /* - Operator OR (||) mengembalikan true jika setidaknya satu kondisi bernilai true.
           - Jika semua kondisi yang diuji bernilai false, maka hasil akhirnya adalah false.
        
        >> SOAL :
        - buatlah inputan dimana, ada 2 nilai ujian, bila Siswa tsb mendapatkan nilai kedua ujian tsb di bawah 80,
          maka akan mengulang matkul, dan jika salah 1 dari ujian tsb bisa mendapatkan nilai min 80+ maka siswa tsb tidak mengulang matkul*/
        Scanner in = new Scanner(System.in);

        System.out.print("nilai 1 = ");
        int a = in.nextInt();
        System.out.print("nilai 2 = ");
        int b = in.nextInt();

        System.out.println("apakah Alan tidak mengulang = "+ (a>=80 || b>=80)); // jika true maka tidak mengulang, dan jika false maka mengulang.

    }
}
