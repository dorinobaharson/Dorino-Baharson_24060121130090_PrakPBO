/*
Nama : Dorino Baharson
NIM : 24060121130090
Tanggal : 17 Mei 2023
*File : lingkaran.java
*Deskripsi : kelas Lingkaran yang merupakan subclass dari BangunDatar
*/

public class Lingkaran extends BangunDatar {
    private double jejari;

    public Lingkaran(double jejari) {
        this.jejari = jejari;
    }

    public double hitungKeliling() {
        return 2 * 3.14 * jejari;
    }
}
