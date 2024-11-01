package coding100days;

public class day61 {

    // Infinite Loop
    /* Infinite Loop atau perulangan tak berujung adalah
    perulangan yang terus berjalan tanpa henti karena kondisi perulangan selalu benar dan tidak ada mekanisme yang menghentikan perulangan.
    Infinite loop sering terjadi akibat kesalahan logika dalam penulisan kode, tetapi dalam beberapa kasus,
    infinite loop bisa sengaja digunakan untuk menjaga program tetap berjalan sampai intervensi manual
    (misalnya dalam aplikasi server atau program yang menunggu perintah). */

    public static void main(String[] args) {
        for (int i = 0; i < 5;) {
            System.out.println(i);
        }
        while (true) {
            System.out.println("aku suka singkong, kau suka keju");

        }
    }
}
