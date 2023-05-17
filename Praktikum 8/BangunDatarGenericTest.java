/*
Nama : Dorino Baharson
NIM : 24060121130090
Tanggal : 17 Mei 2023
*File : BangunDatar.java
*Deskripsi : kelas main untuk kelas generic BangunDatarGeneric
*/

public class BangunDatarGenericTest {
    public static void main(String[] a){
        Lingkaran l = new Lingkaran(2);
        Segitiga s = new Segitiga(3);
        BangunDatarGeneric<BangunDatar> bdg = new BangunDatarGeneric<BangunDatar>();
        bdg.set(l);
        
        System.out.println("Keliling Lingkaran : "+bdg.hitungKeliling());
        System.out.println("Tipe Generic Lingkaran : "+ bdg.get().getClass().getName());

        bdg.set(s);
        System.out.println("Keliling Segitiga : "+bdg.hitungKeliling());
        System.out.println("Tipe Generic Segitiga : "+ bdg.get().getClass().getName());
    }
}
