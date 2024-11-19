package coding100days;

public class day80 {
// String Method : trim()
/*  salah satu method pada class String di Java yang digunakan untuk menghapus spasi di awal dan di akhir dari sebuah string.
     Method ini tidak menghapus spasi di tengah string, hanya spasi yang ada di awal (leading space) dan akhir (trailing space). */
    
    public static void main(String[] args) {
    String x = "     dua tiga tutup botol     ";
     String y = x.trim();
    
        System.out.println("sebelum menggunakan method trim: "+x);
         System.out.println("sesudah menggunakan method trim: "+y);
    }
}
