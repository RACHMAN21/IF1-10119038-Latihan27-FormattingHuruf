package if1.latihan27.formattinghuruf;

/**
 *
 * @author
 * NAMA  : Rachman Aldiansyah
 * KELAS : IF-1
 * NIM   : 10119038
 * Dekripsi Program : program ini berisi untuk menampilkan kalimat yang telah diformat
 * 
 */

import java.util.Scanner; // import kelas scanner

public class FormattingHuruf {
    static Scanner sc = new Scanner(System.in);
    
    public static String masukkanKalimat() {
        System.out.print("Masukkan Kalimat : ");
        return sc.nextLine();
    }
    
    public static void tampilKalimat(String kalimat) {
        System.out.println();
        System.out.println("=====Hasil Formatting=====");
        System.out.println("Huruf Besar : ".concat(kalimat.toUpperCase()));
        System.out.println("Huruf Kecil : ".concat(kalimat.toLowerCase()));
        System.out.println();
    }
    
    public static void main(String[] args) {
        tampilKalimat(masukkanKalimat());
        System.out.println("Developed by : Rachman Aldiansyah");
    }
}