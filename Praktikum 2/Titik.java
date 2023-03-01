/* /**
 * File      : Titik.java		22/02/23
 * Penulis   : Dorino Baharson
 * Deskripsi : Kelas yang berisi Method dari Titik
 * 
 */
class Titik {
    //atribut
    private double absis;
    private double ordinat;
    private static int counterTitik;

    //overload constructor baru
    Titik(double x, double y) { //karena ada parameternya maka bisa diakses langsung di main
        absis = x;
        ordinat = y;
        counterTitik++;
    }

    Titik() { 
        absis = 0;
        ordinat = 0;
        counterTitik++;
    }

    public void setAbsis(double a) {
        absis = a;
    }

    public void setOrdinat(double o) {
        ordinat = o;
    }

    public double getAbsis() {
        return absis;
    }

    public double getOrdinat() {
        return ordinat;
    }

    public static int getCounterTitik() {
        return counterTitik;
    }
}
