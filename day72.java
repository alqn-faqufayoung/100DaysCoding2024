package coding100days;

public class day72 {

    // Method Rekursif
    /* method yang memanggil dirinya sendiri sebagai bagian dari eksekusinya.
    Metode ini biasanya digunakan untuk menyelesaikan masalah yang dapat dipecah menjadi sub-masalah yang lebih kecil dan identik dengan masalah asli.
    Setiap pemanggilan method rekursif dilakukan pada masalah yang lebih kecil hingga mencapai kondisi basis (base case), yang menghentikan rekursi. */

    public static void main(String[] args) {
        int v1 = x(5);
        System.out.println("5+4+3+2+1 = "+v1);
    }
    public static int x(int v1) {
        if (v1 > 0) {
            return v1 + x(v1 - 1);
        } else {
            return 0;
        }
    }
}
