package coding100days;

import java.util.Scanner;

public class day88 {

    /* Buat sebuah program menggunakan Java yang melakukan hal-hal berikut:
 1. Meminta user untuk menginput jumlah mahasiswa yang ingin didata.
 2. Meminta user untuk menginput nama mahasiswa satu per satu sebanyak jumlah yang diinputkan sebelumnya.
 3. Menyimpan nama-nama mahasiswa ke dalam array.
 4. Menampilkan daftar nama mahasiswa setelah semua data diinputkan. */

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("input jumlah mahasiswa yang ingin didata: ");
        int jum = in.nextInt();
        in.nextLine();

        String[] ar = new String[jum];
        
        System.out.println("====================================================");
        
        for (int i = 0; i < jum; i++) {
            System.out.print("masukkan nama mahasiswa ke-" + (i + 1) + ": ");
            ar[i] = in.nextLine();
        }
        
        System.out.println("====================================================");
        System.out.println("mahasiswa yang sudah di input: ");
        
        for (int i = 0; i < jum; i++) {
            System.out.println("nama mahasiswa ke-"+(i+1)+": "+ar[i]);

        }
    }
}
