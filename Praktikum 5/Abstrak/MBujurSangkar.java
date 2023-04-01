
/*
 * File : MBujurSangkar.java
 * Penulis : Dorino Baharson
 * tanggal : 3/30/2023
 * Deskripsi : kelas yang mengimplementasikan cara menghitung luas bujur sangkar
 */
package Abstrak;

import java.util.Scanner;

public class MBujurSangkar {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        BujurSangkar bs = new BujurSangkar();
        System.out.print("Masukkan sisi Bujur Sangkar: ");
        double sisi = scan.nextDouble();
        scan.close();

        System.out.println("Luas Bujur Sangkar dengan sisi " + sisi + " adalah " + bs.hitungLuas(sisi));
    }
}
