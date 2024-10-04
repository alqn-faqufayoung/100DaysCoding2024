package coding100days;
 
public class day33 {
 
    public static void main(String[] args) {
        /*Type Casting:
        proses mengonversi satu tipe data menjadi tipe data lain.
        
        - 1. Implicit Type Casting (Widening)
        Ini adalah konversi otomatis dari tipe data yang lebih kecil ke tipe data yang lebih besar,
        seperti dari int ke double. Proses ini dilakukan secara otomatis oleh Java karena tidak ada risiko kehilangan data.
        
        - 2. Explicit Type Casting (Narrowing)
        Ini adalah proses konversi manual dari tipe data yang lebih besar ke tipe data yang lebih kecil.
        Proses ini harus dilakukan secara eksplisit karena ada risiko kehilangan data atau presisi.
        
        NB: Type casting ini sangat berguna ketika kamu bekerja dengan tipe data yang berbeda,
        dan perlu memastikan nilai-nilai tersebut kompatibel saat menjalankan operasi.
        */
        
        // Contoh Casting implicit:
        byte manggaKecil = 123;
        int manggaBesar = manggaKecil;
        System.out.println("Casting implicit (dari byte ke int) = "+ manggaBesar);
        
        // Contoh Casting explicit:
        double apelKecil = 78.9;
        byte apelBesar = (byte)apelKecil;
        System.out.println("Casting explicit (dari double ke byte) = "+ apelBesar);

 }
}
