package coding100days;

import java.util.Scanner;

public class day75 {
    // String Method : toLowerCase()
    /*  salah satu method pada class String di Java yang digunakan untuk mengubah semua huruf dalam string menjadi huruf kecil.
         Method ini tidak mengubah string asli, melainkan mengembalikan string baru yang sudah diubah menjadi huruf kecil. */
    
    // Soal: rubahlah sebuah inputan huruf yg abstrak menjadi kecil semua.
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        
        System.out.println("Masukkan pesan abstrak dengan variasi huruf besar dan kecil: ");
         String pesan = in.nextLine();
        
        String kecil = pesan.toLowerCase();
         System.out.println(kecil);
 }
}
