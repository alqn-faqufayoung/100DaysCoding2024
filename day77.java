package coding100days;

import java.util.Scanner;

public class day77 {
// String Method : equals()
/*  salah satu method dalam class String di Java yang digunakan untuk membandingkan dua string apakah sama atau tidak.
     Method ini membandingkan nilai konten dari dua string (karakter demi karakter), bukan membandingkan referensi memori objeknya. */

/*  Soal: buatlah program katasandi, katasandinya 1234abcd, bikin inputan dengam type data string,
          jika inputan sesuai maka (terhubung), jika salah (sandi salah), jika inputan di bawah 8 angka, maka tidak valid. */
    
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        // dari System firmware menyimpan pasword : 1234abcd
        String kunci = "1234abcd";

        System.out.print("masukkan Pasword WI-FI : ");
        String sandi = in.nextLine();

        if (sandi.equals(kunci)) {
            System.out.println("Terhubung ke WI-FI");
        } else if (sandi.length() < 8) {
            System.out.println("Pasword salah, minimal 8 Character");
        } else {
            System.out.println("Pasword salah");
        }
    }
}
