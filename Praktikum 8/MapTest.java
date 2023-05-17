/*
Nama : Dorino Baharson
NIM : 24060121130090
Tanggal : 17 Mei 2023
*File : MapTest.java
*Deskripsi : program penggunaan objek map sebagai collection class
*/
import java.util.*;

public class MapTest {
    public static void main(String[] a){
        Map<Integer, String> map = new HashMap<Integer, String>();
        map.put(1, "satu");
        map.put(2, "dua");
        System.out.println(map.get(1));
        Set<Integer> key = map.keySet();
        /*Berikut merupakan cara iterasi untuk mengambil kesuluruhan kunci*/ 
        for (Integer i : key){
            System.out.println(map.get(i));
        }
    }
}
