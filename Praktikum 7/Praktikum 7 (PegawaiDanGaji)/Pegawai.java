/**
 * File      : Pegawai.java		03/05/23
 * Penulis   : Dorino Baharson (24060121130090)
 * Deskripsi : Pegawai.java adalah super kelas yang berisi Atribut dan Metode untuk Pegawai
 * 
 */

public class Pegawai{
    private String nama;
    private int gajiPokok = 5000000;
    public void setNama(String nama){
        this.nama = nama;
    }
    public void tampilData(){
        System.out.println("Nama Pegawai: "+this.nama + ", Gaji Pokok: "+this.gajiPokok);
    }

}
