package coding100days;

import java.util.Scanner;

public class day87 {
    // Mengubah Nilai Array satu dimensi pada index Tertentu

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int[] ar = {1, 2, 3, 4, 5, 6, 7, 8, 9};

        for (int i = 0; i < ar.length; i++) {
            System.out.println("indeks ke-" + i + ": " + ar[i]);
        }
        System.out.print("indeks ke berapa yg mau di ubah: ");
        int rubah = in.nextInt();
        System.out.print("dirubah menjadi: ");
        int ganti = in.nextInt();

        if (rubah >= 0 && rubah < ar.length) {
            ar[rubah] = ganti;
            System.out.println("hasil setelah perubahan: ");
            for (int i = 0; i < ar.length; i++) {
                System.out.println("Indeks ke-" + i + ": " + ar[i]);
            }
        }

    }
}
