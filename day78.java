package coding100days;

import java.util.Scanner;

public class day78 {
    // String Method : equalsIgnoreCase()
    /*  salah satu method dari class String di Java yang digunakan untuk membandingkan dua string tanpa memperhatikan perbedaan huruf besar dan huruf kecil (case-insensitive).
         Ini berarti kedua string akan dianggap sama jika memiliki karakter yang sama, meskipun huruf besar dan kecilnya berbeda. */

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        // dari pengguna menyimpan pasword : EPEPsejati
        String kunci = "EPEPsejati";

        System.out.print("masukkan Pasword akun EpEp : ");
        String sandi = in.nextLine();

        if (sandi.equalsIgnoreCase(kunci)) {
            System.out.println("Selamat datang pecinta EpEp, anda berhasil log-in EpEp");
        } else if (sandi.length() < 8) {
            System.out.println("Pasword salah, minimal 8 Character");
        } else {
            System.out.println("Pasword salah");
        }
    }
}
