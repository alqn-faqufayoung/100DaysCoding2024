package coding100days;
 
public class day23 {
 
    public static void main(String[] args) {
// Tipe Data Reference : Long
/*fungsi hampir sama seperti long,
dan juga stelah pengisian angka harus di kasih tanda L, 
supaya system tau bahwa kita menggunakan tipe data Long
*/
Long kecil = -9223372036854775808L;
Long besar = 9223372036854775807L;

//bisa juga menggunakan fiturnya Long, contoh sbg brikut :
Long KECIL = Long.MIN_VALUE;
Long BESAR = Long.MAX_VALUE;

System.out.println("nilai paling kecil dari tipe data Long = " + kecil);
System.out.println("nilai paling besar dari tipe data Long = " + besar);

System.out.println("nilai paling besar dari tipe data Long = " + KECIL);
System.out.println("nilai paling besar dari tipe data Long = " + BESAR);
 }
}
