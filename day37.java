package coding100days;
 
import java.util.Scanner;

public class day37 {
 
    public static void main(String[] args) {
        // Operator Penugasan : Pengisian Nilai, Pengisian dan Penambahan, Pengisian dan Pengurangan
        Scanner in = new Scanner(System.in);
        
        // Pengisian Nilai :
        System.out.println("Silahkan isi Nilai di Bawah");
        System.out.println("-------------------------------------------------------");
        System.out.print("Nilai Tugas = ");
        int Tugas = in.nextInt();
        
        // Pengisian dan Penjumlahan :
        
        System.out.printf("%nPengisian dan Penjumlahan (1-10):%n");
        System.out.print("Nilai Keaktifan = ");
        byte Keaktifan = in.nextByte();
        Keaktifan += Tugas;
        System.out.printf("Nilai Tugas + Keaktifan = "+ Keaktifan +"%n");
        
        //Pengisian dan Pengurangan :
        
        System.out.printf("%nPengisian dan Pengurangan (1-20):%n");
        System.out.printf("Nilai Pelanggaran = ");
        int Pelanggaran = in.nextInt();
        Keaktifan -= Pelanggaran;
        System.out.printf("Nilai Tugas + Keaktifan - Pelanggaran = "+ Keaktifan +"%n");
  }
 }
