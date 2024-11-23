package coding100days;

public class day83 {
//  Membuat Objek Array satu dimensi

    /* Membuat array satu dimensi di Java berarti membuat sebuah struktur data yang dapat menyimpan sejumlah elemen dengan tipe data yang sama.
    Array digunakan untuk menyimpan beberapa nilai dalam satu variabel. */

    public static void main(String[] args) {
        int[] ar = new int[5];

        ar[0] = 12;
         ar[1] = 23;
          ar[2] = 34;
           ar[3] = 45;
            ar[4] = 56;

        System.out.println("isi array: " + ar[0]);
         System.out.println("isi array: " + ar[1]);
          System.out.println("isi array: " + ar[2]);
           System.out.println("isi array: " + ar[3]);
            System.out.println("isi array: " + ar[4]);

        System.out.println("====================================================");

        for (int i = 0; i < ar.length; i++) {
            System.out.println("isi array pada indeks ke " + (i + 1) + " : " + ar[i]);
        }
    }
}
