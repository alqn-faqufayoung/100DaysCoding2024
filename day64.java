package coding100days;

public class day64 {

    // break label
    /* digunakan untuk menghentikan loop bersarang (nested loop) yang berada di dalam lebih dari satu loop.
       Dengan menggunakan label, kita dapat menghentikan beberapa loop sekaligus dan keluar dari loop yang ditandai dengan label tersebut.
       Tanpa label, break hanya akan menghentikan loop yang paling dalam (loop terdekat). */

    public static void main(String[] args) {
        for (int i = 1; i <= 99; i++) {
            for (int j = 1; j <= 99; j++) {
                if (j == 6) {
                    break;
                }
                System.out.println("i= " + i + " j= " + j);
            }
            if (i == 5) {
                break;
            }
        }
        System.out.println(" ");
        System.out.println("====================================================");
        x:
        for (int x = 1; x <= 99; x++) {
            for (int y = 1; y <= 5; y++) {
                if (x <= 5 && y <= 5) {
                    break x;
                }
                System.out.println("x= " + x + " y= " + y);
            }
        }
        System.out.println(" ");
    }
}
