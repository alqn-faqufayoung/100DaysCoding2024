package coding100days;

public class day96 {
// Asterisk Pattern : Diamond

    public static void main(String[] args) {
        byte x = 5;
        System.out.println("Pola Diamond");
        System.out.println("====================================================");
        for (int i = 1; i <= x; i++) {
            for (int j = 1; j <= (x - i); j++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= (2 * i - 1); j++) {
                System.out.print("*");
            }
            System.out.println();
        }
        for (int i = x - 1; i >= 1; i--) {
            for (int j = 1; j <= (x - i); j++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= (2 * i - 1); j++) {
                System.out.print("*");
            }
            System.out.println();
        }
        System.out.println("====================================================");
    }
}
