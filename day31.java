public class day31 {
 
 public static void main(String[] args) {
 //Konversi String ke Tipe Data Primitif
  //kita bisa mengonversi (mengubah) String ke berbagai tipe data primitif,csb:
  
String huruf = "SAYANG";
 String angka1 = "12";
  String angka2 = "1234";
   String angka3 = "123456";
    String angka4 = "12345678";
     String desimalA = "1.23";
      String desimalB = "1.23456789";
       String ganteng = "true";
        byte primByte = Byte.parseByte(angka1);
       short primShort = Short.parseShort(angka2);
      int primInt = Integer.parseInt(angka3);
     long primLong = Long.parseLong(angka4);
    float primFloat = Float.parseFloat(desimalA);
   double primDouble = Double.parseDouble(desimalB);
  char primChar = huruf.charAt(1);
 boolean primBoolean = Boolean.parseBoolean(ganteng);
System.out.println("Konfersi dr String ke byte = " + primByte);
 System.out.println("Konfersi dr String ke short = " + primShort);
  System.out.println("Konfersi dr String ke int = " + primInt);
   System.out.println("Konfersi dr String ke long = " + primLong);
    System.out.println("Konfersi dr String ke float = " + primFloat);
     System.out.println("Konfersi dr String ke double = " + primDouble);
      System.out.println("Konfersi dr String ke char = " + primChar);
       System.out.println("Konfersi dr String ke boolean = " + primBoolean);
 }
}
