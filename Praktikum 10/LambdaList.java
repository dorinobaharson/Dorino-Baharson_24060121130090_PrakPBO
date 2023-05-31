/*
 * File : LambdaList.java
 * Penulis : Dorino Baharson / 24060121130090
 * Tanggal : 31/05/2023
 * Deskripsi : Print list dengan lambda
 */
import java.util.ArrayList;

public class LambdaList{
    public static void main(String[] args){
        ArrayList<String> mahasiswaList = new ArrayList<String>();
        mahasiswaList.add("Tito");
        mahasiswaList.add("Rizky");
        mahasiswaList.add("Khapidsyah");

        mahasiswaList.forEach((n) -> System.out.println(n));
    }
}