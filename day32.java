package coding100days;
 
public class day32 {
 
    public static void main(String[] args) {
    //Konversi Data Primitif ke String 
        
 byte byte1 = 123;
  short short2 = 12345;
   int int3 = 1234567;
    long long4 = 123456789;
     float float5 = 1.234f;
      double double6 = 1.234567890;
       char char7 = 'A';
        boolean boolean8 = true;

        String pengonfersianByte = String.valueOf(byte1);
       String pengonfersianShort = String.valueOf(short2);
      String pengonfersianInt = String.valueOf(int3);
     String pengonfersianLong = String.valueOf(long4);
    String pengonfersianFloat = String.valueOf(float5);
   String pengonfersianDouble = String.valueOf(double6);
  String pengonfersianChar = String.valueOf(char7);
 String pengonfersianBoolean = String.valueOf(boolean8);
        
System.out.println("Konfersi dr byte ke String = " + pengonfersianByte);
 System.out.println("Konfersi dr short ke String = " + pengonfersianShort);
  System.out.println("Konfersi dr int ke String = " + pengonfersianInt);
   System.out.println("Konfersi dr long ke String = " + pengonfersianLong);
    System.out.println("Konfersi dr float ke String = " + pengonfersianFloat);
     System.out.println("Konfersi dr double ke String = " + pengonfersianDouble);
      System.out.println("Konfersi dr char ke String = " + pengonfersianChar);
       System.out.println("Konfersi dr boolean ke String = " + pengonfersianBoolean);
  }
 }
