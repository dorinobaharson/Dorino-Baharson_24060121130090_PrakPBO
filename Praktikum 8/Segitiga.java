public class Segitiga extends BangunDatar {
    private double sisi;

    public Segitiga(double sisi) {
        this.sisi = sisi;
    }

    public double hitungKeliling() {
        return sisi + sisi + sisi;
    }
}
