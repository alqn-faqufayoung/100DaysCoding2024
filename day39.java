package coding100days;
 
import java.util.Scanner;

public class day39 {
 
    public static void main(String[] args) {
        //Operator Penugasan : Pengisian dan Modulo 
        Scanner in = new Scanner(System.in);

        // Pengisian Nilai :
        System.out.print("Masukkan Jumlah Siswa/i : ");
        int Murid = in.nextInt();
        System.out.println("Jumlah Murid = " + Murid);

        // Pengisian dan Modulo :
        System.out.print("Masukkan nilai pembagi/Modulo (Permeja Muat Berapa Murid) : ");
        int Meja = in.nextInt();
        Murid %= Meja;
        System.out.println("Setelah modulo/Sisa Bagi, Jumlah Murid yg tidak mendapatkan Meja = " + Murid);
 }
}
