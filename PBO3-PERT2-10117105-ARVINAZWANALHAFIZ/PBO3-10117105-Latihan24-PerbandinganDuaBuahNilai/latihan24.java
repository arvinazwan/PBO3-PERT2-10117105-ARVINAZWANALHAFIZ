
import java.util.Scanner;


//NAMA  :Arvi Nazwan Alhafiz 
//NIM   :10117105    
//KELAS :IF-3

/**
 *
 * @author RIA FITRIANI
 */
public class latihan24 {
     public static void main(String[] args) {
        
//        deklarasi variabel
        int n1;
        int n2;
        String lagi; //variabel pengontrol aktifitas
        Scanner scn = new Scanner(System.in);
        
        System.out.println("========Program Perbandingan Nilai========");
//        menggunakan looping do while
        do {            
            System.out.print("Masukkan nilai pertama : ");
            n1 = scn.nextInt();
            System.out.print("Masukkan nilai kedua : ");
            n2 = scn.nextInt();
            
//            rumus perbandingan
            if (n1 > n2) {
                System.out.println("Hasil : "+n1+" Lebih besar dari "+n2+"\n");
            }else if(n1 < n2){
                System.out.println("Hasil : "+n1+" Lebih kecil dari "+n2+"\n");
            }else
                System.out.println("Hasil : "+n1+" sama dengan "+n2+"\n");
                
//            ketikkan "Tidak" bila ingin berhenti aktifitas
            System.out.print("Ulangi Aktifitas ? (Ya/Tidak) : ");
            lagi = scn.next();
            
            System.out.println("");//memberi jarak satu baris
        } while (!lagi.equals("Tidak"));
    }
    
}
