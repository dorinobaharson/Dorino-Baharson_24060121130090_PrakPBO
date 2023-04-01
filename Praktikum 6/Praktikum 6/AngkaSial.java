/*
 * File : AngkaSial.java
 * Penulis : Dorino Baharson (1 April 2023)
 * Deskripsi : program penggunaan exception buatan sendiri pengenalan klausa 'throw' dan 'throws'
 */
public class AngkaSial {

    public void cobaAngka(int angka) throws AngkaSialException{
        if (angka == 13){
            throw new AngkaSialException();
        }else{
            System.out.println(angka+" bukan angka sial");
        }
    }
    public static void main(String[] args){
        AngkaSial as = new AngkaSial();
        try{
            as.cobaAngka(10);
            as.cobaAngka(13);
            as.cobaAngka(12);
    }catch (AngkaSialException ase){
        System.out.println(ase.getMessage());
        System.out.println("hati-hati dengan memasukkan angka ");
    }
}
}

//Pertanyaan 1 : Ketika eksepsi terjadi, apakah baris 12 pada AngkaSial.java di atas dieksekusi?
//Jawab : Tidak, karena baris 12 tidak akan dieksekusi jika terjadi eksepsi, sesuai dengan klausa if else maka akan langsung menuju ke 
//        blok catch yaitu mengikuti sesuai AngkaSialException.java lalu melaksanakan method .getMessage() lalu mengikuti code di klausa catch dan tidak melaksanakan baris 12.
//        lalu setelah melaksanakan yang terisi di dalam klausa catch, maka program akan selesei / berhenti 
//        baris 12 hanya akan dieksekusi jika cobaAngka(13) tidak ada di main atau ada method yang ditulis sebelum menulis method cobaAngka(13)

//Petanyaan 2 : Apakah baris 21 pada angkaSial.java di atas dieksekusi?
//Jawab : akan dieksekusi jika terjadi eksepsi jika tidak terjadi eksepsi tidak dieksekusi, ketika terjadi aksepsi, 
//        Ini karena ketika metode cobaAngka(13) melakukan throw AngkaSialException, 
//        sesuai dengan klausa if else maka akan segera dialihkan ke blok catch yang menangani pengecualian ini. 
//        Sisa pernyataan dalam blok try setelah pernyataan yang melempar pengecualian tidak akan dieksekusi.