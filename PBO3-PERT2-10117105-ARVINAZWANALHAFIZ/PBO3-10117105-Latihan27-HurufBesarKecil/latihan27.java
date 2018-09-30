
import java.util.Scanner;

//NAMA  :Arvi Nazwan Alhafiz 
//NIM   :10117105    
//KELAS :IF-3

/**
 *
 * @author RIA FITRIANI
 */
public class latihan27 {
    public static void main(String[] args) {
        
//        deklarasi variabel
        String kalimat;
        String hBesar;
        String hKecil;
        Scanner scn = new Scanner(System.in);
        
        System.out.print("Masukkan Kalimat : ");
        kalimat = scn.nextLine(); // nextLine -> untuk input lebih dari 1 kata
        
        hBesar = kalimat.toUpperCase(); //ke format Kapital
        hKecil = kalimat.toLowerCase(); //ke format kecil
        
//        menampilkan hasil
        System.out.println("\n====Hasil Formatting====");
        System.out.println("Huruf Besar : "+ hBesar);
        System.out.println("Huruf Kecil : "+ hKecil);
        
    }
}
