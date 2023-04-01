/*
 * File : AngkaSialException.java
 * Penulis : Dorino Baharson (1 April 2023)
 * Deskripsi : Eksepsi buatan sendiri, menolak masukan angka 13!
 */

public class AngkaSialException extends Exception {
    public AngkaSialException(){
        super("Jangan Menggunakan Angka Sial");
    }
}
