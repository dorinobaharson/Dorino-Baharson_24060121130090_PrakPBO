/**
 * File      : Bus.java		03/05/23
 * Penulis   : Dorino Baharson (24060121130090)
 * Deskripsi : Bus.java adalah kelas yang berisi atribut dan metode dari sub kelas bus
 * 
 */

public class Bus extends Vehicle{
    void calRent(int distance, float price){
        float fare = distance * price;
        fare = fare - 50.00f;
        System.out.println("Harga Sewa Bus: " + fare);
    }
}