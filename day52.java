package coding100days;
 
import java.util.Scanner;

public class day52 {
    // Ternary :
    /* Ternary operator atau conditional operator dalam Java adalah cara singkat untuk menulis pernyataan if-else. 
     - penggolongan umur, 1-10 anak kecil, 11-20 remaja, 21-30 dewasa, 31-40 matang, 41-50 sepuh, dan 51 keatas lansia. */
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        
        System.out.print("Masukkan umur anda = ");
          int umur = in.nextInt();

        String kategori = (umur >= 1 && umur <= 10) ? "Anak Kecil" :
                          (umur >= 11 && umur <= 20) ? "Remaja" :
                          (umur >= 21 && umur <= 30) ? "Dewasa" :
                          (umur >= 31 && umur <= 40) ? "Matang" :
                          (umur >= 41 && umur <= 50) ? "Sepuh" :
                          (umur >= 51 && umur <= 100) ? "Lansia" :
                          "Umur tidak valid, masukkan umur anda dalam tahun!!";

        System.out.println("Kategori umur anda = "+ kategori);
  }
 }
