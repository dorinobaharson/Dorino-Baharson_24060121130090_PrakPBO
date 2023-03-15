/*
 * File : BujurSangkar.java
 * Penulis : Dorino Baharson
 * tanggal : 3/15/2023
 * Deskripsi : representasi dari objek BujurSangkar, turunan kelas poligon
 */

package org.bangundatar;

import org.poligon.Poligon;

public class BujurSangkar extends Poligon{
    private double panjangSisi;

    public BujurSangkar(double panjangSisi){
        this.panjangSisi = panjangSisi;
        this.jumlahSisi = 4;
    }

    public double hitungLuas(){
        return this.panjangSisi * this.panjangSisi;
    }

    public double getPanjangSisi(){
        return this.panjangSisi;
    }
}