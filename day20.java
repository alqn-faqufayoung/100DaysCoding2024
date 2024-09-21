package coding100days;

public class day20 {
//Tipe Data Reference : Byte
    /* kelas referensi yang menyimpan nilai tipe data byte dalam bentuk objek.
    Berguna ketika kamu membutuhkan objek byte untuk bekerja dengan koleksi objek atau
    menggunakan fungsi tambahan yang tidak tersedia di tipe primitif.
    */
    public static void main(String[] args) {
        Byte nilai_Referensi = 123;
        byte primitif = nilai_Referensi.byteValue();
        System.out.println(primitif);
    }
    
}
