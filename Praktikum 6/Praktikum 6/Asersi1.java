/*
 * File : Asersi2.java
 * Penulis : Dorino Baharson (1 April 2023)
 * Deskripsi : Program untuk menunjukkan asersi
 */

public class Asersi1{
    public static void main(String[] args){
        int x = -10;
        if(x>0){
            System.out.println("x bilangan positif");
        }else{
            assert(x<0):"ada kesalahan kode";
            System.out.println("x bilangan negatif");
        }
    }
}