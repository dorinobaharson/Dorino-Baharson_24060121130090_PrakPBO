public class Bus extends Vehicle{
    void calRent(int distance, float price){
        float fare = distance * price;
        fare = fare - 50.00f;
        System.out.println("Harga Sewa Bus: " + fare);
    }
}