package coding100days;

public class day85 {
// Mengisi elemen ke Array satu dimensi pada saat di inisialisasi
/*  bisa langsung memberikan nilai kepada array tersebut saat deklarasi tanpa perlu mengisi satu per satu secara terpisah.
     Ini adalah cara yang paling efisien untuk membuat dan mengisi array. */
    public static void main(String[] args) {
        String[] lope = {"aku", "suka", "dia"};

        for (String cinta : lope) {
            System.out.println(cinta);
        }
        System.out.println("====================================================");
        System.out.println(lope[2] + " " + lope[1] + " " + lope[0]);
        System.out.println("====================================================");
        for (int i = 0; i < lope.length; i++) {
            System.out.println(lope[i]);
        }
    }
}
