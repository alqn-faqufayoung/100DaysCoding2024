package coding100days;

public class day24 {
    
  public static void main(String[] args) {
   //Tipe Data Reference : Float 
     /*memiliki ukuran 32-bit dan bisa menyimpan angka desimal
     dalam rentang sekitar 1.4E-45 hingga 3.4028235E38 
        Gunakan Float ketika kamu butuh angka desimal dalam bentuk objek,
        misalnya saat bekerja dengan struktur data yang hanya bisa menyimpan objek (seperti ArrayList)
        atau ketika ingin memanfaatkan fitur tambahan dari class Float.
     */
     Float kecil = -9.9F;
     Float besar = 9.9F;
   
         Float kuecil = Float.MIN_VALUE;
         Float buesar = Float.MAX_VALUE;

     System.out.println("contoh angka yg bisa digunakan tipe data Float = " + kecil);
     System.out.println("contoh angka yg bisa digunakan tipe data Float = " + besar);
      
         System.out.println("Range terkecil dari tipe data Float = " + kuecil);
         System.out.println("Range terbesar dari tipe data Float = " + buesar);
