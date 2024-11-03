package coding100days;

public class day63 {
// Keyword : continue
/* digunakan untuk melewati iterasi saat ini dalam loop dan melanjutkan ke iterasi berikutnya.
    Berbeda dengan break yang keluar dari loop sepenuhnya,
    continue hanya mengabaikan eksekusi kode di bawahnya dalam loop untuk iterasi saat ini,
    tetapi tetap melanjutkan ke iterasi selanjutnya. 

    Soal: Cetaklah angka dari 1 hingga 5, tetapi melewati angka 3 (menggunakan for loop, while, do-while) */
    public static void main(String[] args) {
        for (int i = 1; i <= 5; i++) {
            if (i == 3) {
                continue;
            }
            System.out.print(i + " ");
        }
        System.out.println("====================================================");

        int a = 1;
        while (a <= 5) {
            if (a == 3) {
                a++;
                continue;
            }
            System.out.print(a + " ");
            a++;
        }
        System.out.println("====================================================");

        int x = 1;
        do {
            if (x == 3) {
                x++;
                continue;
            }
            System.out.print(x + " ");
            x++;
        } while (x <= 5);
        System.out.println("====================================================");
    }
}
