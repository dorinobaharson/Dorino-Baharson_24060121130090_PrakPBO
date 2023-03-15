/*
 * File : MKubus.java
 * Penulis : Dorino Baharson
 * tanggal : 3/15/2023
 * Deskripsi : driver class untuk kubus 
 */

package org.main;

import org.bangundatar.*;
import org.bangunruang.*;

public class MKubus{
    public static void main(String[] args){
        Kubus kubus = new Kubus(new BujurSangkar(10));
        System.out.println("Luas Alas : " + kubus.hitungLuasAlas());
        System.out.println("Volume : " + kubus.hitungVolume());
    }
}