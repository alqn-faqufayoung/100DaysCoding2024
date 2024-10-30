import java.util.*;

public class day59 {
    // Looping : For Each
/* digunakan untuk mengiterasi elemen-elemen dari sebuah koleksi, seperti array, list, atau set.
    Ini adalah cara yang lebih sederhana dan bersih untuk melakukan iterasi
    dibandingkan dengan for loop standar ketika kita tidak memerlukan indeks atau kontrol langsung terhadap variabel iterasi. */

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("masukkan jumlah inputan angka = ");
        int jumlahElemen = in.nextInt();

        int[] ar = new int[jumlahElemen];

        for (int i = 0; i < jumlahElemen; i++) {
            System.out.print("masukkan elemen ke-" + (i + 1) + ": ");
            ar[i] = in.nextInt();
        }

        System.out.println("hasil inputan Elemen array = ");
        for (int x : ar) {
            System.out.print(x + " ");
        }
    }
}
