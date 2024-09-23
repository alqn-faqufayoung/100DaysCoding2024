package coding100days;
 
public class day22 {
 
    public static void main(String[] args) {
 // Tipe Data Reference : Integer 
 /* > Integer adalah tipe data referensi yang membungkus int.
    > bisa digunakan saat kita butuh fungsi tambahan
  atau menyimpan angka di tempat yang hanya menerima objek.
 */
 int besar = -12345;
 Integer panjang = 54321;
 
 Integer keras = besar+panjang;
 System.out.println("Besar dan Panjang = "+ keras + "cm");// tebu/bambu
 }
}
