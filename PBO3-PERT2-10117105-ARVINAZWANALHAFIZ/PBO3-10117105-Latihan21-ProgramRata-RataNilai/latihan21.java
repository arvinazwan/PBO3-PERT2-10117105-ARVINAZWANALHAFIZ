
import java.util.Scanner;

//NAMA  :Arvi Nazwan Alhafiz 
//NIM   :10117105    
//KELAS :IF-3
//

/**
 *
 * @author RIA FITRIANI
 */
public class latihan21 {
     public static void main(String[] args) {
        
//        deklarasi variabel
        int nMhs;
        int nilaiMhs;
        double totalNilai;
        double rataNilai;
        //deklarasi untuk inputan scanner
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Masukkan Banyaknya Mahasiswa : ");
        nMhs = scanner.nextInt();
        
        totalNilai = 0; //inisialisasi total mahasiswa 0
//        looping sesuai dengan jumlah mahasiswa yang telah diinputkan
        for (int i = 1; i <= nMhs; i++) {
            System.out.print("Nilai Mahasiswa ke-"+i+" : ");
            nilaiMhs = scanner.nextInt();
            totalNilai += nilaiMhs; //menampung totall nilai mahasiswa
        }
        
//        rumus menghitung rata-rata nilai mahasiswa
        rataNilai = totalNilai/nMhs;
        System.out.println("\nMaka, Rata-rata Nilainya adalah "+rataNilai);
        System.out.println("Developed by: Teguh Siswanto");
        
        
    }
    
}
    

        
    
    
    
