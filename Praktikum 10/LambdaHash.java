/*
 * File : LambdaHash.java
 * Penulis : Dorino Baharson / 24060121130090
 * Tanggal : 31/05/2023
 * Deskripsi : Print Hashmap dengan lambda
 */

import java.util.HashMap;
import java.util.Map;

public class LambdaHash {
    public static void main(String[] args) {
        Map<String, String> mahasiswaMap = new HashMap<>();
        mahasiswaMap.put("24060121130090", "Tito");
        mahasiswaMap.put("24060121140012", "Rizky");
        mahasiswaMap.put("24060121141213", "Khapidsyah");

        mahasiswaMap.forEach((nim, nama) -> System.out.println( nim + ": " + nama));
    }
}
