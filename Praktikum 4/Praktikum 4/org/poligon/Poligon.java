/*
 * File : Poligon.java
 * Penulis : Dorino Baharson
 * tanggal : 3/15/2023
 * Deskripsi : Representasia dasar dari objek poligon (segi banyak)
 */
package org.poligon;

public class Poligon {
    protected int jumlahSisi;

    public Poligon() {
        this.jumlahSisi = 0;
    }

    public void setJumlahSisi(int sisi) {
        this.jumlahSisi = sisi;
    }

    public int getJumlahSisi() {
        return this.jumlahSisi;
    }
}
