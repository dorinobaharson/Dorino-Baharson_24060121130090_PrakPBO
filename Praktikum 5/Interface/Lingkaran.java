
/*
 * File : Lingkaran.java
 * Penulis : Dorino Baharson
 * tanggal : 3/30/2023
 * Deskripsi : kelas implementasi IArea berupa cara menghitung luas lingkaran
 */
package Interface;

import static java.lang.Math.PI;

public class Lingkaran implements IArea {
    public double jejari;

    public Lingkaran(double r){
        jejari = r;
    }

    public double hitungLuas(){
        return PI * jejari * jejari;
    }
    
}
