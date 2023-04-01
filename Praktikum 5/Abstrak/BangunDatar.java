/*
 * File : BangunDatar.java
 * Penulis : Dorino Baharson
 * tanggal : 3/30/2023
 * Deskripsi : representasi dari objek Bangun Datar
 */

package Abstrak;

public abstract class BangunDatar {
    protected double luas;

    public abstract double hitungLuas(double sisi);

    public void setLuas(double luas){
        this.luas = luas;
    }

    public double getLuas(){
        return luas;
    }
    
}
