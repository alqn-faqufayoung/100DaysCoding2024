package coding100days;
 
public class day46 {
 
    public static void main(String[] args) {
 // Operator Logika : Negasi/kebalikan
 /* atau disebut juga NOT, digunakan untuk membalik nilai boolean. Jika suatu kondisi bernilai true,
         maka operator negasi akan mengubahnya menjadi false, dan sebaliknya. Operator ini hanya bekerja pada satu kondisi (unary operator).*/
        
        boolean Cinta = true;
        System.out.println("apakah anda mencintai dia = "+ Cinta+ " (Saya sangat mencintai Dia)");
        Boolean Suka = !Cinta;
        System.out.println("apakah dia Cinta kepadamu = "+ Suka+ " (Sayangnya, dia Berkata lain Alannnn, sadar diri woii)");
        
        boolean a = true;
        System.out.println("apakah Alan menyerah untuk memperjuangkan ISC = "+ a + (", Saya kurang bersemangat dan putus asa"));
        boolean b = !a;
        System.out.println("apakah anda benar-benar ingin menyerah = "+ b + (", Bersyukur teman-teman saya banyak yg menyemangati untuk bertahan..minimal jangan menyerah"));
       //Alay dikit  
 }
}
