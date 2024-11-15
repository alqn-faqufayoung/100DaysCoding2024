package coding100days;

import java.util.Scanner;

public class day76 {
//   String Method : toUpperCase()
/*    salah satu method di Java yang digunakan untuk mengubah semua huruf dalam sebuah string menjadi huruf besar (uppercase).
       Sama seperti toLowerCase(), method ini tidak mengubah string asli,
        tetapi mengembalikan string baru yang semua hurufnya telah diubah menjadi huruf besar. */
    
    // Soal: rubahlah sebuah inputan huruf yg abstrak menjadi besar semua. 
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        
        System.out.println("Masukkan pesan abstrak dengan variasi huruf besar dan kecil: ");
         String pesan = in.nextLine();
        
        String besar = pesan.toUpperCase();
         System.out.println(besar);
 }
}
