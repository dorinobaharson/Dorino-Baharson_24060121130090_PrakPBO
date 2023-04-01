/*
 * File : ExceptionOnArray.java
 * Penulis : Dorino Baharson (1 April 2023)
 * Deskripsi : Program penggunaan eksepsi menggunakan class library java
 */

import java.io.IOException;

public class ExceptionOnArray {
    public static void main(String[] args){
        Integer[] arrayInteger = new Integer[4];
        try{
            arrayInteger[2] = 11;
            arrayInteger[4] = 10;
            throw new IOException();
        }catch(ArrayIndexOutOfBoundsException exception){
            exception.printStackTrace();
        }catch(IOException exception){
            System.out.println("IOException caught");
        }finally{
            System.out.println("clean up code...");
        }
    }
}
