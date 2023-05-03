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
