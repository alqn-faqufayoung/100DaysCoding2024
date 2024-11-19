package coding100days;

public class day79 {
    // String Method : toString()
    /*  method yang digunakan untuk mengubah suatu objek menjadi representasi string.
         Method ini sering digunakan di Java karena secara default,
          setiap objek di Java memiliki method toString() (method ini diwarisi dari class Object, superclass dari semua class di Java).
           Dalam konteks class String, method toString() hanya mengembalikan string itu sendiri.
            Namun, toString() sangat berguna ketika digunakan pada objek dari class lain yang memiliki data kompleks untuk dikonversi menjadi format string yang lebih mudah dibaca. */
    public static void main(String[] args) {
        
        String x = "aku suka singkong";
        String y = "kau suka keju";
        System.out.println(x.toString());
        String z = y.toString();
        System.out.println(z);
 }
}
