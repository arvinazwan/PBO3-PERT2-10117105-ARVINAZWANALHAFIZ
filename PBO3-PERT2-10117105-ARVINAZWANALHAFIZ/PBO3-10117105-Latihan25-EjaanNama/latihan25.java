

import java.util.Scanner;

//NAMA  :Arvi Nazwan Alhafiz 
//NIM   :10117105    
//KELAS :IF-3

/**
 *
 * @author RIA FITRIANI
 */
public class latihan25 {
    public static void main(String[] args) {
        
//        deklarasi variabel
        String nama;
        int panjang; // variabel untuk menampung jumlah huruf 
        char huruf; //menampung satu karakter
        Scanner scn = new Scanner(System.in);
        
        System.out.print("Masukkan nama depan Anda untuk dieja : ");
        nama = scn.next();
        panjang = nama.length(); //jumlah huruf akan digunakan dalam looping
        
        System.out.println("\nEjaan untuk "+" \""+nama+"\" adalah : ");
        /*
        * Jangan gunakan i <= panjang, karena akan 'string index out of range'
        */
//        proses looping per huruf
        for (int i = 0; i < panjang; i++) {
            System.out.println("Huruf ke-"+(i+1)+" : "+nama.charAt(i));
        }
    }
    
}
    

