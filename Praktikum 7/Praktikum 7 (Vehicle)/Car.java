/**
 * File      : Car.java		03/05/23
 * Penulis   : Dorino Baharson (24060121130090)
 * Deskripsi : Car.java adalah kelas yang berisi atribut dan metode dari sub kelas car
 * 
 */

public class Car extends Vehicle{
    void calRent(int jarak, float harga){
        float fare = jarak * harga;
        fare = fare - 100.00f;
        System.out.println("Harga Sewa Mobil: " + fare);
    }
}
