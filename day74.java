package coding100days;

import java.util.Scanner;

public class day74 {
    // String Method : length()
    /*  salah satu method di Java yang digunakan untuk mengetahui panjang sebuah string.
         Method ini mengembalikan jumlah karakter yang ada di dalam string,
          termasuk spasi dan simbol, tetapi tidak menghitung karakter null (\0). */

    // Soal: buatlah penghitungan biaya SMS yg di kirimkan oleh penginput. setiap huruf harganya Rp. 150.00
    
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        
        System.out.println("===== Selamat datang di System Penghitungan biaya SMS =====");
        System.out.println("    Silahkan masukkan pesan yang mau anda kirim: ");
        System.out.print("pesan: ");
        String pesan = in.nextLine();
        
        int jumlah = pesan.length();
        double pulsa = jumlah * 150.00;
        
        System.out.println("\n==================================================");
        System.out.println("jumlah ketikan: "+jumlah);
        System.out.println("jumlah yang harus di bayar: Rp. "+pulsa+"0");
    }
}
