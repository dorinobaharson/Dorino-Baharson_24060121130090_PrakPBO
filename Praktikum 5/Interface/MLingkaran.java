package Interface;

import java.util.Scanner;

public class MLingkaran {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.print("Masukkan jejari: ");
        double jejari = scan.nextDouble();
        Lingkaran l = new Lingkaran(jejari);
        scan.close();

        System.out.println("Luas lingkaran dengan sisi " + l.jejari + " adalah " +l.hitungLuas());
    }
}
