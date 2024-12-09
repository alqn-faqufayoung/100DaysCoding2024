package coding100days;

import java.util.Scanner;

public class day99 {

    // Soal: Kalkulator sederhana
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String op;
        System.out.println("- Selamat Datang di Kalkulator Sederhana -");
        System.out.println("====================================================\n"
                + "A. Penambahan(+)\n"
                + "B. Pengurangan(-)\n"
                + "C. Perkalian(x)\n"
                + "D. Pembagian(:)\n"
                + "E. Modulus(%)\n");
        System.out.println("====================================================");

        do {
            System.out.print("Pilih Operasi Aritmatika: ");
            op = in.nextLine();

            System.out.println("====================================================");

            if (op.equalsIgnoreCase("A")) {
                System.out.print("-= Operasi Penambahan(+) =-\n");
                System.out.print("input angka: ");
                int x = in.nextInt();
                System.out.print(" + ");
                int y = in.nextInt();
                int z = x + y;
                System.out.println(x + " + " + y + " = " + z);
                System.out.println("====================================================");

                in.nextLine();
            } else if (op.equalsIgnoreCase("B")) {
                System.out.print("-= Operasi Pengurangan(-) =-\n");
                System.out.print("input angka: ");
                int x = in.nextInt();
                System.out.print(" - ");
                int y = in.nextInt();
                int z = x - y;
                System.out.println(x + " - " + y + " = " + z);
                System.out.println("====================================================");

                in.nextLine();
            } else if (op.equalsIgnoreCase("C")) {
                System.out.print("-= Operasi Perkalian(x) =-\n");
                System.out.print("input angka: ");
                int x = in.nextInt();
                System.out.print(" x ");
                int y = in.nextInt();
                int z = x * y;
                System.out.println(x + " x " + y + " = " + z);
                System.out.println("====================================================");

                in.nextLine();
            } else if (op.equalsIgnoreCase("D")) {
                System.out.print("-= Operasi Pembagian(:) =-\n");
                System.out.print("input angka: ");
                int x = in.nextInt();
                System.out.print(" : ");
                int y = in.nextInt();
                if (y != 0) {
                    int z = x / y;
                    System.out.println(x + " : " + y + " = " + z);

                } else {
                    System.out.println("Error: Pembagian dengan nol tidak diperbolehkan.");
                }
                System.out.println("====================================================");
                in.nextLine();
            } else if (op.equalsIgnoreCase("E")) {
                System.out.print("-= Operasi Modulus/Sisa bagi(%) =-\n");
                System.out.print("input angka: ");
                int x = in.nextInt();
                System.out.print(" % ");
                int y = in.nextInt();
                if (y != 0) {
                    int z = x % y;
                    System.out.println(x + " % " + y + " = " + z);
                } else {
                    System.out.println("Error: Pembagian dengan nol tidak diperbolehkan.");
                }
                System.out.println("====================================================");
                in.nextLine();
            } else if (op.equals("0")) {
                System.out.println("Kalkulator berhenti. Terima kasih.");
                break;
            } else {
                System.out.println("Input error, Pilih A, B, C, D, E atau 0 untuk keluar.");
            }
        } while (!op.equals("0"));
    }
}
