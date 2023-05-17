/*
Nama : Dorino Baharson
NIM : 24060121130090
Tanggal : 17 Mei 2023
*File : ArrayListTest.java
*Deskripsi : program penggunaan objek arraylist sebagai collection class
*/
import java.util.ArrayList;

public class ArrayListTest{
    public static void main(String[] a){
        ArrayList<String> strings = new ArrayList<String>();
        strings.add("praktikum");
        strings.add("collection");
        strings.add("dan generics");
        strings.remove("praktikum");
        for (String s : strings){
            System.out.println(s+" ");
        }
    }
}