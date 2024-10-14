package coding100days;
 
import java.util.Scanner;

public class day43 {

    public static void main(String[] args) {
        // Operator Perbandingan : Lebih besar sama dengan dan lebih kecil sama dengan 
         /*
          >> Lebih Besar Sama Dengan (>=): Operator ini digunakan untuk mengecek apakah nilai1 lebih besar atau sama dengan nilai2. Jika ya, hasilnya true, jika tidak, false.
           >> Lebih Kecil Sama Dengan (<=): Operator ini digunakan untuk mengecek apakah nilai1 lebih kecil atau sama dengan nilai2. Jika ya, hasilnya true, jika tidak, false. */
            Scanner in = new Scanner(System.in);

         System.out.print("Persentase Kamu Suka Dia = ");
          int Suka = in.nextInt();
         System.out.print("Persentase Dia Suka kamu = ");
          int Dia = in.nextInt();

         // Operasi Lebih Besar sama dengan (>=) :
         System.out.println("Apakah Cintamu kepadanya lebih Besar atau sama ="+ (Suka>=Dia));
         // Operasi Lebih Kecil sama dengan (<=) :
         System.out.println("Apakah Cintamu kepadanya lebih Kecil atau sama ="+ (Suka<=Dia));

         // NB: Cinta nggak harus Memiliki!!  Memandangi, mengagumi, sadar diri.. Mending lanjut nguli (emot batu).
  }
 }
