package coding100days;

 import java.math.BigDecimal;

public class day30 {
 
    public static void main(String[] args) {
//Tipe Data Reference : BigDecimal
     /* digunakan untuk merepresentasikan angka desimal dengan presisi tinggi.
     Ini sangat berguna untuk perhitungan keuangan atau ilmiah di mana ketepatan sangat penting,
     misalnya untuk mata uang atau angka yang sangat besar atau sangat kecil.
     */
     BigDecimal nasi = new BigDecimal ("123.4567890");
     BigDecimal gandum = new BigDecimal ("234.5678901");
     
        BigDecimal Penjumlahan = nasi.add(gandum);
        BigDecimal Pengurangan = nasi.subtract(gandum);
        BigDecimal Perkalian = nasi.multiply(gandum);
     
     
     
        System.out.println("Jumlah kalori pada nasi = "+ nasi);
        System.out.println("Jumlah kalori pada gandum = "+ gandum);
        System.out.println("Contoh pengoperasian Aritmatika = ");
        System.out.println("Penjumlahan: (nasi+gandum) = " + Penjumlahan);
        System.out.println("Pengurangan: (nasi-gandum) = " + Pengurangan);
        System.out.println("Perkalian: (nasi*gandum) = " + Perkalian);
 }
}
