/**
 * File      : Sewa.java		03/05/23
 * Penulis   : Dorino Baharson (24060121130090)
 * Deskripsi : Sewa.java adalah main untuk menjalankan kelas yang sudah dibuat yaitu superkelas vehicle dan subkelas car dan bus
 * 
 */

public class Sewa {
    public static void main (String[] args){
        Vehicle kendaraan = new Vehicle();
        Vehicle mobil = new Car();
        Vehicle bus = new Bus();
        kendaraan.calRent(100, 5000.00f);
        mobil.calRent(100, 5000.00f);
        bus.calRent(100, 5000.00f);
    }
}
