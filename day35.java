package coding100days;
import java.util.Scanner;
public class day35 {
 
    public static void main(String[] args) {
    //Operator Aritmatika : Penjumlahan & Pengurangan 
         Scanner in = new Scanner (System.in);
        
          System.out.print("Berapa Nilai Cintamu Kepadanya = ");
           long Cintaku = in.nextLong();
        
            System.out.print("Berapa Nilai Bencimu Kepadanya = ");
             long Bencimu = in.nextLong();
         
     //Penjumlahan :
     long Sayang = Cintaku+Bencimu ;
     //Pengurangan :
     long Benci = Cintaku-Bencimu ;
        
      System.out.println("Penjumlahan : Cinta Dan Benci = " +Sayang);
       System.out.println("Pengurangan : Rasa Cinta Akan Kebencian = " +Benci);
        
 }
}
