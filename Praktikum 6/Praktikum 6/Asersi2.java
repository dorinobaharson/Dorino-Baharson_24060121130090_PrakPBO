/*
 * File : Asersi2.java
 * Penulis : Dorino Baharson (1 April 2023)
 * Deskripsi : Program untuk demo asersi, yang akan menolak input jari jari yang bernilai nol
 */

class Lingkaran{
    private double jariJari;
    public Lingkaran(double jariJari){
        this.jariJari = jariJari;
    }
    public double hitungKeliling(){
        double keliling = 2*Math.PI*jariJari;
        return keliling;
    }
}

public class Asersi2 {
    public static void main(String[] args){
        double jariJari = 5;
        assert (jariJari>0):"jari-jari tidak boleh nol!!!";
        Lingkaran l = new Lingkaran(jariJari);
        double kelilingLingkaran = l.hitungKeliling();
        System.out.println("Keliling lingkaran = "+kelilingLingkaran);
    }
}
// Pertanyaan : secara konsep, ada yang kurang tepat pada program Asersi2 di atas? 
// Jawab : Secara penulisan kode tidak ada yang salah dari penulisan diatas namun Secara konsep, ada yang kurang tepat yaitu asersi dapat berguna untuk memeriksa asumsi selama debugging dan pengujian, 
//         mereka tidak dimaksudkan untuk digunakan sebagai mekanisme untuk penanganan kesalahan dalam kode produksi atau bisa disebut implementasi.
//         Dalam kode produksi, umumnya disarankan untuk menggunakan mekanisme penanganan 
//         pengecualian atau biasa disebut exception yang sesuai untuk menangani kesalahan dan kondisi yang tidak terduga yang mungkin terjadi selama eksekusi program. Asersi dapat 
//         dinonaktifkan atau dihapus sepenuhnya ketika program diterapkan di produksi untuk meminimalkan dampaknya pada kinerja. 
//         Perlu dicatat bahwa asersi biasanya digunakan untuk tujuan debugging dan pengujian dan seharusnya tidak digunakan untuk penanganan kesalahan dalam kode produksi. Dalam kode produksi, 
//         disarankan untuk menggunakan mekanisme penanganan kesalahan yang sesuai yaitu eksepsi, untuk menangani kesalahan dan kondisi yang tidak terduga yang mungkin terjadi selama eksekusi program
//         karena konsep dari asersi merupakan bukan bagian dari implementasi digunakan untuk keperluan debugging, semestinya tidak digunakan untuk mengubah state dari objek







