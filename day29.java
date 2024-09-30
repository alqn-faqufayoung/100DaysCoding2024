package coding100days;
 import java.math.BigInteger;
  public class day29 {
    //Tipe Data Reference : BigInteger 
     /*Tipe data ini ada di dalam paket java.math dan digunakan ketika kita perlu bekerja dengan angka-angka yang sangat besar tanpa batasan ukuran,
     seperti dalam kriptografi atau perhitungan ilmiah.& merupakan bagian dari Tipe Data Reference. */
    
    public static void main(String[] args) {
        
        BigInteger A = new BigInteger("-999999999999999999999999999999");
        BigInteger B = new BigInteger("999999999999999999999999999999");
        
        System.out.println("Nilai Big Integer 1 = " + A);
        System.out.println("Nilai Big Integer 1 = " + B);
 }
}
