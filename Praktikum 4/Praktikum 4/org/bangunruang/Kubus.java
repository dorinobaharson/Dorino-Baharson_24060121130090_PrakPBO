/*
 * File : Kubus.java
 * Penulis : Dorino Baharson
 * tanggal : 3/15/2023
 * Deskripsi : representasi dari objek kubus, turunan kelas BujurSangkar
 */

package org.bangunruang;

import org.bangundatar.BujurSangkar;

public class Kubus {
    private BujurSangkar permukaan;

    public Kubus(BujurSangkar permukaan){
        this.permukaan = permukaan;
    }

    public double hitungLuasAlas(){
        return this.permukaan.hitungLuas();
    }

    public double hitungVolume(){
        return this.permukaan.hitungLuas() * this.permukaan.getPanjangSisi();
    }
}
