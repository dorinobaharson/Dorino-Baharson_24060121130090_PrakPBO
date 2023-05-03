/**
 * File      : Vehicle.java		03/05/23
 * Penulis   : Dorino Baharson (24060121130090)
 * Deskripsi : Vehicle.java adalah kelas yang berisi atribut dan metode dari superkelas vehicle
 * 
 */

public class Vehicle{
    void calRent(int distance, float price){
        float fare = distance * price;
        System.out.println("Vehicle Price: " + fare);
    }
}

