/* /**
 * File      : MTitik.java		22/02/23
 * Penulis   : Dorino Baharson
 * Deskripsi : Kelas yang berisi main dari Titik
 * 
 */
class MTitik {
    public static void main(String[] args) {
        Titik t1 = new Titik();
        t1.setAbsis(1.0);
        t1.setOrdinat(2.0);

        Titik t2 = new Titik();
        t2.setAbsis(3.0);
        t2.setOrdinat(4.0);

        Titik t3 = new Titik(5.0, 6.0);

        int counterTitik = t1.getCounterTitik();

        System.out.println("Jumlah objek titik " + counterTitik);
        System.out.println("Titik 1: (" + t1.getAbsis() + ", " + t1.getOrdinat() + ")");
        System.out.println("Titik 2: (" + t2.getAbsis() + ", " + t2.getOrdinat() + ")");
        System.out.println("Titik 3: (" + t3.getAbsis() + ", " + t3.getOrdinat() + ")");
    }
}