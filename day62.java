package coding100days;

public class day62 {
    // Keyword : break
    /* digunakan untuk menghentikan / keluar dari loop / blok kode tertentu sebelum perulangan / blok tersebut selesai dijalankan.
       Ketika break dieksekusi, program akan langsung keluar dari for, while, do-while, / switch yang sedang berjalan,
       dan melanjutkan eksekusi kode setelah loop / blok tersebut. */
    public static void main(String[] args) {
        for (int i = 1; i < 999; i++) {
            System.out.print(i);
            if (i == 5) {
                break;
            }
        }
        System.out.println(" for sudah di break oleh System");
        System.out.println("========================================================================");
        int x = 1;
        while (x <= 999) {
            System.out.print(x);
            x++;
            if (x == 6) {
                break;
            }
        }
        System.out.println(" while sudah di break oleh System");

        System.out.println("========================================================================");
        int y = 1;
        do {
            System.out.print(y);
            y++;
        } while (y <= 5);
            System.out.println(" do-while berhenti karna break/batasan tertentu dari kondisi while");
        
        System.out.println("========================================================================");
        int takdir = 2;
        switch (takdir) {
            case 1:
                System.out.println("AKU SUKA KAMU");
                break;
            case 2:
                System.out.println("KAMU SUKA DIA");
                break;
        }
    }
}
