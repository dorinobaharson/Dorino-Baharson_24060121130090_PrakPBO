/**
 * File      : PegawaiDanGaji.java		03/05/23
 * Penulis   : Dorino Baharson (24060121130090)
 * Deskripsi : PegawaiDanGaji.java adalah main untuk menjalankan metode dari superkelas pegawai dan keturunannya dan dependency payroll
 * 
 */

public class PegawaiDanGaji{
    public static void main(String args[]){
        Pegawai pegawai = new Programmer("Mira");
        Pegawai pegawai2 = new Manajer("Joko");
        Pegawai pegawai3 = new Manajer("Argo");

        Payroll payroll = new Payroll();
        payroll.cetakGaji(pegawai);
        payroll.cetakGaji(pegawai2);
        payroll.cetakGaji(pegawai3);
    }
}