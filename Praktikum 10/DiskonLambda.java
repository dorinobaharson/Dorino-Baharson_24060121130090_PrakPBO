/*
 * File : DiskonLambda.java
 * Penulis : Dorino Baharson / 24060121130090
 * Tanggal : 31/05/2023
 * Deskripsi : Menghitung diskon dengan lambda
 */

interface IDiskon{
    public double hitungDiskon(int harga);
}

public class DiskonLambda {
    public static void main(String[] args){
        IDiskon diskonMerdeka = new IDiskon(){
            public double hitungDiskon(int harga){
                return harga - (harga * 0.3);
            }
        };
        IDiskon diskonLebaran = (harga) -> harga - (harga * 0.4);
        IDiskon diskonBiasa = (harga) -> {
            return harga - (harga * 0.1);
        };
        System.out.println("diskon merdeka: " + diskonMerdeka.hitungDiskon(100000));
        System.out.println("diskon lebaran: " + diskonLebaran.hitungDiskon(100000));
        System.out.println("diskon biasa: " + diskonBiasa.hitungDiskon(100000));
    }
}
