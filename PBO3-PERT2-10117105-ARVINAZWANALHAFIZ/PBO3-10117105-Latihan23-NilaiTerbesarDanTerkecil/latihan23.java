
import java.util.Scanner;
//NAMA  :Arvi Nazwan Alhafiz 
//NIM   :10117105    
//KELAS :IF-3
//

/**
 *
 * @author RIA FITRIANI
 */
public class latihan23 {
    public static void main(String[] args) {
        
//        deklarasi variabel
        String petugas;
        int nMhs; //jumlah mahasiswa
        int nBesar;
        int nKecil;
        int nilaiMhs;
        Scanner scn = new Scanner(System.in);
        
        System.out.println("======Program Nilai Terbesar dan Terkecil Nilai "
                + "Mahasiswa======");
        
        System.out.print("Masukkan Nama Petugas : ");
        petugas = scn.next();
        
        System.out.print("Masukkan Banyaknya Mahasiswa : ");
        nMhs = scn.nextInt();
        
//        inisialisasi variabel
        nBesar = 0;
        nKecil = 100;
//        looping sesuai jumlahh mahasiswa
        for (int i = 1; i <= nMhs; i++) {
            System.out.print("Masukkan Nilai Mahasiswa ke-"+i+" = ");
            nilaiMhs = scn.nextInt();
            
            //menentukan nilai terbesar dan nilai terkecil
            nBesar = ((nBesar<=nilaiMhs)?nilaiMhs:nBesar);
            nKecil = ((nKecil>=nilaiMhs)?nilaiMhs:nKecil);
        }
        
//        menampilkan hasil dari nilai terbesar dan nilai terkecil
        System.out.print("\nNilai Terbesar adalah : "+ nBesar);
        System.out.println("\nNilai Terkecil adalah : "+ nKecil);
        
    }
}
