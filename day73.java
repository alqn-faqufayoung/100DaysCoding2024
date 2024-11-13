package coding100days;

public class day73 {
// String Method : charAt()
/* charAt() adalah salah satu method dari class String di Java yang digunakan
    untuk mengambil karakter tertentu dari sebuah string berdasarkan indeks.
     Indeks dimulai dari 0, jadi karakter pertama dalam string memiliki indeks 0,
      karakter kedua memiliki indeks 1, dan seterusnya. */

    public static void main(String[] args) {
        String myName = "ALAN";

        char A = myName.charAt(0);
         char L = myName.charAt(1);
          char N = myName.charAt(3);

        System.out.println("Perkenalkan, Nama saya adalah " + A + L + A + N);
         System.out.println("Saya dari kelas INFORMATIKA " + A + "24");
    }
}
