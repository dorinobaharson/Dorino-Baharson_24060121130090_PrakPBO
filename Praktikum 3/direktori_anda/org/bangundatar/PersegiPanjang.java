/*
 * File : PersegiPanjang.java
 * Penulis : Dorino Baharson
 * tanggal : 3/8/2022
 * Deskripsi : representasi dari objek persegi panjang, turunan kelas poligon
 */
package org.bangundatar;

import org.poligon.Poligon;

public class PersegiPanjang extends Poligon {
    private double panjang;
    private double lebar;
    
    public PersegiPanjang(double panjang, double lebar, int jumlahSisi) {
        this.panjang = panjang;
        this.lebar = lebar;
        this.jumlahSisi = jumlahSisi;
    }
    
    public double hitungLuas() {
        return panjang * lebar;
    }

    public void printinfo(){
        System.out.println("Bangun Persegi Panjang berisi "+this.getJumlahSisi());
    }
}