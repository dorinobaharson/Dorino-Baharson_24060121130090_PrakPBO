/*
 * File : Segitiga.java
 * Penulis : Dorino Baharson
 * tanggal : 3/8/2022
 * Deskripsi : representasi dari objek segitiga, turunan kelas poligon
 */

package org.bangundatar;

import org.poligon.Poligon;

public class Segitiga extends Poligon{
    private double alas;
    private double tinggi;

    public Segitiga(double alas, double tinggi, int jumlahSisi) {
        this.jumlahSisi = jumlahSisi;
        this.alas = alas;
        this.tinggi = tinggi;
    }

    public double hitungLuas(){
        return (alas * tinggi) / 2;
    }

    public void printinfo(){
        System.out.println("Bangun Segitiga bersisi "+ this.getJumlahSisi());
    }
}
