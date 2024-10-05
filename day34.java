package coding100days;
 import java.util.Scanner;
  public class day34{
   public static void main(String[] args){
     //Input dari keyboard :
      //Dengan Scanner, kamu bisa dengan mudah mengambil berbagai jenis input dari pengguna sesuai kebutuhan program.

    Scanner in = new Scanner(System.in);
    
     System.out.print("Nama lengkap = ");
      String Nama = in.nextLine();
        
         System.out.print("Umur Sekarang = ");
          int Umur = in.nextInt();
          
             in.nextLine(); // membersihkan buffer sebelum mengambil input String berikutnya
              System.out.printf("Alamat lengkap = ");
               String Alamat = in.nextLine();
               
                 System.out.println(" ");
                  System.out.printf("PERKENALKAN :%nNama Saya = %s Saya Berumur = %d Tahun & Alamat Saya =  %s%n",Nama,Umur,Alamat);

 }
}
