package coding100days;
 import java.util.Scanner;
  public class day34{
   public static void main(String[] args){
       //Input dari keyboard :
       //Dengan Scanner, kamu bisa dengan mudah mengambil berbagai jenis input dari pengguna sesuai kebutuhan program.

    Scanner in1 = new Scanner(System.in);
     System.out.print("Nama lengkap = ");
      String Nama = in1.nextLine();
        
         Scanner in2 = new Scanner(System.in);
          System.out.print("Umur Sekarang = ");
           int Umur = in2.nextInt();
        
             Scanner in3 = new Scanner(System.in);
              System.out.print("Alamat lengkap = ");
               String Alamat = in3.nextLine();
        
             System.out.printf("PERKENALKAN :%nNama Saya = %s Saya Berumur = %d Tahun & Alamat Saya =  %s%n",Nama,Umur,Alamat);

 }
}
