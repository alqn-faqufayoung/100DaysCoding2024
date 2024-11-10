 
package coding100days;
 
import java.util.Scanner;

public class day70 {
    // Method Static
    /* method yang dapat dipanggil tanpa perlu membuat objek dari kelasnya.
       Method ini milik kelas itu sendiri, bukan milik objek individual dari kelas tersebut.
       Ketika method dideklarasikan dengan static, ia dapat diakses langsung menggunakan nama kelas
       dan dapat diakses dari method static lainnya, seperti main. */
 
    public static int sukali(int x, byte z) {
       return x%z;
    }
    public static void main(String[] args) {
                Scanner in = new Scanner(System.in);

        System.out.print("input angka random: ");
        int a = in.nextInt();

        System.out.print("mau di sisa bagi berapa: ");
        byte z = in.nextByte();
        
        int sisabagi = sukali(a,z);
        System.out.println(+a+" di sisa bagi "+z+" = "+sisabagi);
 }
}
