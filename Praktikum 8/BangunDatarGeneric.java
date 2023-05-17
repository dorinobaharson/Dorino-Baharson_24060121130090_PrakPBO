/*
Nama : Dorino Baharson
NIM : 24060121130090
Tanggal : 17 Mei 2023
*File : BangunDatarGeneric.java
*Deskripsi : kelas generic BangunDatarGeneric yang memiliki tipe parameter
*/
public class BangunDatarGeneric<T extends BangunDatar> {
    private T bangunDatar;

    public void set(T tipeBangunDatar){
        bangunDatar = tipeBangunDatar;
    }

    public T get(){
        return bangunDatar;
    }

    public double hitungKeliling(){
        return bangunDatar.hitungKeliling();
    }
}

/*public class BangunDatarGeneric<T1 extends BangunDatar> {
    private T1 bangunDatar;

    public void set(T1 tipeBangunDatar){
        bangunDatar = tipeBangunDatar;
    }

    public T1 get(){
        return bangunDatar;
    }

    public double hitungKeliling(){
        return bangunDatar.hitungKeliling();
    }
}
Kesimpulan : Perubahan pada variabel T menjadi T1 atau pun
             variabel dengan nama lain tidak menyebabkan
             error pada code tetapi tidak sesuai dengan
             penamaan konvensi yang telah distandarisasi sehingga
             secara code tidak ada kesalahan dan tetap bisa di run, 
             hanya tidak standar konvensi 
             yang akan menyebabkan orang lain mungkin tidak
             mengerti apa yang kita lakukan / deklarakasikan
*/