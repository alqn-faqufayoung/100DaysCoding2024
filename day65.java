package coding100days;

import java.util.Scanner;

public class day65 {
    // Nested Loop
    /* Nested loop adalah konsep di mana sebuah loop berada di dalam loop lain. Ini berarti kita memiliki loop di dalam loop,
    dan perulangan di dalam loop yang paling dalam akan selesai sebelum perulangan di loop luar lanjut ke iterasi berikutnya.
    
    Contoh soal: buatlah 3 inputan untuk memasukkan nama gedung, jumlah lantai, dan jumlah ruangan, dan printkan hasilnya */
    
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("masukkan nama gedung: ");
        String gedung = in.nextLine();

        System.out.print("ada berapa lantai dalam gedung " + gedung + ": ");
        int lantai = in.nextInt();

        System.out.print("ada berapa ruangan dalam tiap lantai: ");
        int ruang = in.nextInt();
        System.out.println("====================================================");

        if (lantai == 0 && ruang == 0) {
            System.out.println("lantai dan ruangan kosong");
        } else if (lantai >= 1 && ruang >= 1) {
            System.out.println("Gedung " + gedung + " memiliki " + lantai + " lantai, dan terdapat " + ruang + " ruangan: ");
        } else {
            System.out.println("masukkan angka yg falid, misal 1+");
        }
        for (int x = 1; x <= lantai; x++) {
            for (int y = 1; y <= ruang; y++) {
                System.out.println("lantai " + x + ": " + "ruangan " + y);
            }
        }
    }
}
