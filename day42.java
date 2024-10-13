package coding100days;
 
import java.util.Scanner;

public class day42 {
 
    public static void main(String[] args) {
        // Operator perbandingan = sama dengan dan tidak sama dengan :
         /* Sama Dengan (==): Operator ini digunakan untuk mengecek apakah nilai1 sama dengan nilai2. Jika sama, hasilnya true, jika tidak, false.
            Tidak Sama Dengan (!=): Operator ini digunakan untuk mengecek apakah nilai1 tidak sama dengan nilai2. Jika tidak sama, hasilnya true, jika sama, false.
         */
         Scanner in = new Scanner(System.in);
        
         System.out.print("Input nilai keberuntungan = ");
          int untung = in.nextInt();
        
             System.out.print("Input nilai kebejoan = ");
              int bejo = in.nextInt();
                 
                 boolean sama = (untung == bejo);
                  System.out.println("apakah nilai input keberuntungan dan bejo Sama = "+ sama);
                 
                     boolean sami = (untung != bejo);
                      System.out.println("apakah nilai input keberuntungan Tidak Sama dengan nilai kebejoan = "+ sami);
       
  }
 }
